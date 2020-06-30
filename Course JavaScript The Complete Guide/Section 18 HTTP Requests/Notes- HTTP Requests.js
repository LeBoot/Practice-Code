//HTTP Requests ============================================

//Promises ------------------------------------------------
/*
  Allow for cleaner async code, especially for nested code
*/
const promise = new Promise((resolve, reject) => {
  //this anonymous function executes right away when the constructor argument is called.
    //The two parameters are each, themselves, functions

});


//HTTP Requests: XHR -------------------------------------------
function sendHttpRequest(method, url, data) {

  const xhr = new XMLHttpRequest();
  // xhr.setRequestHeader('Content-Type', 'applicatio/json');
  // xhr.responseType = 'json';
  xhr.open(method, url);

  xhr.onerror = function() {
    //what to do if the request cannot send
  }

  xhr.onload = function() {
    if (xhr.status >= 200 && xhr.status < 300) {
      //successful call
      const listOfData = JSON.parse(xhr.response);
    } else {
      //unsuccessful call
    }
  }

  xhr.send(JSON.stringify(data)); //sends request
}


//HTTP Requests: XHR with promise-------------------------------------------
function sendHttpRequest(method, url, data) {
  const promise = new Promise((resolve, reject) => {
    const xhr = new XMLHttpRequest();
    // xhr.setRequestHeader('Content-Type', 'applicatio/json');
    // xhr.responseType = 'json';
    xhr.open(method, url);
    
    xhr.onerror = function() {
      //what to do if the request cannot send
      reject(new Error('Request failed to send!'));
    }

    xhr.onload = function() {
      if (xhr.status >= 200 && xhr.status < 300) {
        //successful call
        resolve(xhr.response);
      } else {
        //unsuccessful call
        reject(new Error('Something went wrong!'));
      }
    }

    xhr.send(JSON.stringify(data)); //sends request
  })
  

}


//HTTP Requests: fetch() --------------------------------------
function sendHttpRequest(method, url, data) {
  return fetch(url, {
    method: method,
    body: data
  }).then(response => {
    if (response.status >= 200 && response.status < 300) {
      return response.json();
    } else {
      return response.json().then(errData => {
        throw new Error('This is a server-side error');
      })
    }
  }).catch(error => {
    throw new Error('This HttpRequest failed to send');
  });
}


const sendButton = document.getElementById('myBtn');
sendButton.addEventListener('click', prepareToSend);

const myData = {name: 'Ben', health: 100};
async function prepareToSend() {
  try {
    const response = await sendHttpRequest('GET', 'http://www.myurl.com/post', myData);
  } catch (error) {
    console.log("Error", error);
  }
}