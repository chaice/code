<%@ page import="com.ccit.dao.CardDAO"%>

<%
	CardDAO cd = new CardDAO();
	String code = request.getParameter("id");
	if (cd.find(code) != null) {
		request.setAttribute("user", cd.find(code));
		request.getRequestDispatcher("/cardupdate.jsp").forward(
				request, response);
	}
%>