<%@ page import="com.ccit.dao.AdminDAO"%>
<%@ page import="com.ccit.sta.Admin"%>

<% 
AdminDAO ad = new AdminDAO();
String name = request.getParameter("username");
String pwd = request.getParameter("userpwd");
if(ad.find(name, pwd)){
	response.sendRedirect("/home.jsp");
}else{
	response.sendRedirect("/index.jsp?err=444");
}
%>