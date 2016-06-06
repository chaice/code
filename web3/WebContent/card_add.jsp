<%@ page import="com.ccit.dao.CardDAO"%>
<%@ page import="com.ccit.sta.Card"%>

<% 
request.setCharacterEncoding("utf-8");
String code = request.getParameter("code");
String name = request.getParameter("name");
String tel = request.getParameter("tel");
Card c = new Card();
c.setCode(code);
c.setName(name);
c.setTel(tel);
CardDAO cd = new CardDAO();
cd.add(c);
response.sendRedirect("/card_list.jsp");
%>
