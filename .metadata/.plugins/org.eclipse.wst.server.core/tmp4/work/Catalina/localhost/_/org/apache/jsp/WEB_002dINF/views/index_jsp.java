package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.List<java.lang.String> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.List<java.lang.String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write(" <link href=\"//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <style>\r\n");
      out.write("  body {\r\n");
      out.write("  padding-top: 40px;\r\n");
      out.write("  padding-bottom: 40px;\r\n");
      out.write("  background-color: #eee;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-signin {\r\n");
      out.write("  max-width: 330px;\r\n");
      out.write("  padding: 15px;\r\n");
      out.write("  margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write(".form-signin .form-signin-heading,\r\n");
      out.write(".form-signin .checkbox {\r\n");
      out.write("  margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write(".form-signin .checkbox {\r\n");
      out.write("  font-weight: normal;\r\n");
      out.write("}\r\n");
      out.write(".form-signin .form-control {\r\n");
      out.write("  position: relative;\r\n");
      out.write("  height: auto;\r\n");
      out.write("  -webkit-box-sizing: border-box;\r\n");
      out.write("     -moz-box-sizing: border-box;\r\n");
      out.write("          box-sizing: border-box;\r\n");
      out.write("  padding: 10px;\r\n");
      out.write("  font-size: 16px;\r\n");
      out.write("}\r\n");
      out.write(".form-signin .form-control:focus {\r\n");
      out.write("  z-index: 2;\r\n");
      out.write("}\r\n");
      out.write(".form-signin input[type=\"email\"] {\r\n");
      out.write("  margin-bottom: -1px;\r\n");
      out.write("  border-bottom-right-radius: 0;\r\n");
      out.write("  border-bottom-left-radius: 0;\r\n");
      out.write("}\r\n");
      out.write(".form-signin input[type=\"password\"] {\r\n");
      out.write("  margin-bottom: 10px;\r\n");
      out.write("  border-top-left-radius: 0;\r\n");
      out.write("  border-top-right-radius: 0;\r\n");
      out.write("}\r\n");
      out.write("  </style>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("  ");
 String err = request.getParameter("err");
  if("444".equals("err")){
	
      out.write("\r\n");
      out.write("\t<div class=\"container\"><strong class=\"btn-danger\">用户信息错误，请重新输入！</strong></div>\r\n");
      out.write("\t");
  
  }
  
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <form class=\"form-signin\" method=\"post\" action=\"home_c\">\r\n");
      out.write("        <h2 class=\"form-signin-heading\">用户登录</h2>\r\n");
      out.write("        <label for=\"inputEmail\" class=\"sr-only\">用户名</label>\r\n");
      out.write("        <input type=\"text\" id=\"inputEmail\" class=\"form-control\" name=\"name\" placeholder=\"请输入用户名！\">\r\n");
      out.write("        <label for=\"inputPassword\" class=\"sr-only\">密码</label>\r\n");
      out.write("        <input type=\"password\" id=\"inputPassword\" name=\"pwd\" class=\"form-control\" placeholder=\"请输入密码！\">      \r\n");
      out.write("        <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">登陆</button>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div> \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
