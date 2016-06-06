package com.ccit.myservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccit.dao.CardDAO;
import com.ccit.sta.Card;

public class CardAlter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CardAlter() {
		super();

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int id = new Integer(request.getParameter("id"));
		Card c = new Card();
		String code = request.getParameter("code");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		c.setId(id);
		c.setCode(code);
		c.setName(name);
		c.setTel(tel);
		CardDAO cd = new CardDAO();
		if (cd.alterCard(c)) {
			response.sendRedirect("/cardlist");
		} else {
			response.sendError(444, "alter error");
		}
	}
}
