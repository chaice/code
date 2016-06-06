<%@ page import="com.ccit.dao.CardDAO"%>
<%@ page import="com.ccit.sta.Card"%>

<% 
request.setCharacterEncoding("utf-8");
Card c = new Card();
CardDAO cd = new CardDAO();
String code = request.getParameter("code");
String name = request.getParameter("name");
String tel = request.getParameter("tel");
c.setCode(code);
c.setName(name);
c.setTel(tel);
cd.add(c);
response.sendRedirect("/card_list.jsp");
%>