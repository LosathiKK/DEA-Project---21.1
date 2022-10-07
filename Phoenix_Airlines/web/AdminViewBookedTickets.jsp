<%-- 
    Document   : UserBookedTickets
    Created on : Oct 5, 2022, 6:42:50 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>
			View Booked Tickets
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
    			margin: 0px 390px
			}
			table {
			 border-collapse: collapse; 
			 margin-left: 10%;
			 margin-right: 10%;
			}
			tr/*:nth-child(3)*/ {
			 border: solid thin;
			}
			.set_nice_size{
				font-size: 17pt;
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
		<center><h2>VIEW BOOKED FLIGHT TICKETS</h2></center>
		<h3 class='set_nice_size'><center><u>Upcoming Trips</u></center></h3>
				 <h3><center>No upcoming trips!</center></h3>
			
			<table cellpadding="10">
                            <tr>
                                <th>Ticket No.</th>
                                <th>Date of Reservation</th>
                                <th>Flight No.</th>
                                <th>Journey Date</th>
                                <th>Class</th>
                                <th>No. of Passengers</th>
                                <th>Payment ID</th>
                            </tr>
				
                            <tr>
                                <td>Ticket_no</td>
                                <td>date_of_reservation.</td>
                                <td>flight_no.</td>
                                <td>journey_date.</td>
                                <td>class.</td>
                                <td>no_of_passengers.</td>
                                <td>payment_id.</td>
                            </tr>
    			
            </table> <br>
			
			 <br><h3 class="set_nice_size"><center><u>Completed Trips</u></center></h3>

			
			
				 <h3><center>No trips completed in the past 30 days!</center></h3>
			
				<table cellpadding="10">
					<tr>
						<th>Ticket No.</th>
						<th>Date of Reservation</th>
						<th>Flight No.</th>
						<th>Journey Date</th>
						<th>Class</th>
						<th>No. of Passengers</th>
						<th>Payment ID</th>
					</tr>
					
					<tr>
						<td>Ticket_no</td>
						<td>date_of_reservation.</td>
						<td>flight_no.</td>
						<td>journey_date.</td>
						<td>class.</td>
						<td>no_of_passengers.</td>
						<td>payment_id.</td>
					</tr>
    			
            </table> <br>
    </body>
</html>
		
		
