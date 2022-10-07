package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddPlane_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t\tAdd Aircrafts Details\n");
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
      out.write("\t\t\t.button input:hover{\n");
      out.write("\t\t\tbackground: linear-gradient(-135deg, #CCE5FF, #99FF99);\n");
      out.write("\t\t\tcolor:black;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.ADM{\n");
      out.write("\t\t\t\twidth:100%;\n");
      out.write("\t\t\t\ttext-align:center;\n");
      out.write("\t\t\t\tbackground: linear-gradient(-135deg, #CCE5FF, #99FF99);\n");
      out.write("\t\t\t\tpadding: 20px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.eidtA {\n");
      out.write("\t\t\t\twidth: 175px;\n");
      out.write("\t\t\t\tdisplay: inline-block;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.ADnavbar{\n");
      out.write("\t\t\t\tpadding-left: 375px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\n");
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
      out.write("\t\t<form action=\"add_jet_details_form_handler.php\" method=\"post\">\n");
      out.write("\t\t\t<h2>ENTER THE AIRCRAFTS DETAILS</h2>\n");
      out.write("\t\t\t\n");
      out.write("\t\t<div class=\"ADM\">\n");
      out.write("\n");
      out.write("\t\t<div class=\"AD\">\n");
      out.write("\t\t\t<label for=\"planename\" class=\"eidtA\">Enter Name of the Plane</label>\n");
      out.write("\t\t\t<input type=\"text\" name=\"planename\">\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"AD\">\n");
      out.write("\t\t\t<label for=\"model\" class=\"eidtA\">Enter model of plane</label>\n");
      out.write("\t\t\t<input type=\"text\" name=\"model\" required>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"AD\">\n");
      out.write("\t\t\t<label for=\"airlines\" class=\"eidtA\">Enter the Airlines the plane belongs to</label>\n");
      out.write("\t\t\t<input type=\"text\" name=\"airlines\" required>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"AD\">\n");
      out.write("\t\t\t<label for=\"airlines\" class=\"eidtA\">Total number of seats</label>\n");
      out.write("\t\t\t<input type=\"number\" name=\"airlines\" required>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\t<br>\n");
      out.write("\n");
      out.write("\t\t<div class=\"button\">\n");
      out.write("\t\t\t<input type=\"submit\" value=\"Submit\" name=\"Submit\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</form>\n");
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
