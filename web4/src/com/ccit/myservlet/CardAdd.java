package com.ccit.myservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccit.dao.CardDAO;
import com.ccit.sta.Card;

public class CardAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CardAdd() {
        super();
      
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Card c = new Card();
		CardDAO cd = new CardDAO();
		c.setCode(request.getParameter("code"));
		c.setName(request.getParameter("name"));
		c.setTel(request.getParameter("tel"));
		cd.add(c);
		response.sendRedirect("/cardlist");
	}

}
