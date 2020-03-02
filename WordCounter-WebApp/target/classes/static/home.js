/* 
Author: Ben Leboutilllier
Date created: 2 March 2020
Date updated:
 */

function analyzetext() {
    //Prevent form from submitting on its own and refreshing the page
    event.preventDefault();

    var myForm = document.getElementById("form1");
    var myData = new FormData(myForm);

    $.ajax({
        type: "POST",
        url: "/analyze-2",
        data: myData,
        contentType: false,
        processData: false,
        cache: false,
        success: function(myList) {
            $("#form1-text-area").val("");
            displayGraph(myList);
        },
        error: function(xhr, status, error) {
            var err = eval("(" + xhr.responseText + ")");
            console.log("Error: " + err.message);
        }
    }); 

}

function configureDataForDisplay(myList) {
    //Create myData array
    var myData;
    
    //Create the first entry in the myData array
    for (var key in myList[0]) {
        if (myList[0].hasOwnProperty(key)) {
            myData = [{y: myList[0][key], label: key}];
        }
    }

    //If myList has more than one index, add the rest
    if (myList.length > 1) {
        for (var i = 1; i < myList.length; i++) {
            for (var key in myList[i]) {
                if (myList[i].hasOwnProperty(key)) {
                    var nextValue = {y: myList[i][key], label: key};
                    myData.push(nextValue);
                }
            }
        }
    }
    
    return myData;
}


function displayGraph(myList) {
    var configuredData = configureDataForDisplay(myList);

    var chart = new CanvasJS.Chart("my-chart", {
        animationEnabled: true,
        title:{
            text:"Words by Occurance"
        },
        axisX:{
            interval: 1
        },
        axisY:{
            title: "Number of Occurances"
        },
        data: [{
            type: "column",
            name: "companies",
            color: "#014D65",
            dataPoints: configuredData
        }]
    });
    chart.render();
}