<%-- 
    Document   : AdminLogin-DB[A][S1][S2]
    Created on : Oct 3, 2022, 11:35:23 AM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*,java.util.*" %>
<html>

<head>

<meta http-equiv=”Content-Type” content=”text/html; charset=UTF-8">

<title>JSP Page</title>

</head>

<% 
    String action=request.getParameter("action");
    if(action.equals("signup")){
        
        String staffid = request.getParameter("staffid");
        String pswd = request.getParameter("pswd");
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String gender = request.getParameter("gender");
        String bday = request.getParameter("bday");
        String mobno = request.getParameter("mobno");
        
        
        try{
            Class.forName("com.mysql.jdbc.driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/phoenix_airline","root","");
            Statement st=con.createStatement();
            
            int j=st.executeUpdate("insert into staff(Staff_ID,F_name,L_Name,Gender,Birth_Date,Mobile_No,Position,Password)values('"+staffid+"','"+fname+"','"+lname+"','"+gender+"','"+bday+"','"+mobno+"','"+pswd+"')");
            out.println("Thank you for register ! Please <a href='index.html'>Login</a> to continue.");
        }
        catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
%>
<%
 
    if(action.equals("login")){
    
    
        String email=request.getParameter("L_email"); 
        session.putValue("email",email); 
        String password=request.getParameter("pswd"); 
        Class.forName("com.mysql.jdbc.Driver"); 
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root",""); 
        Statement st= con.createStatement(); 
        ResultSet rs=st.executeQuery("select * from users where userid='"+email+"' and password='"+password+"'"); 
        try{
                rs.next();
                        if(rs.getString("password").equals(password)&&rs.getString("userid").equals(email)) 
                                { 
                                      out.println("Welcome "  +email); 
                                } 
                        else{
                                 out.println("Invalid password or username.");
                            }
        }
        catch (Exception e) {
        e.printStackTrace();
        }
}
%>
