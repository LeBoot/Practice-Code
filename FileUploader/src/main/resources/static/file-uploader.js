/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function submitFile() {
    console.log("File url: " + $("#fileInput").val());

    var addFileForm = document.getElementById("addFileForm");

    // var formToSend = new FormData($("#addFileForm")[0]);

    $.ajax({
        type: "POST",
        url: "/add-file",
        data: new FormData(addFileForm),
        enctype: "multipart/form-data",
        processData: false,
        contentData: false,
        cache: false,
        success: function(data, status) {
            alert("Success!");
        },
        error: function(xhr, status, error) {
            var err = eval("(" + xhr.responseText + ")");
            alert("Error: " + err.message);
        }
    });

}


/*Dan's Stuff*/
function editPublicProfileDetails() {
    clearErrorMessages('#sellerAccountPageInnerRightContainerErrorMessages');
    var addModalForm = document.getElementById('sellerAccountPagePublicProfileDetailsForm');
    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
    $(document).ajaxSend(function (e, xhr, options) {
      xhr.setRequestHeader(header, token);
    });
    $.ajax({
      type: 'POST',
      url: '/seller/edit-public-profile-details/',
      data: new FormData(addModalForm),
      enctype: 'multipart/form-data',
      processData: false,
      contentType: false,
      cache: false,
      success: function (data, status) {
        loadPublicProfileDetails();
      },
      error: function (xhr, status, error) {
        var err = eval("(" + xhr.responseText + ")");
        $('#sellerAccountPageInnerRightContainerErrorMessages')
          .append($('<li>')
            .attr({
              class: 'list-group-item list-group-item-danger'
            })
            .text(err.message));
      }
    });
  }