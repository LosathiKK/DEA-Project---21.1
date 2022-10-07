<%-- 
    Document   : PrintTicket
    Created on : Oct 5, 2022, 11:18:14 AM
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        
         <link rel="stylesheet" href="bootstrap/bootstrap.min.css">
         <link rel="stylesheet" href="bootstrap/bootstrap-theme.min.css">
       <script src="bootstrap/jquery.min.js"></script>
        <script src="bootstrap/bootstrap.min.js"></script>
        <link type="text/css" rel="stylesheet" href="css/admform.css"></link>
        
        <script type="text/javascript">
            function printpage()
            {
            var printButton = document.getElementById("print");
            printButton.style.visibility = 'hidden';
            window.print()
             printButton.style.visibility = 'visible';
             }
        </script>
        <style type="text/css">

          
          input {
    			    border: 1.5px solid #030337;
    			    border-radius: 4px;
    			    padding: 7px 30px;
          }

          input[type=submit]{
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

        </style>
        
        
    </head>
    
       <%
            String driver = "com.mysql.jdbc.Driver";
            String connectionUrl = "jdbc:mysql://localhost:3306/";
            String database = "phoenix_airline";
            String userid = "root";
            String password = "";
            String pnr=request.getParameter("pnr");           
            try {
            Class.forName(driver);
            } catch (ClassNotFoundException e) {
            e.printStackTrace();
            }
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;
            %>
 
<%
            try{
            connection = DriverManager.getConnection(connectionUrl+database, userid, password);
            statement=connection.createStatement();
            String sql ="select Ticket_No,Flight_ID, from passengers where PNR='"+pnr+"'";
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
%>

<hr style="border: 1px solid black;border-style: dashed;">
<center><h3>Phoenix Airline</h3></center>
<center><h2>Boarding Pass - Flight Reservation Slip</h2></center><h4> booking_status</h4>
<br>
<td style="width:4%;"> <font style="font-family: Verdana;">Ticket No : </font> </td>
                    <td style="width:8%;" colspan="3"> Ticket_No </td>
<td style="width:4%;"> <font style="font-family: Verdana;">Flight No : </font> </td>
                    <td style="width:8%;" colspan="3"> Flight_ID </td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<td style="width:4%;"> <font style="font-family: Verdana;">Date of journey : </font> </td>
                    <td style="width:8%;" colspan="3">  Departure_Time </td><br>
<td style="width:4%;"> <font style="font-family: Verdana;">Class : </font> </td>
                    <td style="width:8%;" colspan="3"> Class </td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<td style="width:4%;"> <font style="font-family: Verdana;">Payment ID : </font> </td>
                    <td style="width:8%;" colspan="3"> Payment_ID </td><br>
<td style="width:4%;"> <font style="font-family: Verdana;">Booked By (Username): </font> </td>
                    <td style="width:8%;" colspan="3"> First_Name+Last_Name </td><br>
<td style="width:4%;"> <font style="font-family: Verdana;">Status: </font> </td>
                    <td style="width:58%;" colspan="3">  </td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<td style="width:4%;"> <font style="font-family: Verdana;">No. of Passengers: </font> </td>
                    <td style="width:58%;" colspan="3"> count where Ticket_No= </td>
                  
<%
            }
            connection.close();
            } catch (Exception e) {
            e.printStackTrace();
            }
%>                   

    <body>
      
<hr>
         
          <div class="container-fluid">
              <div class="row">
                  <div class="col-sm-12">
                    <center>  <table class="table table-bordered" style="font-family: Verdana">
                    <center><font style="font-family:Verdana; font-size:18px;"></font></center>
                
                <br>
                <br>
                    <font style="font-family:Arial Black; font-size:20px;"></font>
                    <tr>
                      <td colspan="2" width="3%" >
                        
                  
                         
                      </td>   
                    </tr>
                    
                    <tr>
                        <td style="width:4%;"> <font style="font-family: Verdana;">PNR : </font> </td>
                        <td style="width:8%;" colspan="3">  </td>
                    </tr>
                 
                 
                    <tr>
                        <td> <font style="font-family: Verdana;">Passenger No : </font> </td>
                        <td colspan="3">  
                    </tr>
                  
                    <tr>
                      <td> <font style="font-family: Verdana;"> Name :</font>  </td>
                      <td colspan="3">  <br>
                       </td>
                    </tr>
                
                    <tr>
                      <td><font style="font-family: Verdana;"> Gender :</font></td>
                      <td  colspan="3">  </td>
                    </tr>
                 
                    <tr>
                      <td> <font style="font-family: Verdana;">Meail Choice :</font></td>
                      <td>  </td>
                      <td><font style="font-family: Verdana;"> Frequent Flier No. (If any)</font></td>
                      <td>   </td>
                    </tr>
 
                       </table></center>
                  </div>
              </div>
            </div>
        
              }
        

 <p> 
    <div class="button">
        <input type="submit" id="print" class="toggle btn btn-primary" value="Print" onclick="printpage();">
	  </div>
    <br>
<CENTER><a class="print_hide" href="pnr.php">Check other PNR</a></center>
    
</p>
  

    </body>
</html>


                     