package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class students_0020exams_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/exam.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <section class=\"p-5\">\n");
      out.write("            <div class=\"d-grid gap-2 d-md-flex justify-content-md-end\">\n");
      out.write("                <form class=\"d-grid gap-2 d-md-flex justify-content-md-end col-3 search\" role=\"search\">\n");
      out.write("                <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n");
      out.write("            </form>\n");
      out.write("            </div><br><br>\n");
      out.write("            <div class=\"table-responsive\" id=\"no-more-tables\">\n");
      out.write("                <table class=\"table bg-white\">\n");
      out.write("                    <thead class=\"bg-dark text-light\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Exam</th>\n");
      out.write("                            <th>Starting Time</th>\n");
      out.write("                            <th>Exam Duration</th>\n");
      out.write("                            <th>Status</th>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td data-title=\"Exam\">1st semester</td>\n");
      out.write("                            <td data-title=\"Starting Time\">30th June in 2022 8.00 AM</td>\n");
      out.write("                            <td data-title=\"Exam Duratio\">Published</td>\n");
      out.write("                            <td data-title=\"Status\">Published</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td data-title=\"Exam\">1st semester</td>\n");
      out.write("                            <td data-title=\"Starting Time\">30th June in 2022 8.00 AM</td>\n");
      out.write("                            <td data-title=\"Exam Duratio\">Published</td>\n");
      out.write("                            <td data-title=\"Status\">Published</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td data-title=\"Exam\">1st semester</td>\n");
      out.write("                            <td data-title=\"Starting Time\">30th June in 2022 8.00 AM</td>\n");
      out.write("                            <td data-title=\"Exam Duratio\">Published</td>\n");
      out.write("                            <td data-title=\"Status\">Published</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td data-title=\"Exam\">1st semester</td>\n");
      out.write("                            <td data-title=\"Starting Time\">30th June in 2022 8.00 AM</td>\n");
      out.write("                            <td data-title=\"Exam Duratio\">Published</td>\n");
      out.write("                            <td data-title=\"Status\">Published</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td data-title=\"Exam\">1st semester</td>\n");
      out.write("                            <td data-title=\"Starting Time\">30th June in 2022 8.00 AM</td>\n");
      out.write("                            <td data-title=\"Exam Duratio\">Published</td>\n");
      out.write("                            <td data-title=\"Status\">Published</td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
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
