<%-- 
    Document   : ViewFlights
    Created on : Oct 4, 2022, 10:57:42 AM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>


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
    			padding: 7px 45px;
    			margin: 0px 475px
			}
			input[type=submit]:hover{
				background: linear-gradient(-135deg, #CCE5FF, #99FF99);
			}
			table {
			 border-collapse: collapse; 
			}
			tr/*:nth-child(3)*/ {
			 border: solid thin;
			}
			.AF{
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
			
		</style>
		<link rel="stylesheet" type="text/css" href="/htmlAll/style.css"/>
		<link rel="stylesheet" href="/font-awesome-4.7.0/css/font-awesome.min.csss">
	</head>
	<body>
		<img class="logo" src="/images/PhoenixLogo.jpg"/> 
		<h1 id="title">
		Phoenix Airline
		</h1>
		<div>
			<ul>
				<li><a href="home_page.php"><i class="fa fa-home" aria-hidden="true"></i> Home</a></li>
				<li><a href="customer_homepage.php"><i class="fa fa-desktop" aria-hidden="true"></i> Dashboard</a></li>
				<li><a href="home_page.php"><i class="fa fa-plane" aria-hidden="true"></i> About Us</a></li>
				<li><a href="home_page.php"><i class="fa fa-phone" aria-hidden="true"></i> Contact Us</a></li>
				<li><a href="logout_handler.php"><i class="fa fa-sign-out" aria-hidden="true"></i> Logout</a></li>
			</ul>
		</div>
		<div class="AF">
		<div class="title">AVAILABLE FLIGHTS</div>
                

        <%
            String driver = "com.mysql.jdbc.Driver";
            String connectionUrl = "jdbc:mysql://localhost:3306/";
            String database = "phoenix_airline";
            String userid = "root";
            String password = "";
            String from=request.getParameter("from");
            String to=request.getParameter("to");
            String depdate=request.getParameter("depdate");
            String ecocount=request.getParameter("ecocount");
            String buscount=request.getParameter("buscount");
            
            try {
            Class.forName(driver);
            } catch (ClassNotFoundException e) {
            e.printStackTrace();
            }
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;
            %>

            <h1>Search Data</h1>
            <table border="1">
            <tr>
            <td>Flight ID</td>
            <td>Airplane Id</td>
            <td>Description</td>
            <td>Availability(1 means available) </td>
            <td>Departure Date</td>
            <td>Departure Time</td>
            <td>Arrival Date</td>
            <td>Arrival Time</td>
            <td>Airport</td>
            <td>Destination</td>
            <td>Economy Class Seats</td>
            <td>Business class Seats</td>
            <td>Economy Class Price</td>
            <td>Business Class Price</td>
            

            </tr>
            <%
            try{
            connection = DriverManager.getConnection(connectionUrl+database, userid, password);
            statement=connection.createStatement();
            String sql ="select * from flight where Airport='"+from+"'and Next_Airport='"+to+"' and Departure_Date='"+depdate+"' and Economy_Available > '"+ecocount+"' and Business_available >'"+buscount+"'  ";
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
            %>
            <tr>
            <td><%=resultSet.getString("Flight_ID") %></td>
            <td><%=resultSet.getString("Airplane_ID") %></td>
            <td><%=resultSet.getString("Description") %></td>
            <td><%=resultSet.getString("Availability") %></td>
            <td><%=resultSet.getString("Departure_Date") %></td>
            <td><%=resultSet.getString("Departure_Time") %></td>
            <td><%=resultSet.getString("Arrival_Date") %></td>
            <td><%=resultSet.getString("Arrival_Time") %></td>
            <td><%=resultSet.getString("Airport") %></td>
            <td><%=resultSet.getString("Next_Airport") %></td>
            <td><%=resultSet.getString("Economy_Available") %></td>
            <td><%=resultSet.getString("Business_Available") %></td>
            <td><%=resultSet.getString("Economy_Price") %></td>
            <td><%=resultSet.getString("Bussiness_Prices") %></td>
            </tr>
            <%
            }
            connection.close();
            } catch (Exception e) {
            e.printStackTrace();
            }
            %>
		
		</div>
	</body>
</html>