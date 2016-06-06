<%@ page import="com.ccit.dao.CardDAO"%>

<%
int id = new Integer(request.getParameter("id"));
CardDAO cd = new CardDAO();
cd.remove(id);
response.sendRedirect("/card_list.jsp");
%>