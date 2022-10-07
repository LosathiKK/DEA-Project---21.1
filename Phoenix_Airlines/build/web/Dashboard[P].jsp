<%-- 
    Document   : CustomerDashboard
    Created on : Sep 28, 2022, 9:45:05 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>
			Welcome Customer
		</title>
		<style>
			a {
				color: #030337;
				text-decoration: none;
				
			}
			a:hover{
				background: linear-gradient(135deg, #cce5ff00, #99ff997d);
				color: #030337;
				text-decoration: none;
			}
			table,th,td .adminT{
				width: 100%;
				height: 300px;
				background: linear-gradient(-135deg, #CCE5FF, #99FF99);
				margin:auto;
				text-align: center;
				border-collapse: collapse;
				table-layout: fixed;
	
			}
			table,th,td:hover{
				background: linear-gradient(-135deg, #CCE5FF, #99FF99);
				color:black;
			}
            .title{
                padding-top: 20PX;
                padding-bottom: 20PX;
				text-align: center;
				font-size: 25px;
				font-weight: 500;
				position: relative;
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
				<li><a href="index.html"><i class="fa fa-home" aria-hidden="true"></i>Home</a></li>
                                <li><a href="PrintTicketSearch.jsp"><i class="fa fa-desktop" aria-hidden="true"></i> Print Ticket</a></li>
				<li><a href="AboutUs.html"><i class="fa fa-plane" aria-hidden="true"></i> About Us</a></li>
				<li><a href="ContactUs.html"><i class="fa fa-phone" aria-hidden="true"></i> Contact Us</a></li>
				<li><a href="Logout.jsp"><i class="fa fa-sign-out" aria-hidden="true"></i> Logout</a></li>
			</ul>
		</div>
        <div class="title">WELCOME </div>
		
		<table class="adminT" border="2px solid #000">
			
			<tr>
				<td class="admin_func"><a href="BookTicket-F[A].jsp"><i class="fa fa-plane" aria-hidden="true"></i> Book Flight Tickets</a>
				</td>
				<td class="admin_func"><a href="ViewBookedTickets-DB[P].jsp"><i class="fa fa-plane" aria-hidden="true"></i> View Booked Flight Tickets</a>
				</td>
			</tr>
			
			<tr>
				<td class="admin_func"><a href="PrintTicketSearch.jsp"><i class="fa fa-plane" aria-hidden="true"></i> Print Booked Ticket</a>
				</td>
				<td class="admin_func"><a href=""><i class="fa fa-plane" aria-hidden="true"></i> Cancel Booked Flight Tickets</a>
				</td>
			</tr>
	</body>
</html>
