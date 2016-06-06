package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.ccit.sta.Book;

public final class book_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.List<java.lang.String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<java.lang.String>(1);
    _jspx_dependants.add("/WEB-INF/views/head.jsp");
  }

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>图书管理</title>\r\n");
      out.write("\r\n");
      out.write("<link href=\"//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link href=\"navbar.css\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("\tpadding-top: 20px;\r\n");
      out.write("\tpadding-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar {\r\n");
      out.write("\tmargin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<nav class=\"navbar navbar-default\">\r\n");
      out.write("\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t<strong class=\"navbar-brand\">图书馆管理</strong>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/homeh\">主页</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/cardlist\">借书卡管理</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/bookhome\">图书管理</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a>欢迎登陆</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</nav>");
      out.write('\r');
      out.write('\n');

	List<Book> list = (List<Book>)request.getAttribute("list");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"bs-example\" data-example-id=\"contextual-table\">\r\n");
      out.write("\t<form class=\"form-inline\" action=\"/bookfind\">\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"exampleInputAmount\"\r\n");
      out.write("\t\t\t\t\tplaceholder=\"请输入查找的内容\" name=\"wd\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<button type=\"submit\" class=\"btn btn-primary\">查询</button>\r\n");
      out.write("\t\t<a type=\"button\" class=\"btn btn-success\" href=\"/booka_v\"\r\n");
      out.write("\t\t\tstyle=\"float: right\">新增</a>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<table class=\"table\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr class=\"active\">\r\n");
      out.write("\t\t\t\t<th scope=\"row\">序号</th>\r\n");
      out.write("\t\t\t\t<th>书号</th>\r\n");
      out.write("\t\t\t\t<th>书名</th>\r\n");
      out.write("\t\t\t\t<th>作者</th>\r\n");
      out.write("\t\t\t\t<th>出版社</th>\r\n");
      out.write("\t\t\t\t<th>总数</th>\r\n");
      out.write("\t\t\t\t<th>剩余数量</th>\r\n");
      out.write("\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t");

				for(Book b : list){
			
      out.write("\r\n");
      out.write("\t\t\t<tr class=\"success\">\r\n");
      out.write("\t\t\t\t<th scope=\"row\">");
      out.print(b.getId());
      out.write("</th>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(b.getCode());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(b.getTitle());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(b.getAuthor());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(b.getPublishing());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(b.getTotal());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(b.getCount());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<button id=\"");
      out.print(b.getId());
      out.write("\" type=\"button\" class=\"btn btn-warning\">修改</button>\r\n");
      out.write("\t\t\t\t\t<button id=\"");
      out.print(b.getId());
      out.write("\" type=\"button\" class=\"btn btn-danger\">删除</button>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"//cdn.bootcss.com/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(\"ul>li:nth-child(3)\").addClass(\"active\");\r\n");
      out.write("\t$(\"button.btn-danger\").click(function() {\r\n");
      out.write("\t\tvar id = $(this).attr(\"id\");\r\n");
      out.write("\t\tif (confirm(\"是否要删除？\")) {\r\n");
      out.write("\t\t\tlocation.href = \"/bookdel?id=\" + id;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t$(\"button.btn-warning\").click(function() {\r\n");
      out.write("\t\tvar id = $(this).attr(\"id\");\r\n");
      out.write("\t\tlocation.href = \"/find?id=\" + id;\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
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
