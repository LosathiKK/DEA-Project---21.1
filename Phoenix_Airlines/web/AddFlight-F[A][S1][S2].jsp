<%-- 
    Document   : AddFlight
    Created on : Oct 6, 2022, 4:27:13 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>
			Add Flight Schedule Details
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
			.ADnavbar{
				padding-left: 375px;
			}
			.ADM{
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
				width: 500px;
				background: linear-gradient(135deg, #CCE5FF, #99FF99);
			}
			.AD{
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
			.AD .input-box input:focus,
			.AD .input-box input:valid{
				border-color:#9b59b6;
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
		<div class="ADM">
		<form action="AddFlight-DB[A]" method="post">
			<div class="title">ENTER THE FLIGHT SCHEDULE DETAILS</div>
			
			
	
                <div class="AD">

			 <div class="input-box">
	     		 <span class="details"> Flight ID</span>
				 <input type="number" name="flightid" required>
	    	 </div>

			 <div class="input-box">
	     		 <span class="details">Airplane ID</span>
				  <input type="text" name="plane" required>
	    	 </div>

	    	 <div class="input-box">
	      		 <span class="details">Origin</span>
	     		 <input type="text" name="origin" required>
			 </div>

	    	 <div class="input-box">
	      		 <span class="details">Destination</span>
	      		 <input type="text" name="destination" required>
	    	 </div>

	    	 <div class="input-box">
	      		 <span class="details">Departure Date</span>
	      		 <input type="date" name="dep_date" required>
	   		 </div>

	   		<div class="input-box">
	      		<span class="details">Arrival Date</span>
	     		<input type="date" name="arr_date" required>
	   		</div>

	    	<div class="input-box">
	     		 <span class="details">Departure Time</span>
	     		 <input type="time" name="dep_time" required>
	    	</div>

			<div class="input-box">
	      		<span class="details">Arrival Time</span>
	      		<input type="time" name="arr_time" required>
	   	 	</div>

			<div class="input-box">
	      		<span class="details">Number of Seats in Economy Class</span>
	      		<input type="number" name="seats_eco" required>
	   		 </div>

			<div class="input-box">
	     		<span class="details">Number of Seats in Business Class</span>
	      		<input type="number" name="seats_bus" required>
	   		 </div>

			<div class="input-box">
	      		<span class="details">Ticket Price(Economy Class)</span>
	      		<input type="number" name="price_eco" required>
	    	</div>

			<div class="input-box">
	      		<span class="details">Ticket Price(Business Class)</span>
	      		<input type="number" name="price_bus" required>
	    	</div>

	  	</div>
	  <div class="button">
	    <input type="submit" value="Submit" name="Submit">
	  </div>
	
  
		</form>
		</div>
		
	</body>
</html>
