package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignIn_002dF_005bA_005d_005bS1_005d_005bS2_005d_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t\tCreate New User Account\n");
      out.write("\t\t</title>\n");
      out.write("\t\t<style>\n");
      out.write("\t\t\tinput[type=submit] {\n");
      out.write("\t\t\t\theight: 100%;\n");
      out.write("\t\t\t\twidth: 20%;\n");
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
      out.write("\t\t\t.navbar{\n");
      out.write("\t\t\t\tpadding-left: 250px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.NU{\n");
      out.write("\t\t\t\tmax-width: 1175px;\n");
      out.write("\t\t\t\twidth: 100%;\n");
      out.write("\t\t\t\tbackground: linear-gradient(135deg, #bbe2f8, #bbf6bb);\n");
      out.write("\t\t\t\tpadding: 25px 30px;\n");
      out.write("\t\t\t\tborder-radius: 5px;\t\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.title{\n");
      out.write("\t\t\t\ttext-align: center;\n");
      out.write("\t\t\t\tfont-size: 25px;\n");
      out.write("\t\t\t\tfont-weight: 500px;\n");
      out.write("\t\t\t\tposition: relative;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.title::before{\n");
      out.write("\t\t\t\tcontent: '';\n");
      out.write("\t\t\t\tposition: absolute;\n");
      out.write("\t\t\t\tbottom: 0;\n");
      out.write("\t\t\t\theight: 3px;\n");
      out.write("\t\t\t\twidth: 300px;\n");
      out.write("\t\t\t\tbackground: linear-gradient(135deg, #CCE5FF, #99FF99);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.title1{\n");
      out.write("\t\t\t\ttext-align: center;\n");
      out.write("\t\t\t\tfont-size: 25px;\n");
      out.write("\t\t\t\tfont-weight: 500px;\n");
      out.write("\t\t\t\tposition: relative;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.title1::before{\n");
      out.write("\t\t\t\tcontent: '';\n");
      out.write("\t\t\t\tposition: absolute;\n");
      out.write("\t\t\t\tbottom: 0;\n");
      out.write("\t\t\t\theight: 3px;\n");
      out.write("\t\t\t\twidth: 525px;\n");
      out.write("\t\t\t\tbackground: linear-gradient(135deg, #CCE5FF, #99FF99);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.ELD{\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tjustify-content: space-between;\n");
      out.write("\t\t\t\tmargin: 20px 0 12px 0;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.ECPD{\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tjustify-content: space-between;\n");
      out.write("\t\t\t\tmargin: 20px 0 12px 0;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.input-box{\n");
      out.write("\t\t\t\tpadding-left:275px;\n");
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
      out.write("\t\t\t.ELD .input-box input:focus,\n");
      out.write("\t\t\t.ELD .input-box input:valid{\n");
      out.write("\t\t\t\tborder-color:#9b59b6;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.ECPD .input-box input:focus,\n");
      out.write("\t\t\t.ECPD .input-box input:valid{\n");
      out.write("\t\t\t\tborder-color:#9b59b6;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.button{\n");
      out.write("\t\t\t\ttext-align: center;\n");
      out.write("\t\t\t\theight: 45px;\n");
      out.write("\t\t\t\tmargin: 45px 0;\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t}\n");
      out.write("\t\t</style>\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/htmlAll/style.css\"/>\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<img class=\"logo\" src=\"/images/PhoenixLogo.jpg\"/> \n");
      out.write("\t\t<h1 id=\"title\">\n");
      out.write("\t\tPhoenix Airline\t\t</h1>\n");
      out.write("\t\t<div >\n");
      out.write("\t\t\t<ul class=\"navbar\">\n");
      out.write("\t\t\t\t<li><a href=\"home_page.php\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i> Home</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"login_page.php\"><i class=\"fa fa-ticket\" aria-hidden=\"true\"></i> Book Tickets</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"home_page.php\"><i class=\"fa fa-plane\" aria-hidden=\"true\"></i> About Us</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"home_page.php\"><i class=\"fa fa-phone\" aria-hidden=\"true\"></i> Contact Us</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"login_page.php\"><i class=\"fa fa-sign-in\" aria-hidden=\"true\"></i> Login</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<br>\n");
      out.write("\t<div class=\"NU\">\n");
      out.write("\t\t<form class=\"center_form\" action=\"Adminlogin-DB[A][S1][S2]\" method=\"POST\" id=\"new_user_from\">\n");
      out.write("\t\t\t<h2><i class=\"fa fa-user-plus\" aria-hidden=\"true\"></i> CREATE NEW STAFF ACCOUNT</h2>\n");
      out.write("\t\t\t<br>\n");
      out.write("\n");
      out.write("\t\t<div class=\"ELD\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"title\"><strong>ENTER NEW STAFF/ADMIN DETAILS</strong></div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class=\"input-box\">\n");
      out.write("\t\t\t\t\t<span class=\"details\">Staff ID</span>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"staffid\" required>\n");
      out.write("\t\t\t </div>\n");
      out.write("\n");
      out.write("\t\t\t <div class=\"input-box\">\n");
      out.write("\t\t\t\t\t<span class=\"details\">Password</span>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"pswd\" required>\n");
      out.write("\t\t\t </div>\n");
      out.write("\n");
      out.write("\t\t\t <div class=\"input-box\">\n");
      out.write("\t\t\t\t\t<span class=\"details\">Repeat Password</span>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"pswd\" required>\n");
      out.write("\t\t\t </div>\n");
      out.write("\t\t\t<br>\n");
      out.write("                        \n");
      out.write("                        <div class=\"input-box\">\n");
      out.write("                            <span class=\"details\">First Name</span>\n");
      out.write("                            <input type=\"text\" name=\"fname\" required>\n");
      out.write("\t\t\t</div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"input-box\">\n");
      out.write("                            <span class=\"details\">Last Name</span>\n");
      out.write("                            <input type=\"text\" name=\"lname\" required>\n");
      out.write("\t\t\t</div>\n");
      out.write("                        <br>\n");
      out.write("                        \n");
      out.write("\t\t\t<div class=\"input-box\">\n");
      out.write("                            <span class=\"details\">Gender</span>\n");
      out.write("                            <select name=gender[]>\n");
      out.write("                                <option value=male>Male</option>\n");
      out.write("                                <option value=female>Female</option>\n");
      out.write("                                <option value=other>Other</option>\n");
      out.write("                            </select> \n");
      out.write("                        \n");
      out.write("                        <br>\n");
      out.write("                        \n");
      out.write("\t\t\t</div>\n");
      out.write("                        \n");
      out.write("\t\t\t<div class=\"input-box\">\n");
      out.write("                            <span class=\"details\">Birth Date</span>\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"bday\" required>\n");
      out.write("\t\t\t</div>\n");
      out.write("                        \n");
      out.write("\t\t\t<div class=\"input-box\">\n");
      out.write("                            <span class=\"details\">Mobile_No</span>\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"mobile\" >\n");
      out.write("\t\t\t</div>\n");
      out.write("                        \n");
      out.write("                        <br>\n");
      out.write("                        \n");
      out.write("                        <div class=\"input-box\">\n");
      out.write("                            <span class=\"details\">Position</span>\n");
      out.write("                            <select name=position>\n");
      out.write("                                <option value=g1staff>Staff [Grade 1]</option>\n");
      out.write("                                <option value=g2staff>Staff [Grade2]</option>\n");
      out.write("                                <option value=admin>Admin</option>\n");
      out.write("                            </select> \n");
      out.write("                            \n");
      out.write("\t\t\t</div>\n");
      out.write("                        \n");
      out.write("                        <br>\n");
      out.write("\n");
      out.write("                        <div class=\"button\">\n");
      out.write("                            <button type=\"submit\" name=\"action\" value=\"signup\">Sign Up</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
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
