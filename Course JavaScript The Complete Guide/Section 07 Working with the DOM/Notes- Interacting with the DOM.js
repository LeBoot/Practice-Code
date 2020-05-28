//DOM ==========================================================================
document.querySelector('.someClass'); //Takes CSS selector ('#id', '.class', 'element') and returns the first occurance or null (if not found)

document.getElementById('element-id'); //Returns element or null (if not found)

document.querySelectorAll('.someClass'); //Takes CSS selector and returns all matching elements as a static (not live) NodeList (or empty NodeList)

document.getElementsByTagName('element-tag'); //Returns a live HtmlCollection (or empty HtmlCollection)
document.getElementsByClassName('class'); //same

const myHtmlElement = docuemnt.querySelector('.someClass');
const myString = myHtmlElement.textContent;
  myHtmlElement.textContent = "Some new text";
  myHtmlElement.sytle.color = "red";
  myHtmlElement.sytle.backgroundColor = "wheat";

myHtmlElement.classList.toggle
myHtmlElement.classList.add
myHtmlElement.classList.remove
myHtmlElement.classList.contains
  
myHtmlElement.innerHtml = '<h2>This is new HTML</h2>'; //replaces all Html

myHtmlElement.insertAdjacentHtml(position, Htmlcode); //4 values for position
myHtmlElement.insertAdjacentElement(positoin, element);

const newElement = document.createElement('div'); //create DOM object that you can interact with easily
newElement.textContent = 'Some text content';
myHtmlElement.appendChild(newElement);

//Not supported in internet explorer
myHtmlElement.prepend(newElement);
myHtmlElement.append(newElement);

//Not supported in internet explorer or safari
myHtmlElement.lastChildElement.before(newElement);
myHtmlElement.lastChildElement.after(newElement);
myHtmlElement.lastChildElement.replace(newElement);

myHtmlElement.cloneNode(false); //clones node but not children/descendants
myHtmlElement.cloneNode(true); //clones node with all children/descendants

myHtmlElement.remove(); //removes the element; not supported in IE
myHtmlElement.parentElement.removeChild(myHtmlElement); //also removes element; supported in IE