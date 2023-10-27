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
<section class="form animated flipInX">
  <h2>Creat Account</h2>
  
  <form class="loginbox"  action="./RegesterServlet"  method="post">
   <p class="error">Please verifed your information </p>
   <p class="succefull">Succefull </p>
    <input class="inputform" placeholder="Username" type="text" id="username" name="username" required=""/>
    <input class="inputform" placeholder="Email" type="email" id="email" name="email" required=""/>
    <input class="inputform" placeholder="Password" type="password" id="password" name="password" required=""/>
    <input class="inputform" placeholder="Confirmed your Password" type="password" id="confpassword" name="confpassword" required=""/>
<button id="submit" type="submit">Regester</button>
<br>
<br>
<a class="blogin" href="login">Login</a> 
</form>
</section>
 
<script src="JS/regester.js"></script>
</body>
</html>