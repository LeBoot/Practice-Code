//Events ============================================

const button = document.querySelector('button');
buttom.addEventListener('click', myClickHandler);
buttom.removeEventListener('click', myClickHandler); //must be exact function object as was added

button.addEventListener('mouseenter', myFn); //Hover over
window.addEventListener('scroll', myScrollHandler); //Scrolling


//Form submission
const myForm = document.querySelector('form');
myForm.addEventListener('submit', event => {
  event.preventDefault();
});


//"this" keyword points to the currentTarget of the event, which is the element on which the
  //event listener is registered


//Propagation ========================================
//Bubbling => element's event listeners run from inside out (button -> div -> body)
  //Is default with event listeners
//Capturing => elements' event listeners run from outside in (body -> div -> button)
  button.addEventListener('click', myFn, true); //set "true" (default is bubbling, which is false)

//Stop propagation
button.addEventListener('click', event => {
  event.stopPropagation();
  event.stopImmediatePropagation();
});


//Event delegation =====================================================
//Add one event listener to an entire list, but each list item responds individually
const list = documet.querySelector('list');
list.addEventListener('click', event => {
  //event.target.classList.toggle('highlight'); //the "target" is the list item itself, not the entire list
  //event.currentTarget //the target on which the listener was added; in this case, the entire list
  event.target.closest('li').classList.toggle('highlight'); //works up the ancestor tree to grab the closest 'li'
});


//Triggering DOM events programatically
document.getElementById('someButton').click();
  //Note, this bypasses event listeners


//Drag and Drop ==================================================
//1) in Dom, add attribute draggable="true"
const myDraggableElement = document.getElementById('myDraggableElement');
myDraggableElement.addEventListener('dragstart', event => {
  event.dataTransfer.setData('text/plain', 'some test to add'); //many options
  event.dataTransfer.effectAllowed = 'move'; //many options
});

const myDroppableElement = document.getElementById('myDroppableElement');
myDroppableEvent.addEventListener('drageneter', event => {
  if (event.dataTransfer.types[0] === 'text/plain') {
    event.preventDefault();
  }
});
myDroppableElement.addEventListener('dragover', event => {
  if (event.dataTransfer.types[0] === 'text/plain') {
    event.preventDefault();
  }
});
//other events: 'drop', 'dragleave', 'dragend', and more
