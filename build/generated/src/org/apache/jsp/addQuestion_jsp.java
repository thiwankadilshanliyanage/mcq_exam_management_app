package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addQuestion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css\" integrity=\"sha384-r4NyP46KrjDleawBgD5tp8Y7UzmLA05oM1iAEQ17CSuDqnUK2+k9luXQOfXJCJ4I\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/addQ.css\">\n");
      out.write("\n");
      out.write("        <title>Add Questions</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("        <section class=\"w-50 p-3 sec\">\n");
      out.write("            <div class=\"d-inline \">\n");
      out.write("                <button type=\"button\" class=\"btn btn-labeled btn-default\">\n");
      out.write("                    <i class=\"fa fa-chevron-left\"></i></button>\n");
      out.write("                <span class=\"btn-label exname\">Exam Name</span><br><br></div>\n");
      out.write("            <span class=\"d-grid gap-2 d-md-flex justify-content-md-end\">\n");
      out.write("                <h5 class=\"question\">Question List</h5>\n");
      out.write("                <button type=\"button\" class=\"qbtn btn btn-primary btn-lg\">Add Questions</button>\n");
      out.write("            </span>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"table-responsive\" id=\"no-more-tables\">\n");
      out.write("                <table class=\"table bg-white\">\n");
      out.write("                    <thead class=\"bg-dark text-light\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Exam</th>\n");
      out.write("                            <th>Last Updated</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td data-title=\"Exam\">What is your name?</td>\n");
      out.write("                            <td data-title=\"Last Updated\">Answer 1, Answer 2, Answer 3, Answer 4</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"w-50 p-3 addquestiondiv\">\n");
      out.write("            <form>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleInputEmail1\" class=\"form-label\">Email address</label>\n");
      out.write("                    <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                    <div id=\"emailHelp\" class=\"form-text\">We'll never share your email with anyone else.</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"exampleInputPassword1\" class=\"form-label\">Password</label>\n");
      out.write("                    <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\">\n");
      out.write("                </div>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
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
