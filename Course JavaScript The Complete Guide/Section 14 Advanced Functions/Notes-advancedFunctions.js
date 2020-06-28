//Advanced Functions ============================================

/*
  - A pure function always produces the same output for a given input, and it causes no side effects.
  - A side effect changes something outside of the function.
  - Every function in JavaScript is a closure, because it encloses the values it stores.
*/

//Factory functions are functions that return functions ----------------------------
function createTaxCaluclator(tax) {
  function calculateTax(amount) {
    return amount * tax;
  }
  return calculateTax;
}

const calculateIncomeTax = craeteTaxCalculator(.20);

console.log(calculateTax(100));


//Recursion (when a function calls itself) -------------------------------------------------------
//Also very good for looping through nested objects

//without recursion
function powerOf(x, n) {
  let result = 1;
  for (let i = 0; i < n; i++) {
    result *= x;
  }
  return result;
}

//with recursion
function powerOfRec(x, n) {
  if (n === 1) { //specify an exit condition
    return x;
  }
  return x * powerOfRec(x, n - 1);
  //return n === 1 ? x : x * powerOfRec(x, n - 1); //with ternary expression
}