package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddPassengersToTicket_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\t\t<html>\n");
      out.write("            <head>\n");
      out.write("                <title>\n");
      out.write("                    Enter Travel/Ticket Details\n");
      out.write("                </title>\n");
      out.write("                <style>\n");
      out.write("                    input {\n");
      out.write("                        border: 1.5px solid #030337;\n");
      out.write("                        border-radius: 4px;\n");
      out.write("                        padding: 7px 10px;\n");
      out.write("                    }\n");
      out.write("                    input[type=number] {\n");
      out.write("                        border: 1.5px solid #030337;\n");
      out.write("                        border-radius: 4px;\n");
      out.write("                        padding: 7px 0px;\n");
      out.write("                        gap:100px;\n");
      out.write("                    }\n");
      out.write("                    input[type=submit] {\n");
      out.write("                        outline: none;\n");
      out.write("                        color: black;\n");
      out.write("                        border: none;\n");
      out.write("                        font-size: 18px;\n");
      out.write("                        font-weight: 500;\n");
      out.write("                        border-radius: 5px;\n");
      out.write("                        box-shadow: 0 2px 5px gray;\n");
      out.write("                        letter-spacing: 1px;\n");
      out.write("                        background: linear-gradient(135deg, #CCE5FF, #99FF99);\n");
      out.write("                        padding: 7px 45px;\n");
      out.write("                        margin: 0px 400px\n");
      out.write("                    }\n");
      out.write("                    input[type=submit]:hover{\n");
      out.write("                        background: linear-gradient(-135deg, #CCE5FF, #99FF99);\n");
      out.write("                    }\n");
      out.write("        \n");
      out.write("                    input[type=radio] {\n");
      out.write("                        margin-right: 30px;\n");
      out.write("                    }\n");
      out.write("                    select {\n");
      out.write("                        border: 1.5px solid #030337;\n");
      out.write("                        border-radius: 4px;\n");
      out.write("                        padding: 6.5px 15px;\n");
      out.write("                    }\n");
      out.write("                    .APD{\n");
      out.write("                        max-width: 1175px;\n");
      out.write("                        width: 100%;\n");
      out.write("                        background: linear-gradient(135deg, #bbe2f8, #bbf6bb);\n");
      out.write("                        padding: 25px 30px;\n");
      out.write("                        border-radius: 5px;\t\n");
      out.write("                    }\n");
      out.write("                    .input-box{\n");
      out.write("                        margin-bottom: 15px;\n");
      out.write("                        width: calc(100% / 2 - 20px);\n");
      out.write("                    }\n");
      out.write("                    .input-box input{\n");
      out.write("                        height: 45px;\n");
      out.write("                        width: 100%;\n");
      out.write("                        outline: none;\n");
      out.write("                        border: 1px solid #ccc;\n");
      out.write("                        padding-left: 15px;\n");
      out.write("                        font-size: 16px;\n");
      out.write("                        border-color: 2px;\n");
      out.write("                        transition: all 0.3s ease;\n");
      out.write("                    }\n");
      out.write("                    select{\n");
      out.write("                        height: 45px;\n");
      out.write("                        width: 100%;\n");
      out.write("                        outline: none;\n");
      out.write("                        border: 1px solid #ccc;\n");
      out.write("                        padding-left: 15px;\n");
      out.write("                        font-size: 16px;\n");
      out.write("                        border-color: 2px;\n");
      out.write("                        transition: all 0.3s ease;\n");
      out.write("                    }\n");
      out.write("                    .APD2{\n");
      out.write("                        justify-content: space-between;\n");
      out.write("                        margin: 20px 0 12px 0;\n");
      out.write("                    }\n");
      out.write("                </style>\n");
      out.write("                <link rel=\"stylesheet\" type=\"text/css\" href=\"/htmlAll/style.css\"/>\n");
      out.write("                <link rel=\"stylesheet\" href=\"/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("            </head>\n");
      out.write("            <body>\n");
      out.write("                <img class=\"logo\" src=\"/images/PhoenixLogo.jpg\"/> \n");
      out.write("                <h1 id=\"title\">\n");
      out.write("                Phoenix Airline\n");
      out.write("                </h1>\n");
      out.write("                <div>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"home_page.php\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i> Home</a></li>\n");
      out.write("                        <li><a href=\"customer_homepage.php\"><i class=\"fa fa-desktop\" aria-hidden=\"true\"></i> Dashboard</a></li>\n");
      out.write("                        <li><a href=\"home_page.php\"><i class=\"fa fa-plane\" aria-hidden=\"true\"></i> About Us</a></li>\n");
      out.write("                        <li><a href=\"home_page.php\"><i class=\"fa fa-phone\" aria-hidden=\"true\"></i> Contact Us</a></li>\n");
      out.write("                        <li><a href=\"logout_handler.php\"><i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i> Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("        \n");
      out.write("                <div class=\"APD\">\n");
      out.write("\t\t\t\t\t <p><strong>PASSENGER .$count.<strong></p>\n");
      out.write("\t\t\t\t\t <table cellpadding=0>\n");
      out.write("\t\t\t\t\t <tr class=APD2>\n");
      out.write("                     <td class=\"input-box\">Passenger Passport ID </td>\n");
      out.write("\t\t\t\t\t <td class=\"input-box\">Passenger First Name</td>\n");
      out.write("\t\t\t\t\t <td class=\"input-box\">Passenger Last Name</td>\n");
      out.write("\t\t\t\t\t <td class=\"input-box\">Passenger Age</td>\n");
      out.write("\t\t\t\t\t <td class=\"input-box\">Passenger Gender</td>\n");
      out.write("\t\t\t\t\t <td class=\"input-box\">Passenger Inflight Meal</td>\n");
      out.write("\t\t\t\t\t \n");
      out.write("\t\t\t\t\t </tr>\n");
      out.write("\t\t\t\t\t <tr class=APD2>\n");
      out.write("\t\t\t\t\t <td class=\"input-box\"><input type=text name=pass_passid[] required></td>\n");
      out.write("\t\t\t\t\t <td class=\"input-box\"><input type=text name=pass_fname[] required></td>\n");
      out.write("\t\t\t\t\t <td class=\"input-box\"><input type=text name=pass_lname[] required></td>\n");
      out.write("\t\t\t\t\t <td class=\"input-box\"><input type=number name=pass_age[] required></td>\n");
      out.write("\t\t\t\t\t <td class=\"input-box\">\n");
      out.write("\t\t\t\t\t <select name=pass_gender[]>\n");
      out.write("  \t\t\t\t\t <option value=male>Male</option>\n");
      out.write("  \t\t\t\t\t <option value=female>Female</option>\n");
      out.write("  \t\t\t\t\t <option value=other>Other</option>\n");
      out.write("  \t\t\t\t\t </select>\n");
      out.write("  \t\t\t\t\t </td>\n");
      out.write("  \t\t\t\t\t <td class=\"input-box\">\n");
      out.write("\t\t\t\t\t <select name=pass_meal[]>\n");
      out.write("  \t\t\t\t\t <option value=yes>Yes</option>\n");
      out.write("  \t\t\t\t\t <option value=no>No</option>\n");
      out.write("  \t\t\t\t\t </select>\n");
      out.write("  \t\t\t\t\t </td>\n");
      out.write("\t\t\t\t\t </tr>\n");
      out.write("\t\t\t\t\t </table>\n");
      out.write("\t\t\t\t\t <br><hr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t \n");
      out.write("\t\t\t\t <br><br>\n");
      out.write("\t\t\t\t <input type=\"submit\" value=Submit  Details name=Submit>\n");
      out.write("\t\t\t\t </form>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
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
