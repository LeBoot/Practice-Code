//Advanced DOM ============================================

//In HTML code, data-* can be added to elements; e.g., -----------------
const myHTML = `
  <div id="div1" data-my-extra-data="This is extra data" data-more-words="More words">
  </div>
`;
const htmlElement = document.getElementById('div1');
const myDataSet = htmlElement.dataset; //Object with the different data-*
const myExtraData = myDataSet.myExtraData; //Contains "This is extra data"


//Get positions and dimensions of an html element -------------------
const DOMRectObject = myElement.getBoundingClientRect(); //Properties are "x", "y", "height", "width", 
const myOffsetTop = myElement.offsetTop(); //includes border(s) and scroll bar(s)
  //also offsetLeft(), offsetWidth(), offsetHeight(), etc.
const myClientTop = myElement.clientTop(); //does not include border(s) or scroll bar(s)
const myScrollHeight = myElement.scrollHeight(); //entire height, including what is not currently visible
const wholePageWidth = document.documentElement.clientWidth;
const wholePageHeight = document.documentElement.clientHeight;


//Scrolling ----------------------------------------
const myEl;
let x = 0;
let y = 50;
myEl.scrollTo(x, y);
myEl.scrollTo({top: y, left: x, behavior: 'smooth'});
myEl.scorllBy(x, y);
myEl.scrollIntoView();
myEl.scrollIntoView({behavior: 'smooth'});


//<template> -------------------------------------
//By default, template tags are not rendered, but they are part of the DOM
//In HTML: <template id="myTem"><p>This is a template</p></template>
const template = document.getElementById('myTem');
const addMe = document.importNode(template.content, true);
addMe.querySelector('p').textContent = "This is the text content I want";
myParentElement.append(addMe);


//Import JavaScript -----------------------------------
function addJavaScriptFile() {
  const myScriptEl = document.createElement('script');
  myScriptEl.src = "/path/path/script.js";
  myScriptEl.defer = true;
  document.head.append(myScriptEl);
}

function addJavaScriptRaw() {
  const myScriptEl = document.createElement('script');
  myScriptEl.textContent = 'alert("Script working");';
  document.head.append(myScriptEl);
}


//Timers and intervals -------------------------------------------
function myFunction() {
  alert("Timeout function!");
}
const timerId = setTimeout(myFunction, 3000, [optionalArrayOfArgsToPassToFunction]); //in milliseconds
clearTimeout(timerId);

const intervalId = setInterval(myIntervalFunction, 2000, [optionalArrayOfArgsToPassToFunction]); //runs ever 2000ms
clearInterval(intervalId);


//Browser location and history --------------------------------
history.back(); //takes to previous webpage
location.host; //gives domain (e.g., 'website.com')
location.origin; //gives full website (e.g., 'http://www.website.com')
location.pathname; //gives pathname (e.g., "/go/courses")
location.href = "http://www.benswebsite.com"; //redirects page
location.replace('http://www.benswebsite.com'); //redirects page and prevents back button