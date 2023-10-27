/**
 * 
 */

$(document).ready(function() {
    //$('#username').focus();

    $('#submit').click(function() {

        event.preventDefault(); // prevent PageReLoad
       $.ajax({
          url : "./GetPassword" ,
          type : "POST",
          dataType : "json",
          data: {
            email: $('#email').val() ,
            
          },
          success : function(data){
          if(data.exist){
           
           $('.error').css('display', 'none');
           $('#submit').css('display', 'none');
           $('#email').css('display', 'none');
           $('.succefull').css('display', 'block');
          
           }
              else  {
            $('.error').css('display', 'block'); // show error msg
            $('.succefull').css('display', 'none');
           }
            }
 
    });
  });
});