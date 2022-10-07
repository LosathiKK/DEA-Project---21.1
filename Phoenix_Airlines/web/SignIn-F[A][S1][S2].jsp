<%-- 
    Document   : AdminSignIn
    Created on : Oct 2, 2022, 12:15:30 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>
			Create New User Account
		</title>
		<style>
			input[type=submit] {
				height: 100%;
				width: 20%;
				outline: none;
				color: black;
				border: none;
				font-size: 18px;
				font-weight: 500;
				border-radius: 5px;
				box-shadow: 0 2px 5px gray;
				letter-spacing: 1px;
				background: linear-gradient(135deg, #CCE5FF, #99FF99);
			}
			.button input[type=submit]:hover{
				background: linear-gradient(-135deg, #CCE5FF, #99FF99);
			}
			.navbar{
				padding-left: 250px;
			}
			.NU{
				max-width: 1175px;
				width: 100%;
				background: linear-gradient(135deg, #bbe2f8, #bbf6bb);
				padding: 25px 30px;
				border-radius: 5px;	
			}
			.title{
				text-align: center;
				font-size: 25px;
				font-weight: 500px;
				position: relative;
			}
			.title::before{
				content: '';
				position: absolute;
				bottom: 0;
				height: 3px;
				width: 300px;
				background: linear-gradient(135deg, #CCE5FF, #99FF99);
			}
			.title1{
				text-align: center;
				font-size: 25px;
				font-weight: 500px;
				position: relative;
			}
			.title1::before{
				content: '';
				position: absolute;
				bottom: 0;
				height: 3px;
				width: 525px;
				background: linear-gradient(135deg, #CCE5FF, #99FF99);
			}
			.ELD{
				
				justify-content: space-between;
				margin: 20px 0 12px 0;
			}
			.ECPD{
				
				justify-content: space-between;
				margin: 20px 0 12px 0;
			}
			.input-box{
				padding-left:275px;
				margin-bottom: 15px;
				width: calc(100% / 2 - 20px);
			}
			.details{
				font-weight: 500;
				margin-bottom: 5px;
			}
			.input-box input{
				height: 45px;
				width: 100%;
				outline: none;
				border: 1px solid #ccc;
				padding-left: 15px;
				font-size: 16px;
				border-color: 2px;
				transition: all 0.3s ease;
			}
			.ELD .input-box input:focus,
			.ELD .input-box input:valid{
				border-color:#9b59b6;
			}
			.ECPD .input-box input:focus,
			.ECPD .input-box input:valid{
				border-color:#9b59b6;
			}
			.button{
				text-align: center;
				height: 45px;
				margin: 45px 0;
				
			}
		</style>
		<link rel="stylesheet" type="text/css" href="/htmlAll/style.css"/>
		<link rel="stylesheet" href="/font-awesome-4.7.0/css/font-awesome.min.css">
	</head>
	<body>
		<img class="logo" src="/images/PhoenixLogo.jpg"/> 
		<h1 id="title">
		Phoenix Airline		</h1>
		<div >
			<ul class="navbar">
				<li><a href="home_page.php"><i class="fa fa-home" aria-hidden="true"></i> Home</a></li>
				<li><a href="login_page.php"><i class="fa fa-ticket" aria-hidden="true"></i> Book Tickets</a></li>
				<li><a href="home_page.php"><i class="fa fa-plane" aria-hidden="true"></i> About Us</a></li>
				<li><a href="home_page.php"><i class="fa fa-phone" aria-hidden="true"></i> Contact Us</a></li>
				<li><a href="login_page.php"><i class="fa fa-sign-in" aria-hidden="true"></i> Login</a></li>
			</ul>
		</div>
		<br>
	<div class="NU">
		<form class="center_form" action="Adminlogin-DB[A][S1][S2]" method="POST" id="new_user_from">
			<h2><i class="fa fa-user-plus" aria-hidden="true"></i> CREATE NEW STAFF ACCOUNT</h2>
			<br>

		<div class="ELD">

			<div class="title"><strong>ENTER NEW STAFF/ADMIN DETAILS</strong></div>
                        
                        
                        <div class="input-box">
					<span class="details">Staff ID</span>
					<input type="text" name="staffid" required>
			 </div>

			 <div class="input-box">
					<span class="details">Password</span>
					<input type="text" name="pswd" required>
			 </div>

			 <div class="input-box">
					<span class="details">Repeat Password</span>
					<input type="text" name="pswd" required>
			 </div>
			<br>
                        
                        <div class="input-box">
                            <span class="details">First Name</span>
                            <input type="text" name="fname" required>
			</div>
                        
                        <div class="input-box">
                            <span class="details">Last Name</span>
                            <input type="text" name="lname" required>
			</div>
                        <br>
                        
			<div class="input-box">
                            <span class="details">Gender</span>
                            <select name=gender[]>
                                <option value=male>Male</option>
                                <option value=female>Female</option>
                                <option value=other>Other</option>
                            </select> 
                        
                        <br>
                        
			</div>
                        
			<div class="input-box">
                            <span class="details">Birth Date</span>
				<input type="text" name="bday" required>
			</div>
                        
			<div class="input-box">
                            <span class="details">Mobile_No</span>
				<input type="text" name="mobile" >
			</div>
                        
                        <br>
                        
                        <div class="input-box">
                            <span class="details">Position</span>
                            <select name=position>
                                <option value=g1staff>Staff [Grade 1]</option>
                                <option value=g2staff>Staff [Grade2]</option>
                                <option value=admin>Admin</option>
                            </select> 
                            
			</div>
                        
                        <br>

                        <div class="button">
                            <button type="submit" name="action" value="signup">Sign Up</button>
			</div>
			

		</div>

			<br>
		</form>
	</div>
	</body>
</html>
