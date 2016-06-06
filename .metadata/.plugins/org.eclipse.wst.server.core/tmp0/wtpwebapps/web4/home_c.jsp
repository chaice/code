<%@ page import="com.ccit.dao.AdminDAO" %>

<% 
String name = request.getParameter("name");
String pwd = request.getParameter("pwd");
AdminDAO ad = new AdminDAO();
if(ad.find(name, pwd)){
	response.sendRedirect("/home.jsp");
}else{
	response.sendRedirect("/index.jsp?err=444");
}
%>