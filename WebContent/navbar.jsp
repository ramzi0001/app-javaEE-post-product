<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <nav id="main-nav" >

                              <ul>
                                <li id="test1"><a href="index.php?page=addpost" class="<?php echo ($page=='addpost') ? 'active' : '' ?>"><i class="fas fa-plus"></i> Add new request</a></li>
                                <li id="test1"><a href="index.php?page=mypost" class="<?php echo ($page=='mypost') ? 'active' : '' ?>"><i class="fas fa-stream" class="<?php echo ($page=='mypost') ? 'active' : '' ?>"></i> My requests</a></li>
                                <li><a href="index.php?page=home"  class="<?php echo ($page=='home') ? 'active' : '' ?>"><i class="fas fa-home"></i> </a></li>
                                <li>
                                <span>
                                 <a href="index.php?page=profile" class="<?php echo ($page=='profile') ? 'active' : '' ?>">	<img src="images/<?php if(in_array($_SESSION['login'],scandir('images/'))){ echo $_SESSION['login'] ; }else {  echo "avatar.jfif" ; } ?> " height="80%" width="80%" /></a>
                                </span>
                              </li>
                              <li><a href="index.php?page=notifcation"  class="<?php echo ($page=='notif') ? 'active' : '' ?>"><i class="fas fa-bell"></i></a></li>

                              </ul>
                    </nav>

</body>
</html>