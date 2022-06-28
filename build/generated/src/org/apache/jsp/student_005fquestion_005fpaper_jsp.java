package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class student_005fquestion_005fpaper_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/student_question_paper.css\" type=\"text/css\">\n");
      out.write("        <title>Questions</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\" border d-inline exnamediv \">\n");
      out.write("            <button type=\"button\" class=\"btn btn-labeled btn-default\">\n");
      out.write("                <i class=\"fa fa-chevron-left\"></i></button>\n");
      out.write("            <span class=\"btn-label exname\">Exam Name</span><br><br></div> \n");
      out.write("            \n");
      out.write("           \n");
      out.write("                <div class=\"wrapper border container\">\n");
      out.write("                                    <div class=\"\">\n");
      out.write("                                        <h1 class=\"title\">Time Left</h1>\n");
      out.write("                                        <div class=\"countdown-container\">\n");
      out.write("                                            <div>\n");
      out.write("                                                <p id=\"days\" class=\"big-text\">0</p>\n");
      out.write("                                                <span>Days</span>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div>\n");
      out.write("                                                <p id=\"hours\" class=\"big-text\">0</p>\n");
      out.write("                                                <span>Hours</span>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div>\n");
      out.write("                                                <p id=\"min\" class=\"big-text\">0</p>\n");
      out.write("                                                <span>Min</span>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div>\n");
      out.write("                                                <p id=\"sec\" class=\"big-text\">0</p>\n");
      out.write("                                                <span>Sec</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"border container d-flex align-items-center justify-content-center parent\">\n");
      out.write("                <p class=\"q\">a) What is question A?</p>\n");
      out.write("            <div class=\"w-50 p-3 mb-4 border  div\">\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("</body>\n");
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
