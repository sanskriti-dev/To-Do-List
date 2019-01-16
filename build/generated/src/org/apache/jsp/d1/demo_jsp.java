package org.apache.jsp.d1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class demo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>To-Do List App</title>\n");
      out.write("\t<!--<link rel=\"stylesheet\" type=\"text/css\" href=\"main.css\">-->\n");
      out.write("\t<!-- <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\"> -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.5.0/css/all.css\" integrity=\"sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU\" crossorigin=\"anonymous\">\n");
      out.write("\t<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.js\" ></script>\n");
      out.write("        <style type=\"text/css\" >\n");
      out.write("            .container{\n");
      out.write("\twidth: 40%;\n");
      out.write("\tmargin: 100px auto;\n");
      out.write("\t/*border: 1px solid black;*/\n");
      out.write("}\n");
      out.write("input{\n");
      out.write("\tfont-size: 21px;\n");
      out.write("\tcolor: white;\n");
      out.write("\tbackground-color: #FBAB76;\n");
      out.write("\twidth: 100%;\n");
      out.write("\tpadding: 13px 13px 13px 20px;\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("\tborder: 3px solid rgba(0,0,0,0);\n");
      out.write("}\n");
      out.write("\n");
      out.write("::placeholder { \n");
      out.write("   color: #F76707;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1{\n");
      out.write("\tbackground-color: #343A40;\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 10px 20px;\n");
      out.write("\tfont-size: 36px;\n");
      out.write("\tfont-weight: normal;\n");
      out.write("\tcolor: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("i{\n");
      out.write("\tfont-size: 80%;\n");
      out.write("\tcursor: pointer;\n");
      out.write("\tpadding-right: 2px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#rr{\n");
      out.write("\tborder-radius: 3px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body{\n");
      out.write("\tbackground-color: #F76707;\n");
      out.write("\tcolor: #F76707;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul {\n");
      out.write("\tlist-style: none;\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li{\n");
      out.write("\theight: 40px;\n");
      out.write("\tline-height: 40px;\n");
      out.write("\tbackground-color: #FEF0E7;\n");
      out.write("\tmargin: 3px 0;\n");
      out.write("\tpadding: 8px 8px 8px 26px;\n");
      out.write("\tfont-size: 26px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".done{\n");
      out.write("\tcolor:gray;\n");
      out.write("\ttext-decoration: line-through;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <sql:setDataSource var = \"db\" driver = \"com.mysql.jdbc.Driver\"\n");
      out.write("\n");
      out.write("url = \"jdbc:mysql://localhost:3309/d1\"\n");
      out.write("user = \"root\" password = \"123456\"/>\n");
      out.write("    <form method=\"POST\" action=\"demo.jsp\" >\n");
      out.write("        <div class=\"container\">\n");
      out.write("\t\t<h1 id=\"rr\"> <i class=\"fas  fa-list-ul\"></i> TODOS</h1>\n");
      out.write("\n");
      out.write("\t\t<input id=\"rr\" type=\"text\" placeholder=\"Enter a new To-Do\" name=\"todos\">\n");
      out.write("               \n");
      out.write("                <input type=\"submit\" value=\"submit\" name=\"submit\" />\n");
      out.write("\t</div>\n");
      out.write("    </form>\n");
      out.write("     <sql:update dataSource = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${db}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var = \"result\">\n");
      out.write("                    INSERT INTO todo VALUES (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.todos}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(");\n");
      out.write("                </sql:update>\n");
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
