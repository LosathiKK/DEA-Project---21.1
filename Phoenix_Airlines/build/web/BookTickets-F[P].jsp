<%-- 
    Document   : BookTickets
    Created on : Oct 3, 2022, 11:31:19 AM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>
			View Available Flights
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
			.button input[type=submit]:hover{
				background: linear-gradient(-135deg, #CCE5FF, #99FF99);
			}
			.button{
				text-align: center;
				
			}
			input[type=date] {
				border: 1.5px solid #030337;
    			border-radius: 4px;
    			padding: 5.5px 44.5px;
			}
			select {
    			border: 1.5px solid #030337;
    			border-radius: 4px;
    			padding: 6.5px 75.5px;
			}
			.SAF{
				max-width: 1175px;
				width: 100%;
				background: linear-gradient(135deg, #bbe2f8, #bbf6bb);
				padding: 25px 30px;
				border-radius: 5px;	
			}
			.title{
				text-align: center;
				font-size: 25px;
				font-weight: 500;
				position: relative;
			}
			.title::before{
				content: '';
				position: absolute;
				bottom: 0;
				height: 3px;
				width: 425px;
				background: linear-gradient(135deg, #CCE5FF, #99FF99);
			}
			.AF{
				display: flex;
				flex-wrap: wrap;
				justify-content: space-between;
				margin: 20px 0 12px 0;
			}
			.input-box{
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
			.AF .input-box input:focus,
			.AF .input-box input:valid{
				border-color:#9b59b6;
			}
			select{
				height: 45px;
				width: 100%;
				outline: none;
				border: 1px solid #ccc;
				padding-left: 15px;
				font-size: 16px;
				border-color: 2px;
				transition: all 0.3s ease;
			}
			.AF .input-box select:focus,
			.AF .input-box select:valid{
				border-color:#9b59b6;
			}
		</style>
		<link rel="stylesheet" type="text/css" href="/htmlAll/style.css"/>
		<link rel="stylesheet" href="/font-awesome-4.7.0/css/font-awesome.min.css">
	</head>
	<body>
		<img class="logo" src="/images/PhoenixLogo.jpg"/> 
		<h1 id="title">
		Phoenix Airline
		</h1>
		<div>
			<ul>
				<li><a href="customer_homepage.php"><i class="fa fa-home" aria-hidden="true"></i> Home</a></li>
				<li><a href="customer_homepage.php"><i class="fa fa-desktop" aria-hidden="true"></i> Dashboard</a></li>
				<li><a href="home_page.php"><i class="fa fa-plane" aria-hidden="true"></i> About Us</a></li>
				<li><a href="home_page.php"><i class="fa fa-phone" aria-hidden="true"></i> Contact Us</a></li>
				<li><a href="logout_handler.php"><i class="fa fa-sign-out" aria-hidden="true"></i> Logout</a></li>
			</ul>
		</div>

	<div class="SAF">

		<form action="BookTicket-DB[P].jsp" method="post">
			<div class="title">SEARCH FOR AVAILABLE FLIGHTS</div>
			
                    <div class="AF">

                            <div class="input-box">
                                    <span class="details">Enter the Origin</span>
                                    <input type="text" name="from" placeholder="From" required>

                            </div>

                             <div class="input-box">
                            <span class="details">Enter the Destination</span>
                                    <input type="text" name="to" placeholder="To" required>

                            </div>

                             <div class="input-box">
                            <span class="details">Enter the Departure Date</span>
                                    <input type="date" name="depdate" min=

                            </div>

                             <div class="input-box">
                            <span class="details"> No. of Economy Class Passengers</span>
                                    <input type="number" name="ecocount" placeholder="Eg. 5" required>
                            </div>

                             <div class="input-box">
                            <span class="details"> No. of Business Class Passengers</span>
                                    <input type="number" name="buscount" placeholder="Eg. 5" required>
                            </div>

                            </div>

                            <div class="button">
                                    <input type="submit" value="Search for Available Flights" name="Search">
                            </div>
                       </div>
		</form>
	
	</body>
</html>
