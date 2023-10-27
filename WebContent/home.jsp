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

  <div id="divdiv" >Welcome To your application</div>
<p id="pp" data-item='Rohit'>Store</p>

<section>
  <div id="divdiv">Have a good shopping ;) </div>
  <nav>
    <ul class="menuItems">
      <li><a href='HomeServlet?type=&model=' data-item='Home'>Home</a></li>
      <li><a href='produit' data-item='About'>Add</a></li>
      <li><a href='profile' data-item='Projects'>Profile</a></li>
      <li><a href='about' data-item='Blog'>About</a></li>
      <li><a href='signout' data-item='Signout'>Signout</a></li>
    </ul>
  </nav>

</section>



   
   <form action="./HomeServlet" method="get">

  <div class="searchbox">
  <input class='searchinput' placeholder="Search" type="text" name="model" id="model"  />
  <button class="searchbotton" ><i class="material-icons">Search</i> </button> 
   </div> 
  
      <select id="type"  class="liste" name ="type" >
    <option>Phone</option>
    <option>Computer</option>
    <option>Vhecule</option>
    <option>Chronic hormones</option>
    <option>furnish</option>
    <option>Machin</option>
    <option>piece</option>
   </select>

  </form>       
      
        <br><br><br><br>
        
<c:forEach var="produit" items="${produitlist}" >
        
        
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
<label style="font-size:30px ; color:green;"> Tel :  ${produit.tel}
</label>
</td></tr>
<tr><td colspan="2">
<lable style="font-size:30px ; color:red;" > Price : ${produit.prix} DA
</lable>
</td></tr>
<tr><td style="font-size:17px; color:gray;" > 1 <i class="fa fa-check" aria-hidden="true" ></i> </td>
 <td style="float:right; ">
 <div style="float:right; position:relative ;">

  <button type="submit"  id="sendbtn"><i class="fa fa-check" aria-hidden="true"></i></button>

<c:if test="${ produit.vendeur==session }">
<input type="hidden" name="id"  id="id" value="${produit.id}"/>
  <button  style="background:red;" type="submit"  id="supp"><i class="fa fa-trash-alt" aria-hidden="true"></i></button>
</c:if>

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
    <a href="https://works/" class="white-text" target="_blank">K Mahi</a>. <a href="https://Mahi" target="_blank">Check my other works </a>
  </div>
  <!-- Copyright -->

</footer>
<!-- Footer ends-->

<!-- Developed by http://grohit.com/ --> 
        
        

<script src="JS/home.js"></script>

</body>
</html>