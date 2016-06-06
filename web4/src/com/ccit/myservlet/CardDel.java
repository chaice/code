package com.ccit.myservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccit.dao.CardDAO;


public class CardDel extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CardDel() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = new Integer(request.getParameter("id"));
		CardDAO cd = new CardDAO();
		if(cd.remove(id)){
			response.sendRedirect("/cardlist");
		}else{
			response.sendError(444, "del error");
		}
	}

	
}
