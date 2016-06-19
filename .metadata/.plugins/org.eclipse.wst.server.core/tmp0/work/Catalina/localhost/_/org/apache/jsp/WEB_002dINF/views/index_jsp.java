package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.List<java.lang.String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.List<java.lang.String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>管理员登陆</title>\r\n");
      out.write("<link href=\"//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link href=\"signin.css\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("\tpadding-top: 40px;\r\n");
      out.write("\tpadding-bottom: 40px;\r\n");
      out.write("\tbackground-color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-signin {\r\n");
      out.write("\tmax-width: 330px;\r\n");
      out.write("\tpadding: 15px;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-signin .form-signin-heading,.form-signin .checkbox {\r\n");
      out.write("\tmargin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-signin .checkbox {\r\n");
      out.write("\tfont-weight: normal;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-signin .form-control {\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\theight: auto;\r\n");
      out.write("\t-webkit-box-sizing: border-box;\r\n");
      out.write("\t-moz-box-sizing: border-box;\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-signin .form-control:focus {\r\n");
      out.write("\tz-index: 2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-signin input[type=\"email\"] {\r\n");
      out.write("\tmargin-bottom: -1px;\r\n");
      out.write("\tborder-bottom-right-radius: 0;\r\n");
      out.write("\tborder-bottom-left-radius: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-signin input[type=\"password\"] {\r\n");
      out.write("\tmargin-bottom: 10px;\r\n");
      out.write("\tborder-top-left-radius: 0;\r\n");
      out.write("\tborder-top-right-radius: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#d1 {\r\n");
      out.write("\tbackground-image:\r\n");
      out.write("\t\turl(\"https://www.google.com.hk/logos/doodles/2016/frankie-mannings-102nd-birthday-5160522641047552-hp.gif\");\r\n");
      out.write("\twidth: 404px;\r\n");
      out.write("\theight: 228px\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<div class=\"container\" id=\"d1\"></div>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<form class=\"form-signin\" action=\"/home_c\" method=\"post\">\r\n");
      out.write("\t\t\t<h2 class=\"form-signin-heading\">用户登录</h2>\r\n");
      out.write("\t\t\t<label for=\"inputEmail\" class=\"sr-only\">用户名</label> <input\r\n");
      out.write("\t\t\t\ttype=\"text\" id=\"inputEmail\" class=\"form-control\"\r\n");
      out.write("\t\t\t\tplaceholder=\"请输入用户名！\" name=\"name\"> <label\r\n");
      out.write("\t\t\t\tfor=\"inputPassword\" class=\"sr-only\">密码</label> <input\r\n");
      out.write("\t\t\t\ttype=\"password\" id=\"inputPassword\" class=\"form-control\"\r\n");
      out.write("\t\t\t\tplaceholder=\"请输入密码！\" name=\"pwd\">\r\n");
      out.write("\t\t\t<button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">登陆</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/views/index.jsp(68,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.err==444}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t<div class=\"container\">\r\n");
        out.write("\t\t\t<strong class=\"btn-danger\">你输入的信息有误，请重新输入！</strong>\r\n");
        out.write("\t\t</div>\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
