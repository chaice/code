package com.ccit.myservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccit.dao.CardDAO;


public class CardFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CardFind() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CardDAO cd = new CardDAO();
		String code = request.getParameter("id");
		request.setAttribute("card", cd.find(code));
		request.getRequestDispatcher("/WEB-INF/views/alter.jsp").forward(request, response);
	}

	

}
