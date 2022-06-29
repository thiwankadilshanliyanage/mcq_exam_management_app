package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class scroling_0020table_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <table class=\"col-xs-7 table-bordered table-striped table-condensed table-fixed\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th class=\"col\">Full Name</th>\n");
      out.write("                        <th class=\"col\">Age</th>\n");
      out.write("                        <th class=\"col\">Job Title</th>\n");
      out.write("                        <th class=\"col\">Location</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"col\">Varun Thakur</td>\n");
      out.write("                        <td class=\"col\">30</td>\n");
      out.write("                        <td class=\"col\">DevOps Engineer</td>\n");
      out.write("                        <td class=\"col\">India</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"col\">Olive Yu</td>\n");
      out.write("                        <td class=\"col\">29</td>\n");
      out.write("                        <td class=\"col\">UI Developer</td>\n");
      out.write("                        <td class=\"col\">United Kingdom</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"col\">Sam Buca</td>\n");
      out.write("                        <td class=\"col\">35</td>\n");
      out.write("                        <td class=\"col\">SQL Developer</td>\n");
      out.write("                        <td class=\"col\">United States</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"col\">Tom Ollie</td>\n");
      out.write("                        <td class=\"col\">27</td>\n");
      out.write("                        <td class=\"col\">IT Programmer</td>\n");
      out.write("                        <td class=\"col\">Italy</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"col\">Ray Cyst</td>\n");
      out.write("                        <td class=\"col\">37</td>\n");
      out.write("                        <td class=\"col\">Network Administrator</td>\n");
      out.write("                        <td class=\"col\">France</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"col\">Helen Highwater</td>\n");
      out.write("                        <td class=\"col\">28</td>\n");
      out.write("                        <td class=\"col\">Technical Specialist</td>\n");
      out.write("                        <td class=\"col\">Brasil</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"col\">Caire Innet</td>\n");
      out.write("                        <td class=\"col\">26</td>\n");
      out.write("                        <td class=\"col\">Security Analyst</td>\n");
      out.write("                        <td class=\"col\">South Africa</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"col\">Val Adictorian</td>\n");
      out.write("                        <td class=\"col\">24</td>\n");
      out.write("                        <td class=\"col\">Data Entry</td>\n");
      out.write("                        <td class=\"col\">Netherlands</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"col\">Cooke Edoh</td>\n");
      out.write("                        <td class=\"col\">33</td>\n");
      out.write("                        <td class=\"col\">IT Manager</td>\n");
      out.write("                        <td class=\"col\">Canada</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"col\">Rick Shaw</td>\n");
      out.write("                        <td class=\"col\">25</td>\n");
      out.write("                        <td class=\"col\">Cloud Architect</td>\n");
      out.write("                        <td class=\"col\">Norway</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"col\">Rick Shaw</td>\n");
      out.write("                        <td class=\"col\">25</td>\n");
      out.write("                        <td class=\"col\">Cloud Architect</td>\n");
      out.write("                        <td class=\"col\">Norway</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"col\">Cooke Edoh</td>\n");
      out.write("                        <td class=\"col\">33</td>\n");
      out.write("                        <td class=\"col\">IT Manager</td>\n");
      out.write("                        <td class=\"col\">Canada</td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
