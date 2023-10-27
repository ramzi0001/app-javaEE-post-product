
$(document).ready(function() {
    //$('#username').focus();

    $('#submit').click(function() {

        event.preventDefault(); // prevent PageReLoad
       $.ajax({
          url : "./LoginServlet" ,
          type : "POST",
          dataType : "json",
          data: {
            email: $('#email').val() ,
            password :$('#password').val()
          },
          success : function(data){
          if(data.isvalid){
           
           $('.error').css('display', 'none');

           window.location = "HomeServlet?type=&model=";
           }
              else  {
            $('.error').css('display', 'block'); // show error msg
           }
            }
 
    });
  });
});