//OOP Behind the Scenes ============================================

//A constructor function can be called together with the "new" keyword to create an object based on it.

//Prototypical inheretance allows functionality to be shared amongst objects, by allowing an object to "fall back" to prototype methods and properties.

//SomeObject.__proto__ points to the prototype object of SomeObject, which is its fall-back object.

//All objects have a prototype object, and that chain ends at Object.prototype.


class MyClass {

  someFunction() {
    console.log(`This function is stored in the object's prototype;
    therefore, only one copy of the function exists regardless of how
    many times the class is instantiated.  Thus, performance is optimized.`);
  }

  anotherFunction = function() {
    console.log(`This function is created with each instance of the object;
    therefore, performance will be sub-optimal.`);
  };

  thirdFunction = () => {
    console.log("This behaves the same as 'anotherFunction'.");
  };

}


//To change a prototype after an object has been created
const course = {
  title: "New Course",
  rating: 5
}
Object.getPrototypeOf(course) //gets prototype
Object.setPrototypeOf(course, { //sets prototype
  ...Object.getPrototypeOf(course), //Can spread the current prototype
  someMethod: function() { //add something new
    console.log("Hello!");
  }
})


//To change a prototype while creating an object
const newObject = Object.create({ObjectToBeMyPrototype});
newObject.newProperty = "This is my new property";
Object.defineProperty(newObject, anotherProperty, {
  configurable: true,
  enumerable: true,
  value: "another property",
  writable: false
})