package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PrintTicket_002dDB_005bP_005d_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title></title>\n");
      out.write("        \n");
      out.write("         <link rel=\"stylesheet\" href=\"bootstrap/bootstrap.min.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"bootstrap/bootstrap-theme.min.css\">\n");
      out.write("       <script src=\"bootstrap/jquery.min.js\"></script>\n");
      out.write("        <script src=\"bootstrap/bootstrap.min.js\"></script>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/admform.css\"></link>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function printpage()\n");
      out.write("            {\n");
      out.write("            var printButton = document.getElementById(\"print\");\n");
      out.write("            printButton.style.visibility = 'hidden';\n");
      out.write("            window.print()\n");
      out.write("             printButton.style.visibility = 'visible';\n");
      out.write("             }\n");
      out.write("        </script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("\n");
      out.write("          \n");
      out.write("          input {\n");
      out.write("    \t\t\t    border: 1.5px solid #030337;\n");
      out.write("    \t\t\t    border-radius: 4px;\n");
      out.write("    \t\t\t    padding: 7px 30px;\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          input[type=submit]{\n");
      out.write("              outline: none;\n");
      out.write("              color: black;\n");
      out.write("              border: none;\n");
      out.write("              font-size: 18px;\n");
      out.write("              font-weight: 500;\n");
      out.write("              border-radius: 5px;\n");
      out.write("              box-shadow: 0 2px 5px gray;\n");
      out.write("              letter-spacing: 1px;\n");
      out.write("              background: linear-gradient(135deg, #CCE5FF, #99FF99);\n");
      out.write("          }\n");
      out.write("          .button input[type=submit]:hover{\n");
      out.write("            background: linear-gradient(-135deg, #CCE5FF, #99FF99);\n");
      out.write("          }\n");
      out.write("          .button{\n");
      out.write("            text-align: center;\n");
      out.write("            \n");
      out.write("          }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write(" \n");
      out.write("\n");
      out.write("<hr style=\"border: 1px solid black;border-style: dashed;\">\n");
      out.write("<center><h3>Phoenix Airline</h3></center>\n");
      out.write("<center><h2>Boarding Pass - Flight Reservation Slip</h2></center><h4> booking_status</h4>\n");
      out.write("<br>\n");
      out.write("<td style=\"width:4%;\"> <font style=\"font-family: Verdana;\">Ticket No : </font> </td>\n");
      out.write("                    <td style=\"width:8%;\" colspan=\"3\"> Ticket_No </td>\n");
      out.write("<td style=\"width:4%;\"> <font style=\"font-family: Verdana;\">Flight No : </font> </td>\n");
      out.write("                    <td style=\"width:8%;\" colspan=\"3\"> Flight_ID </td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("<td style=\"width:4%;\"> <font style=\"font-family: Verdana;\">Date of journey : </font> </td>\n");
      out.write("                    <td style=\"width:8%;\" colspan=\"3\">  Departure_Time </td><br>\n");
      out.write("<td style=\"width:4%;\"> <font style=\"font-family: Verdana;\">Class : </font> </td>\n");
      out.write("                    <td style=\"width:8%;\" colspan=\"3\"> Class </td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("<td style=\"width:4%;\"> <font style=\"font-family: Verdana;\">Payment ID : </font> </td>\n");
      out.write("                    <td style=\"width:8%;\" colspan=\"3\"> Payment_ID </td><br>\n");
      out.write("<td style=\"width:4%;\"> <font style=\"font-family: Verdana;\">Booked By (Username): </font> </td>\n");
      out.write("                    <td style=\"width:8%;\" colspan=\"3\"> First_Name+Last_Name </td><br>\n");
      out.write("<td style=\"width:4%;\"> <font style=\"font-family: Verdana;\">Status: </font> </td>\n");
      out.write("                    <td style=\"width:58%;\" colspan=\"3\">  </td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("<td style=\"width:4%;\"> <font style=\"font-family: Verdana;\">No. of Passengers: </font> </td>\n");
      out.write("                    <td style=\"width:58%;\" colspan=\"3\"> count where Ticket_No= </td>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("<hr>\n");
      out.write("         \n");
      out.write("          <div class=\"container-fluid\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                  <div class=\"col-sm-12\">\n");
      out.write("                    <center>  <table class=\"table table-bordered\" style=\"font-family: Verdana\">\n");
      out.write("                    <center><font style=\"font-family:Verdana; font-size:18px;\"></font></center>\n");
      out.write("                \n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                    <font style=\"font-family:Arial Black; font-size:20px;\"></font>\n");
      out.write("                    <tr>\n");
      out.write("                      <td colspan=\"2\" width=\"3%\" >\n");
      out.write("                        \n");
      out.write("                  \n");
      out.write("                         \n");
      out.write("                      </td>   \n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td style=\"width:4%;\"> <font style=\"font-family: Verdana;\">PNR : </font> </td>\n");
      out.write("                        <td style=\"width:8%;\" colspan=\"3\">  </td>\n");
      out.write("                    </tr>\n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                    <tr>\n");
      out.write("                        <td> <font style=\"font-family: Verdana;\">Passenger No : </font> </td>\n");
      out.write("                        <td colspan=\"3\">  \n");
      out.write("                    </tr>\n");
      out.write("                  \n");
      out.write("                    <tr>\n");
      out.write("                      <td> <font style=\"font-family: Verdana;\"> Name :</font>  </td>\n");
      out.write("                      <td colspan=\"3\">  <br>\n");
      out.write("                       </td>\n");
      out.write("                    </tr>\n");
      out.write("                \n");
      out.write("                    <tr>\n");
      out.write("                      <td><font style=\"font-family: Verdana;\"> Gender :</font></td>\n");
      out.write("                      <td  colspan=\"3\">  </td>\n");
      out.write("                    </tr>\n");
      out.write("                 \n");
      out.write("                    <tr>\n");
      out.write("                      <td> <font style=\"font-family: Verdana;\">Meail Choice :</font></td>\n");
      out.write("                      <td>  </td>\n");
      out.write("                      <td><font style=\"font-family: Verdana;\"> Frequent Flier No. (If any)</font></td>\n");
      out.write("                      <td>   </td>\n");
      out.write("                    </tr>\n");
      out.write(" \n");
      out.write("                       </table></center>\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("              }\n");
      out.write("        \n");
      out.write("\n");
      out.write(" <p> \n");
      out.write("    <div class=\"button\">\n");
      out.write("        <input type=\"submit\" id=\"print\" class=\"toggle btn btn-primary\" value=\"Print\" onclick=\"printpage();\">\n");
      out.write("\t  </div>\n");
      out.write("    <br>\n");
      out.write("<CENTER><a class=\"print_hide\" href=\"pnr.php\">Check other PNR</a></center>\n");
      out.write("    \n");
      out.write("</p>\n");
      out.write("  \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("                     ");
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
