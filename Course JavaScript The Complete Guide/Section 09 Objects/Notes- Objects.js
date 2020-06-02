//OBJECTS =================================================
/*
If you access a nonexistent property, its value will be undefined.
Be wary using arrow functions inside of objects because they treat "this" differently.
*/


//Object Literal Notation --------------------------------------------
const userChosenKey = getInputFunction();
const userChosenValue = anotherGetInputFunction();

const myObject = {
  key1: value1,
  key2: "value2",
  key3: ["Element1", "Element2"],
  key4: function() {
    console.log("Function in myObject");
  },
  "key5 is multi-word": value3,
  [userChosenKey]: userChosenValue,
  key7ShorthandMethodNotation() {
    console.log("This method was created with shorthand notation");
  }
};

//To access properties/methods, use the dot operator or square brackets
myObject.key1;
myObject.key4();
myObject["key2"];
myObject["key5 is multi-word"];

//To change a value, simply reassign it
myObject.key2 = "New value";

//To Add a new property, simply declare it and assign a value
myObject.key6 = "Another new value";

//To delete a property, use delete keyword
delete myObject.key3;


//Some more tricks --------------------------------------------------
const myNextObject = {
  title,
  name
};
  //same as...
  const myNextObject = {
    title: title,
    name: name
  };

//To copy all key-value pairs from one object to another
const person = {
  name: 'Ben',
  title: 'Mr',
  age: 30,
  hobbies: ["sports", "coding"],
  nestedObject: {
    key1: 1,
    key2: 2
  }
};

  //using spread operator
  const person2 = { ...person};
  const person3 = { ...person, age: 33, hobbies: [...person.hobbies]}; //copy person object but also override values

  //using Object.assign()
  const person4 = Object.assign({}, person); //copies all key-value pairs from person

//Destructuring objects
const {nestedObject, ...otherProperties} = person; //creates nestedObject as its own object, and an object with the other properties
const {nestedObject: newName, ...otherProperties} = person; //creates nestedObject as its own object with name newName

//To check if a property is in an object
if (myProperty in myObject) {
  //Code
};

if (myProperty === undefined) {
  //Code
}

//THIS --------------------------------------------------------
//"this" refers to whatever was responsible for calling the function in which "this" exists
  //E.g., for object.myFunction(), if myFunction() contains a "this", it will refer to "object"

  //For future use
  //can pass infinite additional arguments
  myFunction.bind(thisArg, otherArgs); //"this" will refer to "thisArg" instead of its usual value

  //For immediate use (called right here)
  //can pass infinite additional arguments
  myFunction.call(thisArg, otherArgs); //Executes the function but can change the "this"

  //For immediate use (called right here)
  //can pass only one additional argument, which is an array
  myFunction.call(thisArg, otherArgArray); //Executes the function but can change the "this"

//Arrow functions treat "this" differently



//What "this" refers to ----------
  //use console.log(this) to check


//In Global Context, outside of any function
console.log(this) //logs global object (window in browser) ALWAYS, even in strict mode


//In non-arrow function called from global context
function thisFunction() {
  console.log(this);
}
thisFunction(); //logs global object in non-strict, logs undefined in strict


//In arrow function called from global context
const thisFunction = () => {
  console.log(this);
}
thisFunction(); //logs global object always, even in strict mode


//In non-arrow function called on an object
const person = {
  name: "Ben",
  greet: function() {
    console.log(this.name);
  }
};
person.greet(); //logs "Ben" because "this" refers to the object person


//In arrow function called on an object
const person = {
  name: "Ben",
  greet: () => {
    console.log(this.name);
  }
};
person.greet(); //logs nothing because "this" refers to the global object, even in strict mode


//GETTERS AND SETTERS -------------------------------------------
  //Can add whatever logic is appropriate; can have one or both or none
const myObject = {
  set name(value) {
    value ? this._name = someUserInput : "Default";
  },
  get name() {
    return this._name;
  }
};

myObject.name = "This is my Value"; //access setter
console.log(myObject.name) //access getter