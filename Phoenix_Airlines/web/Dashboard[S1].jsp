<%-- 
    Document   : Staff1Dashboard
    Created on : Oct 4, 2022, 6:53:21 AM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>
			staff 02 dashboard
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
			
			
		</style>
		<link rel="stylesheet" type="text/css" href="../htmlAll/style.css"/>
		<link rel="stylesheet" href="/font-awesome-4.7.0/css/font-awesome.min.css">
	</head>
	<body>
		<img class="logo" src="/images/PhoenixLogo.jpg"/> 
		<h1 id="title">
		Phoenix Airline	</h1>
		<div class="navbar">
			<ul class="Anavbar">
				<li><a href="index.html"><i class="fa fa-home" aria-hidden="true"></i> Home</a></li>
				<li><a href=""><i class="fa fa-desktop" aria-hidden="true"></i> Dashboard</a></li>
				<li><a href="LogoutHandler.jsp"><i class="fa fa-sign-out" aria-hidden="true"></i> Logout</a></li>
			</ul>
		</div>
		<center><h2>Flight Delete Section</h2></center>
		<table class="adminT" border="2px solid #000">
			
			<tr>
                            <td class="admin_func"><a href="AddFlight-F[A[S1][S2].jsp">
                                    <i class="fa fa-plane" aria-hidden="true"></i> Add Flight Schedule Details </a>
                            </td>
                            
                            <td class="admin_func"><a href="ActivatePlane-F[A][S1][S2].jsp">
                                    <i class="fa fa-plane" aria-hidden="true"></i> Activate Aircraft </a>
                            </td>
			</tr>
			<tr>
                            <td class="admin_func"><a href="DeleteFlight-F[A][S1].jsp">
                                    <i class="fa fa-plane" aria-hidden="true"></i> Delete Flight Schedule Details</a>
                            </td>
                            
                            <td class="admin_func"><a href="ActivatePlane-F[A][S1][S2].jsp">
                                    <i class="fa fa-plane" aria-hidden="true"></i> Deactivate Aircraft </a>
                            </td>
			</tr>
			<tr>
                            <td class="admin_func"><a href="ViewBookedTicketsForFlight-F[A][S1][S2].jsp">
                                    <i class="fa fa-plane" aria-hidden="true"></i> View Booked Ticket details</a>
                            </td>  
			</tr>
		</table>
	</body>
</html>
