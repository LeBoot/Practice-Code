//VARIABLES ======================================================
var listToQuery;


//Document Ready =================================================
$(document).ready(function () {
    
    $("#SuccessDiv").addClass("hiddenDiv");
    
	makeAJAXCallForList();

}) //End Document Ready

function makeAJAXCallForList() {

    $.ajax({
        type: "GET",
        url: "http://localhost:8080/get-list",
        success: function(incomingList) {
            console.log("Successful AJAX call.")

            //Set listToQuery, which is used when a submission occurs
            listToQuery = incomingList;
            
            //initiate the autocomplete function
            var x = $("#search-bar");
            autocomplete(x, incomingList);
        },
        error: function(xhr, status, error) {
            var err = eval("(" + xhr.responseText + ")");
            console.log("AJAX Call Error Message: " + err.message);
          }
    });

}

//CLEAN UP ==========================================================
function clearSuccessDiv() {
    $("#messageDiv").html("");
}

function clearSearchBar() {
    $("#search-bar").val("");
}

//FORM SUBMISSION ===================================================
function attemptFormSubmission() {
    
    //Prevent form from submitting on its own and refreshing the page
    event.preventDefault();

    //Clear the success div, in case it contains a previous message
    clearSuccessDiv();

    //Grab input from user
    var userInput = $("#search-bar").val();
    
    //Clear search bar of whatever the user just typed
    clearSearchBar();

    //If user didn't type anything, reset the page
    if (userInput.trim() == "") {
        return false;
    }

    //See if user's input matches anything in the list
    for (var i = 0; i < listToQuery.length; i++) {
        if (listToQuery[i].toUpperCase() == userInput.toUpperCase()) {
            isFound = true;
            $("#messageDiv").append("<p class='successfulEvent'>Congratulations! You found " + listToQuery[i] + "</p>");
            $("#messageDiv").removeClass("hiddenDiv");
            return true;
        }
    }

    //If no match was found, this code runs:
    $("#messageDiv").append("<p class='errorEvent'>Sorry, not found</p>");
    $("#messageDiv").removeClass("hiddenDiv");
    
}

//AUTOCOMPLETE ========================================================
function autocomplete(userInput, myList) {
    var currentFocus;

    //If the user click anywhere on the page other than an autocomplete value...
    document.addEventListener("click", function (e) {
        closeAllLists(e.target);
    }); //END EVENT LISTENER

    function closeAllLists(element) {
        var x = $(".autocomplete-items");
        for (var i = 0; i < x.length; i++) {
            if ((element != x[i]) && (element != userInput)) {
                x[i].parentNode.removeChild(x[i]);
            }
        }
    } //END CLOSE ALL LISTS

    //Event listener.  Each time the 'input' field is altered, this funciton runs
    userInput.addEventListener("input", function(e) {
        //grab what the user has typed thus far
        var val = this.value;
        
        //Close any already-open lists of autocomplte values
        closeAllLists();
        
        /*
        Figure this piece out
        */
        if (val == false) {
            return false;
        }
        currentFocus = -1;

        //Create a DIV to hold autocomplete list
        var autocompleteList = document.createElement("DIV");
        autocompleteList.setAttribute("id", this.id + "autocomplete-list");
        autocompleteList.setAttribute("class", "autocomplete-items");
        //append to input field
        this.parentNode.appendChild(autocompleteList);

        //for each item in the list to query...
        for (var i = 0; i < myList.length; i++) {
            if (myList[i].toUpperCase().includes(val.toUpperCase())) {
                //Create a DIV
                var partialMatchDiv = document.createElement("DIV");
                
                /*
                Some Code to make Matching Letters Bold would be Nice
                */

                //put content into DIV
                partialMatchDiv.innerHTML = myList[i];

                //If this div is clicked, execute the folling code:
                partialMatchDiv.addEventListener("click", function(e) {
                    //change value of search-bar to value of this div
                        //choosing not to submit here, so that the user can type additional stuff if desired
                    $("#search-bar").val(myList[i]);

                    //close all lists
                    closeAllLists();
                });

                //add DIV to list
                autocompleteList.appendChild(partialMatchDiv);
            } //END IF STATEMENT

        } //END FOR LOOP
    }); //END EVENT LISTENER FUNCTION

    // function addActive(x) {
    //   /*a function to classify an item as "active":*/
    //   if (!x) return false;
    //   /*start by removing the "active" class on all items:*/
    //   removeActive(x);
    //   if (currentFocus >= x.length) currentFocus = 0;
    //   if (currentFocus < 0) currentFocus = (x.length - 1);
    //   /*add class "autocomplete-active":*/
    //   x[currentFocus].classList.add("autocomplete-active");
    // }

    // function removeActive(x) {
    //   /*a function to remove the "active" class from all autocomplete items:*/
    //   for (var i = 0; i < x.length; i++) {
    //     x[i].classList.remove("autocomplete-active");
    //   }
    // }

    

} //CLOSE AUTOCOMPLETE FUNCTION