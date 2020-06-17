//OOP =================================================

//Create a class --------------------------------------
class MyClass1 {
  property1;
  property2;
  property3 = "Default value";
}

class MyClass2 {
  constructor(property1, property2) {
    this.property1 = property1;
    this.property2 = property2;
  }
}

class MyClass3 {
  property1;
  property2;
  property3 = "Default value";

  constructor(property1, property2) {
    this.property1 = property1;
    this.property2 = property2
  }

  myMethod() {
    console.log("Hello, World.");
  }
}


//Instantiate an object from a class -------------------
let myObject1 = new MyClass1();

let myObject2 = new MyClass2("value1", "value2");


//Inheritance (from one class only) --------------------
class MyChildClass extends MyParentClass {
  constructor() {
    super();
  }
}


//Private fields, methods, properties ------------------
class MyClass4 {
  #myPrivateProperty;

  #myPrivateMethod() {
    console.log(this.#myPrivateProperty);
  }


  //The underscore is used to denote private properties in older code, but it imparts no differing functionality
  _myPseudoPrivateProperty;
}


//Instanceof to see if a variable is a particular class ------------
let isVariablePerson = myVariable instanceof PersonClass;


//Define Properties
Object.defineProperty(MyObject, property, {
  configurable: true, //Can property be deleted
  enumerable: true, //Will it show up in a for-in loop?
  value: MyObject.property, //What is its value?
  writable: true //Can it be written over?
});