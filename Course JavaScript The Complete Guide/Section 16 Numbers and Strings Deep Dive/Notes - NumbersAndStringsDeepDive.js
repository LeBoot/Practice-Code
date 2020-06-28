//Numbers and Strings Deep Dive ============================================

/*
All numbers are 64-bit floating point numbers
*/


//To represent a number in a different base-system
(5).toString(2); //binary
(8).toString(12); //dozenal


//Fix decimal places
const myNum = 12;
myNum.toFixed(2);


//Bigint (integers only)
const myBigInt = 12345n; //"n" at end of number
const myInt = parseInt(myBigInt); //convert to integer

const normalInt = 5;
const convertedToBigInt = BigInt(normalInt); //convert to Bigint


//Tagged templates
function productDescription(strings, productName, productPrice) {
  //Strings is an array of the string portions of the template literal.
  return `${strings[0]}${productName} has a price of ${productPrice}${strings[2]}`;
}

const prodName = "JavaScript course";
const prodPrice = 29.99;
const output = productDescription`This product (${prodName}) costs ${prodPrice}.`;


//Regex ===========================================
const userInput = 'myEmail@email.com';
const regex = /^\S+@\S+\.\S+$/ //The expression is contained between the two forward slashes
regex.test(userInput);


//Regex Basics
const regex1 = /hello/ //finds exact string "hello" anywhere in the string and is case sensitive
const regex2 = /(h|H)ello/ //finds either "hello" or "Hello" (anywhere in string)
const regex3 = /.ello/ //"." is a wildcard for a single character.  This matches any five-character string that ends in "ello"
