package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class addExam_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">   \n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <!--CSS file -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/exam.css\">\n");
      out.write("\n");
      out.write("        <title>Add Exam</title>\n");
      out.write("\n");
      out.write("        <!--navbar-->\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Navbar</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Link</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                            Dropdown\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">Action</a></li>\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\n");
      out.write("                            <li><hr class=\"dropdown-divider\"></li>\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link disabled\" href=\"#\" tabindex=\"-1\" aria-disabled=\"true\">Disabled</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <form class=\"d-flex\">\n");
      out.write("                    <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                    <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("</head>\n");
      out.write("<body>    \n");
      out.write("    <section class=\"p-5\">\n");
      out.write("        <div class=\"d-grid gap-2 d-md-flex justify-content-md-end\">\n");
      out.write("\n");
      out.write("            <!--search -->\n");
      out.write("            <input class=\"col-3\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\" id=\"myinput\" onkeyup='tableSearch()'>\n");
      out.write("            <form action=\"addQuestion.jsp\"><button type=\"submit\" class=\"qbtn btn btn-primary btn-lg\" >New Exam</button></form>\n");
      out.write("        </div><br><br>\n");
      out.write("        <div class=\"table-responsive\" id=\"no-more-tables\">\n");
      out.write("            <table class=\"table bg-white\" id=\"mytable\">\n");
      out.write("                <thead class=\"bg-dark text-light\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Exam</th>\n");
      out.write("                        <th>Last Updated</th>\n");
      out.write("                        <th>Status</th>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                ");

                    try {
                        Connection con;
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mcq_manage_app", "root", "thiwanka123");
                        System.out.println("Connected Success");

                        String qry = "select * from mcq_manage_app.exam";
                        PreparedStatement ps = con.prepareStatement(qry);

                        ResultSet rs = ps.executeQuery();
                        while (rs.next()) {
                            String exam = rs.getString("e_name");
                            String lastupdated = rs.getString("e_date");
                            String status = rs.getString("pub_or_pend");

                            System.out.println(exam);
                            System.out.println(lastupdated);
                            System.out.println(status);


                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td data-title=\"Exam\">");
      out.print( rs.getString("e_name"));
      out.write("</td>\n");
      out.write("                    <td data-title=\"Last Updated\">");
      out.print( rs.getString("e_date"));
      out.write("</td>\n");
      out.write("                    <td data-title=\"Status\">");
      out.print( rs.getString("pub_or_pend"));
      out.write("</td>\n");
      out.write("                </tr>                               \n");
      out.write("                ");

                        }

                    } catch (Exception e) {
                    }
                
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function tableSearch() {\n");
      out.write("            let input, filter, table, tr, td, i, txtValue;\n");
      out.write("            console.log(\"is this working\");\n");
      out.write("            \n");
      out.write("            input = document.getElementById(\"myinput\");\n");
      out.write("            filter = input.value.toUpperCase();\n");
      out.write("            table = document.getElementById(\"mytable\");\n");
      out.write("            tr = table.getElementsByTagName(\"tr\");\n");
      out.write("            \n");
      out.write("            for(let i=0; i<tr.length; i++){\n");
      out.write("                td = tr[i].getElementsByTagName(\"td\")[0];\n");
      out.write("                if(td){\n");
      out.write("                    txtValue = td.textContent || td.innerText;\n");
      out.write("                    if(txtValue.toUpperCase().indexOf(filter)>-1){\n");
      out.write("                        tr[i].style.display = \"\";\n");
      out.write("                    }else{\n");
      out.write("                        tr[i].style.display = \"none\";\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
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
