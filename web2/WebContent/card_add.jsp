<%@ page import="com.ccit.sta.Card"%>
<%@ page import="com.ccit.dao.CardDAO"%>
<%
request.setCharacterEncoding("UTF-8");
String code = request.getParameter("code");
String name = request.getParameter("name");
String tel = request.getParameter("tel");
System.out.println(name);
Card c = new Card();
c.setCode(code);
c.setName(name);
c.setTel(tel);
CardDAO cd = new CardDAO();
cd.add(c);
response.sendRedirect("/card_list.jsp");
%>