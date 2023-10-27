<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Web App</title>
<link rel="stylesheet" href="CSS/less.css"/>
        <script src="JS/jquery.js"></script>
       
</head>
<body>


<div  >
  <nav >
    <ul class="menuItems">
      <li><a href='HomeServlet?type=&model=' data-item='Home'>Home</a></li>
      <li><a href='produit' data-item='About'>Add</a></li>
      <li><a href='profile' data-item='Projects'>Profile</a></li>
      <li><a href='about' data-item='Blog'>About</a></li>
      <li><a href='signout' data-item='Signout'>Signout</a></li>
    </ul>
  </nav>

</div>

<section class="form animated flipInX" style="margin-top:0px;" >
  <h2 style="font-size:40px;">Add new product</h2>
  
  <form class="loginbox"  action="./ProduitServlet"  method="post">
   <p class="error">Please verifed your information </p>
   <p class="succefull">Succefull </p>
   <label class="labelform" >Type of the produit</label>
   <br>
   <select id="type" name ="type" >
    <option>Phone</option>
    <option>Computer</option>
    <option>Vhecule</option>
    <option>Chronic hormones</option>
    <option>furnish</option>
    <option>Machin</option>
    <option>piece</option>
   </select>
   <br><br>
    <input class="inputform" placeholder="Model" type="text" id="model" name="model" required=""/>
    <input class="inputform" placeholder="Prix" type="number" id="prix" name="prix" required=""/>
    <label class="labelform">Statut</label>
    <br>
    <textarea id="statut" rows="10" cols="33"></textarea>
    <br><br>
    <label class="labelform">Add picturs</label>
    <input  style="width:100% ;" type="file" id="file"  accept="image/*"   multiple name="file"/>
    <br><br>
    <input class="inputform" placeholder="Tel" type="number" id="tel" name="tel" />
    <input class="inputform" placeholder="Address" type="text" id="address" name="address"/>
    <label class="labelform" >Delivery Service</label>
    <input class="inputform" type="checkbox" name="check" id="check"  style="width:10px; margin: 0 0 10px ;" />
       <label style="display:none ;" class="labelform dist">Distributer</label>
   <br>
   <select id="distribut" name ="distribut" style="display:none ;" >
    <option>DHL</option>
    <option>SPEED</option>
    <option>TTL</option>
   </select>
   <br><br>
<button id="submit" type="submit">Shir</button>

</form>
</section>

 
        
<script src="JS/produit.js"></script>
</body>
</html>