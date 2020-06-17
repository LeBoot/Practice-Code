class Course {

  #price;
  
  get price() {
    return "$" + this.#price;
  }

  set price(value) {
    this.#price = 5;
  }
  
  constructor(title, length, price) {
    this.title = title;
    this.length = length;
    this.#price = price;
  }

  calcValue() {
    return this.length / this.#price;
  }

  summarize() {
    return `"${this.title}" is a fantastic course to take.  It takes ${this.length} weeks to complete and only costs ${this.price}.`;
  }
}

class PracticalCourse extends Course {
  constructor(title, length, price, numOfExercises) {
    super(title, length, price);
    this.numOfExercises = numOfExercises;
  }
}

class TheoreticalCourse extends Course {
  publish() {
    console.log("Well hello there.");
  }
}




const fakeCourse1 = new Course("Cooking with Boone", 3, 200);
console.log(fakeCourse1, fakeCourse1.calcValue(), fakeCourse1.summarize());

const fakeCourse2 = new Course("Finances with Boone", 4, 500);
console.log(fakeCourse2, fakeCourse2.calcValue(), fakeCourse2.summarize());

const fakePracticalCourse = new PracticalCourse("Boone's Practical Course", 5, 500, 20);
console.log(fakePracticalCourse);

const fakeTheoreticalCourse = new TheoreticalCourse("Boone's Theoretical Course", 2, 100);
console.log(fakeTheoreticalCourse);