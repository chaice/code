<%@ page import="com.ccit.dao.CardDAO"%>

<% 
CardDAO cd = new CardDAO();
int i = new Integer(request.getParameter("id"));
cd.remove(i);
response.sendRedirect("/card_list.jsp");
%>