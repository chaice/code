<%@ page import= "com.ccit.dao.AdminDAO"%>
<%@ page import= "com.ccit.sta.Admin"%>

<%
AdminDAO ad = new AdminDAO();
String name = request.getParameter("name");
String pwd = request.getParameter("pwd");
if(ad.find(name, pwd)){
	response.sendRedirect("/home.jsp");
}else{
	response.sendRedirect("/index.jsp?err=444");
}

%>