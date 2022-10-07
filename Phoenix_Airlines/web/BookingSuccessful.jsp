<%-- 
    Document   : BookingSuccessful
    Created on : Oct 6, 2022, 11:01:36 AM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>
			Ticket Booking Successful
		</title>
		<style>
			input {
    			border: 1.5px solid #030337;
    			border-radius: 4px;
    			padding: 7px 30px;
			}
			input[type=submit] {
				background-color: #030337;
				color: white;
    			border-radius: 4px;
    			padding: 7px 45px;
    			margin: 0px 127px
			}
			.TS{
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
				width: 295px;
				background: linear-gradient(135deg, #CCE5FF, #99FF99);
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
		<div>
			<ul>
				<li><a href="customer_homepage.php"><i class="fa fa-home" aria-hidden="true"></i> Home</a></li>
				<li><a href="customer_homepage.php"><i class="fa fa-desktop" aria-hidden="true"></i> Dashboard</a></li>
				<li><a href="home_page.php"><i class="fa fa-plane" aria-hidden="true"></i> About Us</a></li>
				<li><a href="home_page.php"><i class="fa fa-phone" aria-hidden="true"></i> Contact Us</a></li>
				<li><a href="logout_handler.php"><i class="fa fa-sign-out" aria-hidden="true"></i> Logout</a></li>
			</ul>
		</div>
		<div class="TS">
			<div class="title">BOOKING SUCCESSFUL</div>
				<h3><center>Your payment of Rs. <?php echo $_SESSION['total_amount']; ?> has been received.</center><br><br> <center>Your Ticket_ID Is <strong><?php echo $_SESSION['pnr'];?></strong>. Your tickets have been booked successfully.</center></h3>
				<div>
					<table>
						<tr>
							<td>Passenger Name</td>
							<td>Name_No</td>
						</tr>
						<tr>
							<td>Passsport ID</td>
							<td> Passport_ID</td>
						</tr>
						<tr>
							<td>PNR</td>
							<td>PNR</td>
						</tr>
					</table>
				</div>
		</div>
	</body>
</html>
