<%-- 
    Document   : AddPassengers
    Created on : Oct 5, 2022, 11:39:29 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

		<html>
            <head>
                <title>
                    Enter Travel/Ticket Details
                </title>
                <style>
                    input {
                        border: 1.5px solid #030337;
                        border-radius: 4px;
                        padding: 7px 10px;
                    }
                    input[type=number] {
                        border: 1.5px solid #030337;
                        border-radius: 4px;
                        padding: 7px 0px;
                        gap:100px;
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
                        margin: 0px 400px
                    }
                    input[type=submit]:hover{
                        background: linear-gradient(-135deg, #CCE5FF, #99FF99);
                    }
        
                    input[type=radio] {
                        margin-right: 30px;
                    }
                    select {
                        border: 1.5px solid #030337;
                        border-radius: 4px;
                        padding: 6.5px 15px;
                    }
                    .APD{
                        max-width: 1175px;
                        width: 100%;
                        background: linear-gradient(135deg, #bbe2f8, #bbf6bb);
                        padding: 25px 30px;
                        border-radius: 5px;	
                    }
                    .input-box{
                        margin-bottom: 15px;
                        width: calc(100% / 2 - 20px);
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
                    .APD2{
                        justify-content: space-between;
                        margin: 20px 0 12px 0;
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
                        <li><a href="home_page.php"><i class="fa fa-home" aria-hidden="true"></i> Home</a></li>
                        <li><a href="customer_homepage.php"><i class="fa fa-desktop" aria-hidden="true"></i> Dashboard</a></li>
                        <li><a href="home_page.php"><i class="fa fa-plane" aria-hidden="true"></i> About Us</a></li>
                        <li><a href="home_page.php"><i class="fa fa-phone" aria-hidden="true"></i> Contact Us</a></li>
                        <li><a href="logout_handler.php"><i class="fa fa-sign-out" aria-hidden="true"></i> Logout</a></li>
                    </ul>
                </div>
        
                <div class="APD">
					 <p><strong>PASSENGER .$count.<strong></p>
                                       <form action="AddPassengerToTicket-DB[P].jsp" method="post">            
					 <table cellpadding=0>
					 <tr class=APD2>
                                         <td class="input-box">Passenger Passport ID </td>
					 <td class="input-box">Passenger First Name</td>
					 <td class="input-box">Passenger Last Name</td>
					 <td class="input-box">Passenger Age</td>
					 <td class="input-box">Passenger Gender</td>
					 <td class="input-box">Passenger Inflight Meal</td>
					 
					 </tr>
					 <tr class=APD2>
					 <td class="input-box"><input type=text name=pass_passid[] required></td>
					 <td class="input-box"><input type=text name=pass_fname[] required></td>
					 <td class="input-box"><input type=text name=pass_lname[] required></td>
					 <td class="input-box"><input type=number name=pass_age[] required></td>
					 <td class="input-box">
					 <select name=pass_gender[]>
  					 <option value=male>Male</option>
  					 <option value=female>Female</option>
  					 <option value=other>Other</option>
  					 </select>
  					 </td>
  					 <td class="input-box">
					 <select name=pass_meal[]>
  					 <option value=yes>Yes</option>
  					 <option value=no>No</option>
  					 </select>
  					 </td>
					 </tr>
					 </table>
					 <br><hr>
				
				 
				 <br><br>
                                 <Button type="submit" name="add" value="submit">Submit</button>
				 </form>
		
		</div>
	</body>
</html>
