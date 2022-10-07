package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddFlight_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<head>\n");
      out.write("\t\t<title>\n");
      out.write("\t\t\tAdd Flight Schedule Details\n");
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
      out.write("\t\t\t}\n");
      out.write("\t\t\t.button input[type=submit]:hover{\n");
      out.write("\t\t\t\tbackground: linear-gradient(-135deg, #CCE5FF, #99FF99);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.button{\n");
      out.write("\t\t\t\ttext-align: center;\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.ADnavbar{\n");
      out.write("\t\t\t\tpadding-left: 375px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.ADM{\n");
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
      out.write("\t\t\t.title::before{\n");
      out.write("\t\t\t\tcontent: '';\n");
      out.write("\t\t\t\tposition: absolute;\n");
      out.write("\t\t\t\tbottom: 0;\n");
      out.write("\t\t\t\theight: 3px;\n");
      out.write("\t\t\t\twidth: 500px;\n");
      out.write("\t\t\t\tbackground: linear-gradient(135deg, #CCE5FF, #99FF99);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.AD{\n");
      out.write("\t\t\t\tdisplay: flex;\n");
      out.write("\t\t\t\tflex-wrap: wrap;\n");
      out.write("\t\t\t\tjustify-content: space-between;\n");
      out.write("\t\t\t\tmargin: 20px 0 12px 0;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.input-box{\n");
      out.write("\t\t\t\tmargin-bottom: 15px;\n");
      out.write("\t\t\t\twidth: calc(100% / 2 - 20px);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.details{\n");
      out.write("\t\t\t\tfont-weight: 500;\n");
      out.write("\t\t\t\tmargin-bottom: 5px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.input-box input{\n");
      out.write("\t\t\t\theight: 45px;\n");
      out.write("\t\t\t\twidth: 100%;\n");
      out.write("\t\t\t\toutline: none;\n");
      out.write("\t\t\t\tborder: 1px solid #ccc;\n");
      out.write("\t\t\t\tpadding-left: 15px;\n");
      out.write("\t\t\t\tfont-size: 16px;\n");
      out.write("\t\t\t\tborder-color: 2px;\n");
      out.write("\t\t\t\ttransition: all 0.3s ease;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.AD .input-box input:focus,\n");
      out.write("\t\t\t.AD .input-box input:valid{\n");
      out.write("\t\t\t\tborder-color:#9b59b6;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t</style>\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../htmlAll/style.css\"/>\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<img class=\"logo\" src=\"/images/PhoenixLogo.jpg\"/> \n");
      out.write("\t\t<h1 id=\"title\">\n");
      out.write("\t\tPhoenix Airline\n");
      out.write("\t\t</h1>\n");
      out.write("\t\t<div class=\"navbar\">\n");
      out.write("\t\t\t<ul class=\"ADnavbar\">\n");
      out.write("\t\t\t\t<li><a href=\"admin_homepage.php\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i> Home</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"admin_homepage.php\"><i class=\"fa fa-desktop\" aria-hidden=\"true\"></i> Dashboard</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"logout_handler.php\"><i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i> Logout</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"ADM\">\n");
      out.write("\t\t<form action=\"add_flight_details_form_handler.php\" method=\"post\">\n");
      out.write("\t\t\t<div class=\"title\">ENTER THE FLIGHT SCHEDULE DETAILS</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\n");
      out.write("\t  <div class=\"AD\">\n");
      out.write("\n");
      out.write("\t\t\t <div class=\"input-box\">\n");
      out.write("\t     \t\t <span class=\"details\"> Flight ID</span>\n");
      out.write("\t\t\t\t <input type=\"number\" name=\"flightid\" required>\n");
      out.write("\t    \t </div>\n");
      out.write("\n");
      out.write("\t\t\t <div class=\"input-box\">\n");
      out.write("\t     \t\t <span class=\"details\">Airplane ID</span>\n");
      out.write("\t\t\t\t  <input type=\"text\" name=\"plane\" required>\n");
      out.write("\t    \t </div>\n");
      out.write("\n");
      out.write("\t    \t <div class=\"input-box\">\n");
      out.write("\t      \t\t <span class=\"details\">Origin</span>\n");
      out.write("\t     \t\t <input type=\"text\" name=\"origin\" required>\n");
      out.write("\t\t\t </div>\n");
      out.write("\n");
      out.write("\t    \t <div class=\"input-box\">\n");
      out.write("\t      \t\t <span class=\"details\">Destination</span>\n");
      out.write("\t      \t\t <input type=\"text\" name=\"destination\" required>\n");
      out.write("\t    \t </div>\n");
      out.write("\n");
      out.write("\t    \t <div class=\"input-box\">\n");
      out.write("\t      \t\t <span class=\"details\">Departure Date</span>\n");
      out.write("\t      \t\t <input type=\"date\" name=\"dep_date\" required>\n");
      out.write("\t   \t\t </div>\n");
      out.write("\n");
      out.write("\t   \t\t<div class=\"input-box\">\n");
      out.write("\t      \t\t<span class=\"details\">Arrival Date</span>\n");
      out.write("\t     \t\t<input type=\"date\" name=\"arr_date\" required>\n");
      out.write("\t   \t\t</div>\n");
      out.write("\n");
      out.write("\t    \t<div class=\"input-box\">\n");
      out.write("\t     \t\t <span class=\"details\">Departure Time</span>\n");
      out.write("\t     \t\t <input type=\"time\" name=\"dep_time\" required>\n");
      out.write("\t    \t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"input-box\">\n");
      out.write("\t      \t\t<span class=\"details\">Arrival Time</span>\n");
      out.write("\t      \t\t<input type=\"time\" name=\"arr_time\" required>\n");
      out.write("\t   \t \t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"input-box\">\n");
      out.write("\t      \t\t<span class=\"details\">Number of Seats in Economy Class</span>\n");
      out.write("\t      \t\t<input type=\"number\" name=\"seats_eco\" required>\n");
      out.write("\t   \t\t </div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"input-box\">\n");
      out.write("\t     \t\t<span class=\"details\">Number of Seats in Business Class</span>\n");
      out.write("\t      \t\t<input type=\"number\" name=\"seats_bus\" required>\n");
      out.write("\t   \t\t </div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"input-box\">\n");
      out.write("\t      \t\t<span class=\"details\">Ticket Price(Economy Class)</span>\n");
      out.write("\t      \t\t<input type=\"number\" name=\"price_eco\" required>\n");
      out.write("\t    \t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"input-box\">\n");
      out.write("\t      \t\t<span class=\"details\">Ticket Price(Business Class)</span>\n");
      out.write("\t      \t\t<input type=\"number\" name=\"price_bus\" required>\n");
      out.write("\t    \t</div>\n");
      out.write("\n");
      out.write("\t  \t</div>\n");
      out.write("\t  <div class=\"button\">\n");
      out.write("\t    <input type=\"submit\" value=\"Submit\" name=\"Submit\">\n");
      out.write("\t  </div>\n");
      out.write("\t\n");
      out.write("  \n");
      out.write("\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
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
