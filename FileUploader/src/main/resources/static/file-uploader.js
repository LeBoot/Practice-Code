/*myStuff*/
function submitFile() {
  
  var myForm = document.getElementById("myForm");

  $.ajax({
    type: 'POST',
    url: '/add-file',
    data: new FormData(myForm),
    contentType: false,
    processData: false,
    cache: false,
    success: function(data, status) {
      console.log("Success: " + status);
    },
    error: function(xhr, status, error) {
      var err = eval("(" + xhr.responseText + ")");
      console.log("Error: " + err.message);
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