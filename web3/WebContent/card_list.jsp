<%@ page import="com.ccit.dao.CardDAO"%>

<% 
CardDAO cd = new CardDAO();
request.setAttribute("list", cd.findAll());
request.getRequestDispatcher("/card.jsp").forward(request, response);
%>