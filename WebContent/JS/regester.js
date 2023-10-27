/**
 * 
 */
$(document).ready(function() {
    //$('#username').focus();

    $('#submit').click(function() {

       event.preventDefault(); // prevent PageReLoad

       var ValidEmail = $('#username').val()!= '' && $('#email').val()!= '' && $('#password').val() !=''; // User validate
var ValidPassword = $('#password').val() === $('#confpassword').val(); // Password validate

        if (ValidEmail === true && ValidPassword === true) { // if ValidEmail & ValidPassword
          $.ajax({
          url : "./RegesterServlet" ,
          type : "POST",
          dataType : "json",
          data: {
            username : $('#username').val() ,
            email: $('#email').val() ,
            password :$('#password').val()
          },
          success : function(data){
          if(data.isvalid && data.exist){
           $('.succefull').css('display', 'block');
           $('.error').css('display', 'none');}
              else if(data.isvalid) {
            $('.error').css('display', 'block'); // show error msg
            $('.succefull').css('display', 'none');
        }else{
          alert("The User alredy have Account");
        }
          }
        
        });
       
    
           
        }
        else {
            $('.error').css('display', 'block'); // show error msg
            $('.succefull').css('display', 'none');
        }
    });
});