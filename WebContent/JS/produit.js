/**
 * 
 */

/**
 * 
 */
$(document).ready(function() {
    //$('#username').focus();

    $('#submit').click(function() {

       event.preventDefault(); // prevent PageReLoad

       var Validmodel = $('#model').val()!= '' && $('#prix').val()!= '' && ($('#tel').val()!= '' || $('#address').val()!= ''); // User validate
        
           dist = $('#distribut').val();
           if(!$('#check').is(":checked")){
               dist='';
           }
        if (Validmodel === true && $('#tel').val().length==10) { // if ValidEmail
          $.ajax({
          url : "./ProduitServlet" ,
          type : "POST",
          dataType : "json",
          data: {
            model : $('#model').val() ,
            type: $('#type').val() ,
            tel : $('#tel').val() ,
            statut: $('#statut').val() ,
            address : $('#address').val() ,
            distribut: dist ,
            prix :$('#prix').val()    
          },
          success : function(data){
          if(data.isvalid){
           $('.succefull').css('display', 'block');
           $('.error').css('display', 'none');}
              else {
            $('.error').css('display', 'block'); // show error msg
            $('.succefull').css('display', 'none');
        
        }
          }
        
        });
       
    
           
        }
        else {
            $('.error').css('display', 'block'); // show error msg
            $('.succefull').css('display', 'none');
        }
    });
    
    
    
     $('#check').change(function() {
     if($('#check').is(":checked")){
        $('#distribut').css('display', 'block');
        $('.dist').css('display', 'block');  
      }else{
       $('#distribut').css('display', 'none');
       $('.dist').css('display', 'none'); 
        }
     
     });
    
    
});