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
            //Set listToQuery, which is used when a submission occurs
            listToQuery = incomingList;
            
            //initiate the autocomplete function
            var inputField = document.getElementById("search-bar");
            autocomplete(inputField, incomingList);
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
function autocomplete(inputField, myList) { //============================================================
    var currentFocus;
    var readyToSubmit;

    //If the user click anywhere on the page other than an autocomplete value...
    document.addEventListener("click", function (e) {
        closeAllLists(e.target);
    }); //END EVENT LISTENER --------------------------------------------------

    function closeAllLists(element) {
        var x = $(".autocomplete-items");
        for (var i = 0; i < x.length; i++) {
            if ((element != x[i]) && (element != inputField)) {
                x[i].parentNode.removeChild(x[i]);
            }
        }
    } //END CLOSE ALL LISTS -------------------------------------------------------------------------


    //Event listener.  Each time the 'input' field is altered, this funciton runs
    inputField.addEventListener("input", function(e) {              
        //grab what the user has typed thus far
        var val = this.value;
        
        //Close any already-open lists of autocomplte values
        closeAllLists();

        //decide wheather or not to add the list
        var shouldAddList = false;
        
        // if value is null, break out of function
        if (!val) {
            return false;
        }

        //set the current focus above any divs (this is used for highlighting)
        currentFocus = -1;

        //Create a DIV to hold autocomplete list
        var autocompleteList = document.createElement("DIV");
        autocompleteList.setAttribute("id", "autocomplete-list");
        autocompleteList.setAttribute("class", "autocomplete-items");
        autocompleteList.classList.add("hiddenDiv");
        //append to input field
        this.parentNode.appendChild(autocompleteList);

        //for each item in the list to query...
        for (var i = 0; i < myList.length; i++) {
            var indexOfSubstring = myList[i].toUpperCase().indexOf(val.toUpperCase());
            if (indexOfSubstring != -1) {
                //yes, let's add a list
                shouldAddList = true;
                
                //Create a DIV
                var partialMatchDiv = document.createElement("DIV");
                
                //Make matching letters bold --------------------------
                var part1, part2, part3;
                var lengthOfVal = val.length;
                //part before match, if present
                if (indexOfSubstring > 0) {
                    part1 = myList[i].substring(0, indexOfSubstring);
                } else {
                    part1 = "";
                }
                //matching part
                part2 = myList[i].substring(indexOfSubstring, indexOfSubstring + lengthOfVal);
                //part after match, if present
                if ((indexOfSubstring + lengthOfVal) < myList[i].length) {
                    part3 = myList[i].substring(indexOfSubstring + lengthOfVal);
                } else {
                    part3 = "";
                }
                //create a new string, with the three parts
                var newString = part1;
                newString += "<b>" + part2 + "</b>";
                newString += part3;

                //put content into DIV
                partialMatchDiv.innerHTML = newString;
                //partialMatchDiv.innerHTML = myList[i];
                partialMatchDiv.innerHTML += "<input type='hidden' value='" + myList[i] + "'>";

                //If this div is clicked, execute the folling code:
                partialMatchDiv.addEventListener("click", function(e) {
                    //change value of search-bar to value of this div
                        //choosing not to submit here, so that the user can type additional stuff if desired
                    inputField.value = this.getElementsByTagName("input")[0].value;

                    //close all lists
                    closeAllLists();
                });

                //add DIV to list
                autocompleteList.appendChild(partialMatchDiv);

            } //END IF STATEMENT

        } //END FOR LOOP

        //dispaly list, if anything was found
        if (shouldAddList == true) {
            autocompleteList.classList.remove("hiddenDiv");
        }

    }); //END EVENT LISTENER FUNCTION ----------------------------------------------------------------------


    //Event listener for keydown, keyup, enter
    inputField.addEventListener("keydown", function(e) {
        //select the exact div
        var selected = document.getElementById("autocomplete-list");
        
        //if "selected" is not null
        if (selected) {
            selected = selected.getElementsByTagName("DIV");
        }

        //arrow down key
        if (e.keyCode == 40) {
            //increase current focus
            currentFocus++;

            //highlight div
            addActive(selected);
        }

        //arrow up key
        else if (e.keyCode == 38) {
            //decrease current focus
            currentFocus--;

            //make the new element highlighted
            addActive(selected);
        }

        //enter key
        else if (e.keyCode == 13) {            
            if (readyToSubmit == false) {
                //prevent form submission
                e.preventDefault();

                //run submission function
                if (selected[currentFocus] == 10) {
                    console.log("this");
                }

                //run the same function used when div is clicked
                else if (currentFocus > -1) {
                    selected[currentFocus].click();
                }

                //ensure that the next "enter" keystroke can submit the form
                readyToSubmit = true;
            }
            else {
                closeAllLists();
                attemptFormSubmission();
            } 
        }

        console.log("End of function: currentFocus: " + currentFocus);
        console.log("End of function: selected[currentFocus]: " + selected[currentFocus]);

    }); //END KEYUP, KEYDOWN, ENTER ------------------------------------------------------------------


    //Highlight the div in which the user is interested
    function addActive(myDiv) {
        if (myDiv == false) {
            return false;
        }

        //remove the active class from all items
        removeActive(myDiv);

        //if focus is greater than the length of all the divs, return to first div
        if (currentFocus >= myDiv.length) {
            currentFocus = 0;
        }

        //if focus is less than the length of all the divs, return to the greatest div
        if (currentFocus < 0) {
            currentFocus = (myDiv.length - 1);
        }

        //make the current focus div highlighted
        myDiv[currentFocus].classList.add("autocomplete-active");

        //indicate the the next "enter" keystroke will not submit the form, but will select the active value
        readyToSubmit = false;

    } //END ADD ACTIVE ---------------------------------------------------------------------------


    //Remove highlight for all divs
    function removeActive(myDiv) {
        for (var i = 0; i < myDiv.length; i++) {
            myDiv[i].classList.remove("autocomplete-active");
        }
    } //END REMOVE ACTIVE ---------------------------------------------------------------------

} //END  AUTOCOMPLETE FUNCTION =============================================================================