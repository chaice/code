package com.ccit.myservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccit.dao.BookDAO;

public class Find extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Find() {
        super();
       
    }
    BookDAO bd = new BookDAO();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = new Integer(request.getParameter("id"));
		request.setAttribute("book", bd.findOne(id));
		request.getRequestDispatcher("/WEB-INF/views/alter_book.jsp").forward(request, response);
	}

	
}
