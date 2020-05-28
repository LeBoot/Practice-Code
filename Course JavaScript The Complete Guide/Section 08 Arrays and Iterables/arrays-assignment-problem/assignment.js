//STEP 1 ==================================================

// const myNumArray = [1, 2, 3, 5, 7, 11, 13, 17, 19];
// console.log("myNumArray: " + myNumArray);

// const filteredArray = myNumArray.filter(n => n > 5);
// console.log("filteredArray: " + filteredArray);

// const mappedArray = myNumArray.map((num, index) => {
//   return {value: num, index: index};
// });
// console.log("mappedArray:");
// console.log(mappedArray);

// const reducedArray = myNumArray.reduce((prevVal, curVal, curIndex, arr) => {
//   return prevVal * curVal;
// });
// console.log("reducedArray: " + reducedArray);


//STEP 2 ===================================================

// const inputArray = [1, 2, 3, 5, 7, 11, 13, 17, 19];

// function findMax(input) {
//   return Math.max(...input);
// }

// console.log(findMax(inputArray));


//STEP 3 ===================================================

// const inputArray = [1, 2, 3, 5, 7, 11, 13, 17, 19];

// function findMax(input) {
//   let results = [];
//   results[0] = Math.max(...input);
//   results[1] = Math.min(...input);
//   return results;
// }

// const [maxValue, minValue] = findMax(inputArray);

// console.log(maxValue, minValue);

//STEP 4 ===================================================

const myList = [1, 8, 10];
const inputToAttempt = [1, 1, 1, 1, 2, 3, 4, 5, 5, 5, 6, 7];

function attemptToAdd(input, list) {
  let newSet = new Set(list);
  input.forEach( num => newSet.add(num));
  return newSet;
}

console.log(attemptToAdd(inputToAttempt, myList));