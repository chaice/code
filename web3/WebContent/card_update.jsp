<%@page import="com.ccit.sta.Card"%>
<%@ page import="com.ccit.dao.CardDAO"%>

<%
request.setCharacterEncoding("utf-8");
String code = request.getParameter("code");
String name = request.getParameter("name");
String tel = request.getParameter("tel");
int id = new Integer(request.getParameter("id"));
Card c = new Card();
c.setId(id);
c.setCode(code);
c.setName(name);
c.setTel(tel);
CardDAO cd = new CardDAO();
if(cd.alterCard(c)){
	response.sendRedirect("/card_list.jsp");
}else{
	response.sendError(444,"alter error");
}
%>