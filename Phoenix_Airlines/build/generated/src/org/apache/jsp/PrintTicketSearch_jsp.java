package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PrintTicketSearch_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/login.css\"></link>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/bootstrap.min.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"bootstrap/bootstrap-theme.min.css\">\n");
      out.write("       <script src=\"bootstrap/jquery.min.js\"></script>\n");
      out.write("        <script src=\"bootstrap/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("       \n");
      out.write("        <title>Print</title>\n");
      out.write("        <style>\n");
      out.write("            .input-box{\n");
      out.write("\t\t\t\tmargin-bottom: 15px;\n");
      out.write("\t\t\t\twidth: calc(100% / 1);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
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
      out.write("            .PrintF{\n");
      out.write("\t\t\t\tmax-width: 1170px;\n");
      out.write("\t\t\t\twidth: 100%;\n");
      out.write("\t\t\t\tbackground: linear-gradient(135deg, #bbe2f8, #bbf6bb);\n");
      out.write("\t\t\t\tpadding: 100px 30px;\n");
      out.write("\t\t\t\talign-items: center;\n");
      out.write("\t\t\t}\n");
      out.write("            \n");
      out.write("            input {\n");
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
      out.write("\n");
      out.write("            button{\n");
      out.write("                border-color: 2px;\n");
      out.write("\t\t\t\ttransition: all 0.3s ease;\n");
      out.write("                padding-left: 15px;\n");
      out.write("                height: 35px;\n");
      out.write("\t\t\t\twidth: 100%;\n");
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
      out.write("\t\t\tbutton:hover{\n");
      out.write("\t\t\t\tbackground: linear-gradient(-135deg, #CCE5FF, #99FF99);\n");
      out.write("\t\t\t}\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <form id=\"index\" action=\"pnr.php\" method=\"post\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("             \n");
      out.write("        \n");
      out.write("            \n");
      out.write("            \n");
      out.write("                \n");
      out.write("                    <center>\n");
      out.write("                        \n");
      out.write("                         \n");
      out.write("                               <center><img src=\"/images/PhoenixLogo.jpg\" width=\"180px\" height=\"150px\" ></center>\n");
      out.write("                                <br>\n");
      out.write("                            <div class=\"PrintF\">\n");
      out.write("                                <div class=\"input-box\">\n");
      out.write("\t      \t\t                   \n");
      out.write("                                    <input type=\"text\" id=\"u_id\" name=\"ticketno\" class=\"form-control\" style=\"width:300px; margin-left: 66px;\" placeholder=\"Enter Your PNR No\"><br>\n");
      out.write("\t\t\t                    </div>\n");
      out.write("\n");
      out.write("                                <div class=\"button\">\n");
      out.write("                                    <input type=\"submit\" id=\"u_sub\" name=\"u_sub\" value=\"Search\" class=\"toggle btn btn-primary\" style=\"width:100px; margin-left: 70px;\">\n");
      out.write("                                    <button type=\"button\" onclick=\"location.href = './customer_homepage.php';\" class=\"toggle btn btn-primary\" style=\"width:100px; margin-left: 20px;\">Back</button>\n");
      out.write("\t                            </div>                                    \n");
      out.write("                                   \n");
      out.write("                                   \n");
      out.write("                            </div>\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("              \n");
      out.write("             \n");
      out.write("        </form>  \n");
      out.write("        \n");
      out.write("       </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
