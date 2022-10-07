<%-- 
    Document   : PrintTicketSearch
    Created on : Oct 6, 2022, 11:20:01 AM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="css/login.css"></link>
        <link rel="stylesheet" href="bootstrap/bootstrap.min.css">
         <link rel="stylesheet" href="bootstrap/bootstrap-theme.min.css">
       <script src="bootstrap/jquery.min.js"></script>
        <script src="bootstrap/bootstrap.min.js"></script>

       
        <title>Print</title>
        <style>
            .input-box{
				margin-bottom: 15px;
				width: calc(100% / 1);
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
            .PrintF{
				max-width: 1170px;
				width: 100%;
				background: linear-gradient(135deg, #bbe2f8, #bbf6bb);
				padding: 100px 30px;
				align-items: center;
			}
            
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

            button{
                border-color: 2px;
				transition: all 0.3s ease;
                padding-left: 15px;
                height: 35px;
				width: 100%;
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
			button:hover{
				background: linear-gradient(-135deg, #CCE5FF, #99FF99);
			}
        </style>
        
    </head>
    <body>
        
        <form id="index" action="PrintTicket-F[P]" method="post">
            
                               <center><img src="/images/PhoenixLogo.jpg" width="180px" height="150px" ></center>
                                <br>
                            <div class="PrintF">
                                
                                <div class="input-box">
	      		                   
                                    <input type="text" id="u_id" name="ticketno" class="form-control" style="width:300px; margin-left: 66px;" placeholder="Enter Your PNR No"><br>
                                    
			        </div>

                                <div class="button">
                                    
                                    <input type="submit" id="u_sub" name="pnr" value="Search" class="toggle btn btn-primary" style="width:100px; margin-left: 70px;">
                                    <button type="button" onclick="location.href = 'index.html';" class="toggle btn btn-primary" style="width:100px; margin-left: 20px;">Back</button>
	                            </div>                                    
                                   
                                   
                                </div>
                
                    
              
             
        </form>  
        
       </body>
</html>

