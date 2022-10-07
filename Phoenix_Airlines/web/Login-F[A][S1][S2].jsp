<%-- 
    Document   : LogIn
    Created on : Oct 1, 2022, 7:43:04 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>
			Account Login for Staff Members
		</title>
		<style>
			input {
    			border: 1.5px solid #030337;
    			border-radius: 10px;
    			padding: 7px 30px;
			}
			input[type=submit] {
				background-color: #52ad0054;
				color: white;
    			border-radius: 20px;
    			padding: 7px 45px;
    			margin: 0px 60px
			}
			form .button input:hover{
			background: linear-gradient(-135deg, #CCE5FF, #99FF99);
			color:black;
			}
			
		</style>
		<link rel="stylesheet" type="text/css" href="/htmlAll/style.css"/>
		<link rel="stylesheet" href="/font-awesome-4.7.0/css/font-awesome.min.css">
	</head>
	<body class="Lbody">
		<img class="logo" src="/images/PhoenixLogo.jpg"/> 
		<h1 id="title">
		Phoenix Airline	</h1>
		<div class="navbar">
			<ul class="Lnavbar">
				<li><a href="home_page.php"><i class="fa fa-home" aria-hidden="true"></i> Home</a></li>
				<li><a href="login_page.php"><i class="fa fa-ticket" aria-hidden="true"></i> Book Tickets</a></li>
				<li><a href="home_page.php"><i class="fa fa-plane" aria-hidden="true"></i> About Us</a></li>
				<li><a href="home_page.php"><i class="fa fa-phone" aria-hidden="true"></i> Contact Us</a></li>
				<li><a href="login_page.php"><i class="fa fa-sign-in" aria-hidden="true"></i> Login</a></li>
		</ul>
		</div>
		<br>
		<br>
		<br>
		<form class="float_form" style="padding-left: 40px" action="AdminLogin-DB[A][S1][S2].jsp" method="POST">
			<fieldset>
				<legend>Admin/Staff Login Details:-</legend>
				<strong>Staff ID</strong><br>
				<input type="text" name="L_email" placeholder="Enter your Staff ID" required><br><br>
                                
				
                                <strong>Password</strong><br>
				<input type="password" name="L_pswd" placeholder="Enter your Password" required><br><br>
				
				
                                <div class="button">
				<button type="submit" name="action" value="login">Sign Up</button>
				</div>
			</fieldset>
			<br>
			<a href="new_user.php"><i class="fa fa-user-plus" aria-hidden="true"></i><span class="txt1"> <strong>Create New User Account?</strong></span></a>
		</form>
	</body>
</html>