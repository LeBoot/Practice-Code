
//ARRAYS AND ITERABLES =======================================================
/*
Arrays can hold data of different types
Index-based access.
Ordered.
*/


//CREATION -----------------------------------------------
//best practice; best performance
const arr = [1, 2, 3];

//Use constructors (can include "new" or not; doesn't matter)
const arr = new Array(); //use constructor to make an empty array
const arr = new Array(1, 2, 3); //build an array that contains the items in the constructor
const arr = new Array(5); //build an empty array of length 5

//Build array from an array-like object
const myArrayLikeObject = "Hello";
const arr = Array.from(myArrayLikeObject);



//ADDING/REMOVING/FINDING ELEMENTS ----------------------------------
const myArr = ["Water", "Fruit", "Taco"];

//Add to end of array; returns array length; can take multiple arguments
const newArrayLength = myArr.push("Bread"); //=> ["Water", "Fruit", "Taco", "Bread"]

//Add to start of array; returns array length
const newArrayLength = myArr.unshift("Bread"); //=> ["Bread", "Water", "Fruit", "Taco"]

//Remove last element; returns removed element
const poppedValue = myArr.pop(); //=> ["Water", "Fruit"];

//Remove first element; returns removed element
const shiftedValue = myArr.shift(); //=> ["Fruit", "Taco"];

//Replace element at index i
myArr[1] = "Soup"; //=> ["Water", "Soup", "Taco"];

//.splice(startIndex, howManyToDelete, ?whatToInsert)
myArr.splice(1, 0, "Soup"); //=> ["Water", "Soup", "Fruit", "Taco"];
myArr.splice(1, 1, "Soup"); //=> ["Water", "Soup", "Taco"];
myArr.splice(-1, 1, "Soup"); //=> ["Water", "Fruit", "Soup"];
myArr.splice(0); //=> returns empty array []
myArr.splice(1); //=> ["Water"];

const copyOfArrayValues = myArr.slice(); //New array with new location on heap
const copyOfPortionOfArray = myArr.slice(2); //starts at index 2 and goes til index length-1
const copyOfPortionOfArray = myArr.slice(1, 2); //starts at index 1 and goes til index 2
const copyOfPortionOfArray = myArr.slice(-3, -1); //from third to last element to last element

//Concatenate multiple arrays
const newArray = myArr.concat(["Rice", "Carrot"]); //Creates brand new array in memory

//Find an element; returns -1 if not found
const index = myArr.indexOf("Taco"); //returns first matching value
const index = myArr.indexOf("Fruit", 1); //starts from index 1
const idnex = myArr.lastIndexOf("Taco"); //retuns last matching value (moves right to left)

//Check if includes (like using indexOf() above where that returns -1)
const isIncluded = myArr.indexOf("Water");

//Find objects in array
const arrOfObjects = [{name: 'Ben'}, {name: 'Jim'}];
const BenObject = arrOfObjects.find((object, index, arrOfObjects) => { //takes a function
  return object.name === 'Ben'; //returns pointer to object (not a copy)
});
const BenIndex = arrOfObjects.findIndex((object, index, arrOfObjects) => { //takes a function
  return object.name === 'Ben';
});


//LOOPS -----------------------------------------------------
const myAr = [1, 5, 3, 7, 7, 4];

//For loop for arrays
for (const num of myAr) {
  //Code
}

//Easy access to index
myAr.forEach((num, index, myAr) => {
  //Code
});


//MISCELLANEOUS METHODS -----------------------------------------------

//Map executes a function on every element of an array, and that function returns the new array element,
  //and overall, map returns a new array
const newArray = myAr.map((num, index, myAr) => {
  //Code
  return newArrayElement;
});


const sortedArray = myAr.sort(); //Sorts data alphabetically as strings
const customSortedArray = myAr.sort((a, b) => { //Customize the logic for the comparion
  if (a > b) {
    return 1;
  } else if (a === b) {
    return 0;
  } else {
    return -1;
  }
});

//Reverse an array
const reversedArray = myAr.reverse();

//Filter an array
const filteredArray = myAr.filter((num, index, myAr) => {
  //return true to include element in new array; false to exclude it
  return num > 6;
});

  //A shorter version of the filter
  const filteredArray = myAr.filter(n => n > 6);

//Reduce method
const startingValue = 0;
const sum = myAr.reduce((prevValue, curValue, curIndex, myAr) => {
  return prevValue + curValue;
}, startingValue)

//Split string at delimiter
const myString = "place;anotherPlace;thirdPlace";
const arrayOfPieces = myString.split(";");

//Join string with delimiter
const myPieces = ["string1", "string2", "string3"];
const myJoinedString = myPieces.join(); //Default delimiter is a comma ",", but can take another delimiter as an argument

//SPREAD OPERATOR ----------------------------------------------------
/*
The spread operator takes the values out of an array so that they can be used elsewhere.
*/
const myArray = [1, 2, 6, 8];
const copyOfMyArray = [...myArray]; //Creates a new array that has the same data as the original
const minValue = Math.min(...myArray); //Math.min() takes a comma-separated list of numbers

//DESTRUCTING AN ARRAY -------------------------------------
const myArray = ["Jim", "Bob", "Kansas", "Tokepa", "North America"]
const [firstName, lastName, ...locationInfo] = myArray

  //yields...
  firstName = "Jim";
  lastName = "Bob";
  locationInfo = ["Kansas", "Topeka", "North America"];


//SETS ==================================================================
/*
  No duplicates allowed.
  No index-based access.
  Unordered.
*/

const anyIterable = [1, 2, 3];
const mySet = new Set(anyIterable);

mySet.has(1); //returs boolean
mySet.add(4); //adds 4 to the set
mySet.add(2); //nothing really happens because 2 is already contained
mySet.entries(); //returns an iterable of arrays, with each array containing 2 elements, each one of the items in the set
mySet.delete(5); //nothing really happens
mySet.delete(1); //removes 1 from the set

//MAPS ===================================================================
/*
  Keys and values can be anything, even objects.  Mixed types are permitted.
  Ordered.
*/

const myMap = new Map(key, value);
myMap.get(someKey); //returns value for that key
myMap.set(newKey, newValue); //adds an new entry
myMap.has(aKey) //returns boolean

for (const entry of myMap.entries()) {
  //Code
} //returns iterable of 2-element array, with key and value

for (const [key, value] of myMap.entries()) {
  //Code
} //access both keys and values easily

for (const key of myMap.keys()) {
  //Code
} //pulls out all the keys

for (const key of myMap.values()) {
  //Code
} //pulls out all the values

//WEAK SETS/MAPS =========================================
/*
  Only for objects.
  Weak sets/maps allow garbage collection to remove elements that no longer have refences to them.
*/
let myObject = {name: "Ben"};
const myWeakSet = new WeakSet();
myWeakSet.add(myObject);