package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class ViewFlights_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>\n");
      out.write("\t\t\tView Available Flights\n");
      out.write("\t\t</title>\n");
      out.write("\t\t<style>\n");
      out.write("\t\t\tinput {\n");
      out.write("    \t\t\tborder: 1.5px solid #030337;\n");
      out.write("    \t\t\tborder-radius: 4px;\n");
      out.write("    \t\t\tpadding: 7px 30px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tinput[type=submit] {\n");
      out.write("\t\t\t\toutline: none;\n");
      out.write("\t\t\t\tcolor: black;\n");
      out.write("\t\t\t\tborder: none;\n");
      out.write("\t\t\t\tfont-size: 18px;\n");
      out.write("\t\t\t\tfont-weight: 500;\n");
      out.write("\t\t\t\tborder-radius: 5px;\n");
      out.write("\t\t\t\tbox-shadow: 0 2px 5px gray;\n");
      out.write("\t\t\t\tletter-spacing: 1px;\n");
      out.write("\t\t\t\tbackground: linear-gradient(135deg, #CCE5FF, #99FF99);\n");
      out.write("    \t\t\tpadding: 7px 45px;\n");
      out.write("    \t\t\tmargin: 0px 475px\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tinput[type=submit]:hover{\n");
      out.write("\t\t\t\tbackground: linear-gradient(-135deg, #CCE5FF, #99FF99);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\ttable {\n");
      out.write("\t\t\t border-collapse: collapse; \n");
      out.write("\t\t\t}\n");
      out.write("\t\t\ttr/*:nth-child(3)*/ {\n");
      out.write("\t\t\t border: solid thin;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.AF{\n");
      out.write("\t\t\t\tmax-width: 1175px;\n");
      out.write("\t\t\t\twidth: 100%;\n");
      out.write("\t\t\t\tbackground: linear-gradient(135deg, #bbe2f8, #bbf6bb);\n");
      out.write("\t\t\t\tpadding: 25px 30px;\n");
      out.write("\t\t\t\tborder-radius: 5px;\t\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.title{\n");
      out.write("\t\t\t\ttext-align: center;\n");
      out.write("\t\t\t\tfont-size: 25px;\n");
      out.write("\t\t\t\tfont-weight: 500;\n");
      out.write("\t\t\t\tposition: relative;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t</style>\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/htmlAll/style.css\"/>\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/font-awesome-4.7.0/css/font-awesome.min.csss\">\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<img class=\"logo\" src=\"/images/PhoenixLogo.jpg\"/> \n");
      out.write("\t\t<h1 id=\"title\">\n");
      out.write("\t\tPhoenix Airline\n");
      out.write("\t\t</h1>\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"home_page.php\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i> Home</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"customer_homepage.php\"><i class=\"fa fa-desktop\" aria-hidden=\"true\"></i> Dashboard</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"home_page.php\"><i class=\"fa fa-plane\" aria-hidden=\"true\"></i> About Us</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"home_page.php\"><i class=\"fa fa-phone\" aria-hidden=\"true\"></i> Contact Us</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"logout_handler.php\"><i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i> Logout</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"AF\">\n");
      out.write("\t\t<div class=\"title\">AVAILABLE FLIGHTS</div>\n");
      out.write("                \n");
      out.write("\n");
      out.write("        ");

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
            
      out.write("\n");
      out.write("\n");
      out.write("            <h1>Search Data</h1>\n");
      out.write("            <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("            <td>Flight ID</td>\n");
      out.write("            <td>Airplane Id</td>\n");
      out.write("            <td>Description</td>\n");
      out.write("            <td>Availability(1 means available) </td>\n");
      out.write("            <td>Departure Date</td>\n");
      out.write("            <td>Departure Time</td>\n");
      out.write("            <td>Arrival Date</td>\n");
      out.write("            <td>Arrival Time</td>\n");
      out.write("            <td>Airport</td>\n");
      out.write("            <td>Destination</td>\n");
      out.write("            <td>Economy Class Seats</td>\n");
      out.write("            <td>Business class Seats</td>\n");
      out.write("            <td>Economy Class Price</td>\n");
      out.write("            <td>Business Class Price</td>\n");
      out.write("            \n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");

            try{
            connection = DriverManager.getConnection(connectionUrl+database, userid, password);
            statement=connection.createStatement();
            String sql ="select * from flight where Airport='"+from+"'and Next_Airport='"+to+"' and Departure_Date='"+depdate+"' and Economy_Available > '"+ecocount+"' and Business_available >'"+buscount+"'  ";
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("            <td>");
      out.print(resultSet.getString("Flight_ID") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(resultSet.getString("Airplane_ID") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(resultSet.getString("Description") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(resultSet.getString("Availability") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(resultSet.getString("Departure_Date") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(resultSet.getString("Departure_Time") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(resultSet.getString("Arrival_Date") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(resultSet.getString("Arrival_Time") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(resultSet.getString("Airport") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(resultSet.getString("Next_Airport") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(resultSet.getString("Economy_Available") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(resultSet.getString("Business_Available") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(resultSet.getString("Economy_Price") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(resultSet.getString("Bussiness_Prices") );
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");

            }
            connection.close();
            } catch (Exception e) {
            e.printStackTrace();
            }
            
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
