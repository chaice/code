package com.ccit.mservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccit.dao.CardDAO;

public class Card_Alter extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Card_Alter() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String code = request.getParameter("code");
		CardDAO cd = new CardDAO();
		request.setAttribute("card", cd.find(code));
		request.getRequestDispatcher("/WEB-INF/views/card_alter.jsp").forward(request, response);
	}


}
