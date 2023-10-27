<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Web App</title>
<link rel="stylesheet" href="CSS/less.css"/>
        <script src="JS/jquery.js"></script>

</head>
<body>
 
               <a href="HomeServlet?type=&model=" style="color:white;"> <h4><< Go to home</h4></a>
        <form action="profile" method="post" enctype="multipart/form-data">
          
            <span class="img-div">
             

               <img src="AVATAR/avatar.jfif" onClick="triggerClick()" id="profileDisplay">
            </span>
            <input type="file" name="profileImage" onChange="displayImage(this)" id="profileImage" class="form-control" style="display: none;">

            <button type="submit" name="save_profile" id="saveimage" >Save Image</button>

        </form>


  <script>
  function triggerClick(e) {
    document.querySelector('#profileImage').click();
  }
  function displayImage(e) {
    if (e.files[0]) {
      var reader = new FileReader();
      reader.onload = function(e){
        document.querySelector('#profileDisplay').setAttribute('src', e.target.result);
      }
      reader.readAsDataURL(e.files[0]);
    }
  }
  </script>



<br><br><br>
 <div><button id="updateinfo" >Update your information</button></div>       


<div class="profile">
<table cellspace="1" width="100%"><tr><td colspan="2" height="70px" >
<form method="post">
<b><label id="donne">Username</label></b>
</td></tr><tr></tr>
<tr><td width="70%">
  <input type="text" name="data"  id="megadonne" value=""/>  

</td><td>
<button type="submit" name="name" id="edit" style="background:green;">Edit</button>
</td></tr>
</form>
</table>
</div>
<div class="profile">
<table cellspace="1" width="100%"><tr><td colspan="2" height="70px">
<form method="post">
<b><label id="donne">E-Mail</label></b>
</td></tr><tr></tr>
<tr><td width="70%">
  <input type="email" name="data" id="megadonne" value=" "/>
</td><td>
<button type="submit" name="email" id="edit" style="background:green;" >Edit</button>
</td></tr>
</form>
</table>
</div>
 
        
<c:forEach var="produit" items="${myproduits}" >
        
        
<div id="post" >
<table width="100%">
<tr><td width="80">
    <img id="image" src="AVATAR/avatar.jfif"/>
</td>
<td>
<h3><b style="font-size : 25px ; color : black ;">  ${produit.vendeur}</b></h3>
<label style="color : gray ; font-size : 15px;" colspan="2">
 ${produit.date}
</label>
</td>
</tr>
<tr><td style="color : gray ; font-size : 20px;" colspan="2">
${produit.type}
</td></tr>
<tr><td colspan="2">
<h3> ${produit.modal}</h3>
</td></tr>
<tr><td colspan="2">
</br>
<label id="containerpost">   ${produit.statut}
</label>
</td></tr>
<tr><td colspan="2">
<img id="imagepost" src="IMAGES/Online-Shopping-Free-Download-PNG.png"/>
</td></tr>
<tr><td colspan="2">
<label style="font-size:30px ; color:green;"> Location :  ${produit.address}
</label>
</td></tr>
<tr><td colspan="2">
<label style="font-size:30px ; color:green;"> Tel :   ${produit.tel}
</label>
</td></tr>
<tr><td colspan="2">
<lable style="font-size:30px ; color:red;" > price :  ${produit.prix} DA
</lable>
</td></tr>
<tr><td style="font-size:17px; color:gray;" > 1 <i class="fa fa-check" aria-hidden="true" ></i> </td>
 <td style="float:right; ">
 <div style="float:right; position:relative ;">



  <button  style="background:red;" type="submit"  id="sendbtn"><i class="fa fa-trash-alt" aria-hidden="true"></i></button>


 <a class="select" href="index.jsp?page=tchat&user=" id="sendbtn" ><i class="fa fa-paper-plane" aria-hidden="true"></i></a>

</div>
</td></tr>
</table>
</div>
        
</c:forEach>     
        
      <br>
   <br><br><br>  
<!-- Footer starts-->
<footer>

  <!-- Copyright -->
  <!-- ❤️  -->
  <div class="footer-copyright text-center" id="divdiv">&copy; Developed with Zi Ram</i> by
    <a href="https://works/" class="white-text" target="_blank">K Mahi</a>. <a href="https://mahi" target="_blank">Check my other works </a>
  </div>
  <!-- Copyright -->

</footer>
<!-- Footer ends-->

<!-- Developed by http://grohit.com/ --> 
             

<script src="JS/profile.js"></script>

</body>
</html>