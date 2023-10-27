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
  <h2>Login To Your Account</h2>
  
  <form class="loginbox" autocomplete="off" action="" method="post">
  <p class="error">Please enter correct Email &amp; password.</p>
    <input class="inputform" placeholder="Email" type="email" id="email" required=""></input>
    <input class="inputform" placeholder="Password" type="password" id="password" required=""></input>
<button id="submit">Login</button>
<br>
<br>
 
<a class="blogin" href="regester">Regester</a> 
<samp> | </samp>
<a class="blogin" href="password">Forget Password !</a>

</form>
</section>
 
<script src="JS/login.js"></script>
</body>
</html>