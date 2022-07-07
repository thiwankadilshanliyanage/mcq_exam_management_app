package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dynmic_0020table_0020load_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>How to add & remove table rows</title>\n");
      out.write("    <link\n");
      out.write("      href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@100;400&display=swap\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("    />\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("      body {\n");
      out.write("        font-family: \"Roboto\", sans-serif;\n");
      out.write("      }\n");
      out.write("      h1 {\n");
      out.write("        text-align: center;\n");
      out.write("      }\n");
      out.write("      table,\n");
      out.write("      form {\n");
      out.write("        width: 500px;\n");
      out.write("        margin: 20px auto;\n");
      out.write("      }\n");
      out.write("      table {\n");
      out.write("        border-collapse: collapse;\n");
      out.write("        text-align: center;\n");
      out.write("      }\n");
      out.write("      table td,\n");
      out.write("      table th {\n");
      out.write("        border: solid 1px black;\n");
      out.write("      }\n");
      out.write("      label,\n");
      out.write("      input {\n");
      out.write("        display: block;\n");
      out.write("        margin: 10px 0;\n");
      out.write("        font-size: 20px;\n");
      out.write("      }\n");
      out.write("      button {\n");
      out.write("        display: block;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <h1>Dynamically Add & Remove Table Rows</h1>\n");
      out.write("    <form>\n");
      out.write("      <div class=\"input-row\">\n");
      out.write("        <label for=\"url\">Url</label>\n");
      out.write("        <input type=\"url\" name=\"url\" id=\"url\" />\n");
      out.write("      </div>\n");
      out.write("      <div class=\"input-row\">\n");
      out.write("        <label for=\"website\">Website Name</label>\n");
      out.write("        <input type=\"text\" name=\"website\" id=\"website\" />\n");
      out.write("      </div>\n");
      out.write("      <button>Submit</button>\n");
      out.write("    </form>\n");
      out.write("    <table>\n");
      out.write("      <thead>\n");
      out.write("        <tr>\n");
      out.write("          <th>Url</th>\n");
      out.write("          <th>Website</th>\n");
      out.write("          <th></th>\n");
      out.write("        </tr>\n");
      out.write("      </thead>\n");
      out.write("      <tbody></tbody>\n");
      out.write("    </table>\n");
      out.write("    <script>\n");
      out.write("      const formEl = document.querySelector(\"form\");\n");
      out.write("      const tbodyEl = document.querySelector(\"tbody\");\n");
      out.write("      const tableEl = document.querySelector(\"table\");\n");
      out.write("      function onAddWebsite(e) {\n");
      out.write("        e.preventDefault();\n");
      out.write("        const website = document.getElementById(\"website\").value;\n");
      out.write("        const url = document.getElementById(\"url\").value;\n");
      out.write("        tbodyEl.innerHTML += `\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${website}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                <td><button class=\"deleteBtn\">Delete</button></td>\n");
      out.write("            </tr>\n");
      out.write("        `;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      function onDeleteRow(e) {\n");
      out.write("        if (!e.target.classList.contains(\"deleteBtn\")) {\n");
      out.write("          return;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        const btn = e.target;\n");
      out.write("        btn.closest(\"tr\").remove();\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      formEl.addEventListener(\"submit\", onAddWebsite);\n");
      out.write("      tableEl.addEventListener(\"click\", onDeleteRow);\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
      out.write("</html><!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>How to add & remove table rows</title>\n");
      out.write("    <link\n");
      out.write("      href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@100;400&display=swap\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("    />\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("      body {\n");
      out.write("        font-family: \"Roboto\", sans-serif;\n");
      out.write("      }\n");
      out.write("      h1 {\n");
      out.write("        text-align: center;\n");
      out.write("      }\n");
      out.write("      table,\n");
      out.write("      form {\n");
      out.write("        width: 500px;\n");
      out.write("        margin: 20px auto;\n");
      out.write("      }\n");
      out.write("      table {\n");
      out.write("        border-collapse: collapse;\n");
      out.write("        text-align: center;\n");
      out.write("      }\n");
      out.write("      table td,\n");
      out.write("      table th {\n");
      out.write("        border: solid 1px black;\n");
      out.write("      }\n");
      out.write("      label,\n");
      out.write("      input {\n");
      out.write("        display: block;\n");
      out.write("        margin: 10px 0;\n");
      out.write("        font-size: 20px;\n");
      out.write("      }\n");
      out.write("      button {\n");
      out.write("        display: block;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <h1>Dynamically Add & Remove Table Rows</h1>\n");
      out.write("    <form>\n");
      out.write("      <div class=\"input-row\">\n");
      out.write("        <label for=\"url\">Url</label>\n");
      out.write("        <input type=\"url\" name=\"url\" id=\"url\" />\n");
      out.write("      </div>\n");
      out.write("      <div class=\"input-row\">\n");
      out.write("        <label for=\"website\">Website Name</label>\n");
      out.write("        <input type=\"text\" name=\"website\" id=\"website\" />\n");
      out.write("      </div>\n");
      out.write("      <button>Submit</button>\n");
      out.write("    </form>\n");
      out.write("    <table>\n");
      out.write("      <thead>\n");
      out.write("        <tr>\n");
      out.write("          <th>Url</th>\n");
      out.write("          <th>Website</th>\n");
      out.write("          <th></th>\n");
      out.write("        </tr>\n");
      out.write("      </thead>\n");
      out.write("      <tbody></tbody>\n");
      out.write("    </table>\n");
      out.write("    <script>\n");
      out.write("      const formEl = document.querySelector(\"form\");\n");
      out.write("      const tbodyEl = document.querySelector(\"tbody\");\n");
      out.write("      const tableEl = document.querySelector(\"table\");\n");
      out.write("      function onAddWebsite(e) {\n");
      out.write("        e.preventDefault();\n");
      out.write("        const website = document.getElementById(\"website\").value;\n");
      out.write("        const url = document.getElementById(\"url\").value;\n");
      out.write("        tbodyEl.innerHTML += `\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${website}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                <td><button class=\"deleteBtn\">Delete</button></td>\n");
      out.write("            </tr>\n");
      out.write("        `;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      function onDeleteRow(e) {\n");
      out.write("        if (!e.target.classList.contains(\"deleteBtn\")) {\n");
      out.write("          return;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        const btn = e.target;\n");
      out.write("        btn.closest(\"tr\").remove();\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      formEl.addEventListener(\"submit\", onAddWebsite);\n");
      out.write("      tableEl.addEventListener(\"click\", onDeleteRow);\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
      out.write("</html>");
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
