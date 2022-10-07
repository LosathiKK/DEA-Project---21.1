package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Dashboard_005bS2_005d_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t\tStaff 02 dashboard\n");
      out.write("\t\t</title>\n");
      out.write("\t\t<style>\n");
      out.write("\t\t\ta {\n");
      out.write("\t\t\t\tcolor: #030337;\n");
      out.write("\t\t\t\ttext-decoration: none;\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\ta:hover{\n");
      out.write("\t\t\t\tbackground: linear-gradient(135deg, #cce5ff00, #99ff997d);\n");
      out.write("\t\t\t\tcolor: #030337;\n");
      out.write("\t\t\t\ttext-decoration: none;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\ttable,th,td .adminT{\n");
      out.write("\t\t\t\twidth: 100%;\n");
      out.write("\t\t\t\theight: 300px;\n");
      out.write("\t\t\t\tbackground: linear-gradient(-135deg, #CCE5FF, #99FF99);\n");
      out.write("\t\t\t\tmargin:auto;\n");
      out.write("\t\t\t\ttext-align: center;\n");
      out.write("\t\t\t\tborder-collapse: collapse;\n");
      out.write("\t\t\t\ttable-layout: fixed;\n");
      out.write("\t\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\ttable,th,td:hover{\n");
      out.write("\t\t\t\tbackground: linear-gradient(-135deg, #CCE5FF, #99FF99);\n");
      out.write("\t\t\t\tcolor:black;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t</style>\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../htmlAll/style.css\"/>\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<img class=\"logo\" src=\"/images/PhoenixLogo.jpg\"/> \n");
      out.write("\t\t<h1 id=\"title\">\n");
      out.write("\t\tPhoenix Airline\t</h1>\n");
      out.write("\t\t<div class=\"navbar\">\n");
      out.write("\t\t\t<ul class=\"Anavbar\">\n");
      out.write("\t\t\t\t<li><a href=\"admin_homepage.php\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i> Home</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"admin_homepage.php\"><i class=\"fa fa-desktop\" aria-hidden=\"true\"></i> Dashboard</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"logout_handler.php\"><i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i> Logout</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<center><h2>Flight Add Section</h2></center>\n");
      out.write("\t\t<table class=\"adminT\" border=\"2px solid #000\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td class=\"admin_func\"><a href=\"admin_view_booked_tickets.php\"><i class=\"fa fa-plane\" aria-hidden=\"true\"></i> View List of Booked Tickets for a Flight</a>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t<td class=\"admin_func\"><a href=\"add_flight_details.php\"><i class=\"fa fa-plane\" aria-hidden=\"true\"></i> Add Flight Schedule Details</a>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td class=\"admin_func\"><a href=\"add_jet_details.php\"><i class=\"fa fa-plane\" aria-hidden=\"true\"></i> Add Aircrafts Details</a>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t<td class=\"admin_func\"><a href=\"activate_jet_details.php\"><i class=\"fa fa-plane\" aria-hidden=\"true\"></i> Activate Aircraft</a>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t</table>\n");
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
