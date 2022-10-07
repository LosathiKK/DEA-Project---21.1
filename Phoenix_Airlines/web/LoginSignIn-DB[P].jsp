<%-- 
    Document   : Insert
    Created on : Oct 1, 2022, 10:07:43 PM
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
        
        String uname = request.getParameter("uname");
        String email = request.getParameter("email");
        String pswd = request.getParameter("pswd");
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String gender = request.getParameter("gender");
        String bday = request.getParameter("bday");
        String country = request.getParameter("country");
        String city = request.getParameter("city");
        String mobno = request.getParameter("mobno");
        
        
        try{
            Class.forName("com.mysql.jdbc.driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/phoenix_airline","root","");
            Statement st=con.createStatement();
            
            int i=st.executeUpdate("insert into user_account(User_ID,E-Mail,Password,)values('"+uname+"','"+email+"','"+pswd+"')");
            int j=st.executeUpdate("insert into user(User_ID,F_name,L_name,Gender,Birth_Date,Country,Mobile_No)values('"+uname+"','"+fname+"','"+lname+"','"+gender+"','"+bday+"','"+country+"','"+city+"','"+mobno+"')");
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