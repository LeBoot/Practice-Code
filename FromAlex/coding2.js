class Family {
   history = [];
   constructor(name, tipCalcFn, initialBills=undefined) {
      this.name = name;
      this.tipCalcFn = tipCalcFn;
      if (initialBills) {
         this.addAllBills(initialBills);
      }
   }

   _genericTipCalculator = (fn, bill) => {
      const b = bill >= 0 ? bill : -bill;
      let tip = fn(bill)
      let total = bill + tip;
      return {bill, tip, total};
   }

   addABill(bill) {
      const btt = this._genericTipCalculator(this.tipCalcFn, bill);
      this.history.push(btt);
   }

   addAllBills(bills) {
      for (const b of bills) {
         this.addABill(b);
      }
   }

   calcAverageTip() {
      let sum = 0;
      for (const billTipTotal of this.history) {
         sum += billTipTotal.tip;
      }
      let avg = sum / this.history.length;
      return avg.toFixed(2);
   }
}

function determineHighest(...families) {
   let max = 0;
   let winner;
   for (const f of families) {
      if (f.calcAverageTip() > max) {
         max = f.calcAverageTip();
         winner = f;
      }
   }
   return winner;
}

const johnsTipCalc = b => {
   if (b < 50) {return tip = b * .2;}
   if (b >= 50 && b <= 200) {return tip = b * .15;}
   return tip = b * .1;
}

const marksTipCalc = b => {
   if (b < 100) {return tip = b * .2;}
   if (b >= 100 && b <= 300) {return tip = b * .1;}
   return tip = b * .25;
}

const johnsBills = [124, 48, 268, 180, 42];
const marksBills = [77, 375, 110, 45];

const john = new Family("John", johnsTipCalc, johnsBills);
const mark = new Family("Mark", marksTipCalc, marksBills);

const winner = determineHighest(john, mark);
const msg = `${winner.name} paid the highest average tip, which was \$${winner.calcAverageTip()}`;
alert(msg);