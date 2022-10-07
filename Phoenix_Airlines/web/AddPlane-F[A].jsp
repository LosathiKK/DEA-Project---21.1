<%-- 
    Document   : AddPlane
    Created on : Oct 6, 2022, 3:34:01 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>
			Add Aircrafts Details
		</title>
		<style>
			input {
    			border: 1.5px solid #030337;
    			border-radius: 4px;
    			padding: 7px 30px;
			}
			input[type=submit] {
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
			.button input:hover{
			background: linear-gradient(-135deg, #CCE5FF, #99FF99);
			color:black;
			}
			.ADM{
				width:100%;
				text-align:center;
				background: linear-gradient(-135deg, #CCE5FF, #99FF99);
				padding: 20px;
			}
			.eidtA {
				width: 175px;
				display: inline-block;
			}
			.ADnavbar{
				padding-left: 375px;
			}
	
		</style>
		<link rel="stylesheet" type="text/css" href="../htmlAll/style.css"/>
		<link rel="stylesheet" href="/font-awesome-4.7.0/css/font-awesome.min.css">
	</head>
	<body>
		<img class="logo" src="/images/PhoenixLogo.jpg"/> 
		<h1 id="title">
		Phoenix Airline
		</h1>
		<div class="navbar">
			<ul class="ADnavbar">
				<li><a href="admin_homepage.php"><i class="fa fa-home" aria-hidden="true"></i> Home</a></li>
				<li><a href="admin_homepage.php"><i class="fa fa-desktop" aria-hidden="true"></i> Dashboard</a></li>
				<li><a href="logout_handler.php"><i class="fa fa-sign-out" aria-hidden="true"></i> Logout</a></li>
			</ul>
		</div>
		<form action="AddPlane-DB[A]" method="post">
                    
			<h2>ENTER THE AIRCRAFTS DETAILS</h2>
			
		<div class="ADM">

		<div class="AD">
			<label for="planename" class="eidtA">Enter Name of the Plane</label>
			<input type="text" name="planename">
		</div>

		<div class="AD">
			<label for="model" class="eidtA">Enter model of plane</label>
			<input type="text" name="model" required>
		</div>
		
		<div class="AD">
			<label for="airlines" class="eidtA">Enter the Airlines the plane belongs to</label>
			<input type="text" name="airlines" required>
		</div>

		<div class="AD">
			<label for="airlines" class="eidtA">Total number of seats</label>
			<input type="number" name="airlines" required>
		</div>

			<br>
			<br>

		<div class="button">
			<input type="submit" value="Submit" name="Submit">
		</div>
		</div>

		</form>
	</body>
</html>
