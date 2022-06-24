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
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js\"></script>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/addQ.css\">\n");
      out.write("\n");
      out.write("        <title>Add Questions</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"qlist  \">\n");
      out.write("            <section class=\" sec\">\n");
      out.write("                <div class=\"d-inline \">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-labeled btn-default\">\n");
      out.write("                        <i class=\"fa fa-chevron-left\"></i></button>\n");
      out.write("                    <span class=\"btn-label exname\">Exam Name</span><br><br></div>\n");
      out.write("                <span class=\"d-grid gap-2 d-md-flex justify-content-md-end\">\n");
      out.write("                    <h5 class=\"question\">Question List</h5>\n");
      out.write("                    <button type=\"button\" class=\"qbtn btn btn-primary btn-lg\">Add Questions</button>\n");
      out.write("                </span>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"table-responsive\" id=\"no-more-tables\">\n");
      out.write("                    <table class=\"table bg-white\">\n");
      out.write("                        <thead class=\"bg-dark text-light\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Exam</th>\n");
      out.write("                                <th>Last Updated</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <td data-title=\"Exam\">What is your name?</td>\n");
      out.write("                                <td data-title=\"Last Updated\">Answer 1, Answer 2, Answer 3, Answer 4</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td data-title=\"Exam\">What is your name?</td>\n");
      out.write("                                <td data-title=\"Last Updated\">Answer 1, Answer 2, Answer 3, Answer 4</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td data-title=\"Exam\">What is your name?</td>\n");
      out.write("                                <td data-title=\"Last Updated\">Answer 1, Answer 2, Answer 3, Answer 4</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td data-title=\"Exam\">What is your name?</td>\n");
      out.write("                                <td data-title=\"Last Updated\">Answer 1, Answer 2, Answer 3, Answer 4</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td data-title=\"Exam\">What is your name?</td>\n");
      out.write("                                <td data-title=\"Last Updated\">Answer 1, Answer 2, Answer 3, Answer 4</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td data-title=\"Exam\">What is your name?</td>\n");
      out.write("                                <td data-title=\"Last Updated\">Answer 1, Answer 2, Answer 3, Answer 4</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td data-title=\"Exam\">What is your name?</td>\n");
      out.write("                                <td data-title=\"Last Updated\">Answer 1, Answer 2, Answer 3, Answer 4</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td data-title=\"Exam\">What is your name?</td>\n");
      out.write("                                <td data-title=\"Last Updated\">Answer 1, Answer 2, Answer 3, Answer 4</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td data-title=\"Exam\">What is your name?</td>\n");
      out.write("                                <td data-title=\"Last Updated\">Answer 1, Answer 2, Answer 3, Answer 4</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td data-title=\"Exam\">What is your name?</td>\n");
      out.write("                                <td data-title=\"Last Updated\">Answer 1, Answer 2, Answer 3, Answer 4</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td data-title=\"Exam\">What is your name?</td>\n");
      out.write("                                <td data-title=\"Last Updated\">Answer 1, Answer 2, Answer 3, Answer 4</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td data-title=\"Exam\">What is your name?</td>\n");
      out.write("                                <td data-title=\"Last Updated\">Answer 1, Answer 2, Answer 3, Answer 4</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td data-title=\"Exam\">What is your name?</td>\n");
      out.write("                                <td data-title=\"Last Updated\">Answer 1, Answer 2, Answer 3, Answer 4</td>\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <form>\n");
      out.write("                    <div class=\"row form-group\">\n");
      out.write("                        <label for=\"date\" class=\"col-sm-2 col-form-label\">Exam Date</label>\n");
      out.write("                        <div class=\"col-sm-4\">\n");
      out.write("                            <div class=\"input-group date\" id=\"datepicker\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\">\n");
      out.write("                                <span class=\"input-group-append\">\n");
      out.write("                                    <span class=\"input-group-text bg-white d-block\">\n");
      out.write("                                        <i class=\"fa fa-calendar\"></i>\n");
      out.write("                                    </span>\n");
      out.write("                                </span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div><br>\n");
      out.write("                    <div class=\"row form-group\">\n");
      out.write("                        <label for=\"date\" class=\"col-sm-2 col-form-label\">Exam Duration</label>\n");
      out.write("                        <div class=\"col-sm-4\">\n");
      out.write("                            <div class=\"input-group date\" id=\"duration\">\n");
      out.write("                                <input type=\"number\" class=\"form-control\" placeholder=\"Minutes\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"-grid gap-2 d-md-flex justify-content-md-end\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-success\">Publish Paper</button>\n");
      out.write("                </div>   \n");
      out.write("                </form>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"w-50 p-3 addquestiondiv\">\n");
      out.write("            <form>\n");
      out.write("                <div class=\"row g-2\">\n");
      out.write("                    <div class=\"col-md\">\n");
      out.write("                        <input type=\"number\" class=\"form-control \" id=\"floatingInputGrid\" placeholder=\"Number\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md col-xs-2\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"floatingInputGrid\" placeholder=\"Question\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"row g-3 align-items-center\">\n");
      out.write("                    <div class=\"col-auto\">\n");
      out.write("                        <label for=\"inputPassword6\" class=\"col-form-label\">1.</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-auto width\">\n");
      out.write("                        <input type=\"password\" id=\"inputPassword6\" class=\"form-control\" aria-describedby=\"passwordHelpInline\" placeholder=\"Answer 1\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-auto\">\n");
      out.write("                        <span id=\"passwordHelpInline\" class=\"form-text\">\n");
      out.write("                            <input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                </div><br>\n");
      out.write("                <div class=\"row g-3 align-items-center\">\n");
      out.write("                    <div class=\"col-auto\">\n");
      out.write("                        <label for=\"inputPassword6\" class=\"col-form-label\">2.</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-auto width\">\n");
      out.write("                        <input type=\"password\" id=\"inputPassword6\" class=\"form-control\" aria-describedby=\"passwordHelpInline\" placeholder=\"Answer 2\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-auto\">\n");
      out.write("                        <span id=\"passwordHelpInline\" class=\"form-text\">\n");
      out.write("                            <input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                </div><br>\n");
      out.write("                <div class=\"row g-3 align-items-center\">\n");
      out.write("                    <div class=\"col-auto\">\n");
      out.write("                        <label for=\"inputPassword6\" class=\"col-form-label\">3.</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-auto width\">\n");
      out.write("                        <input type=\"password\" id=\"inputPassword6\" class=\"form-control\" aria-describedby=\"passwordHelpInline\" placeholder=\"Answer 3\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-auto\">\n");
      out.write("                        <span id=\"passwordHelpInline\" class=\"form-text\">\n");
      out.write("                            <input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                </div><br>\n");
      out.write("                <div class=\"row g-3 align-items-center\">\n");
      out.write("                    <div class=\"col-auto\">\n");
      out.write("                        <label for=\"inputPassword6\" class=\"col-form-label\">4.</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-auto width\">\n");
      out.write("                        <input type=\"password\" id=\"inputPassword6\" class=\"form-control\" aria-describedby=\"passwordHelpInline\" placeholder=\"Answer 4\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-auto\">\n");
      out.write("                        <span id=\"passwordHelpInline\" class=\"form-text\">\n");
      out.write("                            <input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                </div><br>\n");
      out.write("                <div class=\"col-md-12 text-center\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                </div>               \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(function () {\n");
      out.write("                $('#datepicker').datepicker();\n");
      out.write("            });\n");
      out.write("        </script>\n");
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
