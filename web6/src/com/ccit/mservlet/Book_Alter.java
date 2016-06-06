package com.ccit.mservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccit.dao.BookDAO;

public class Book_Alter extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public Book_Alter() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String code = request.getParameter("code");
		BookDAO bd = new BookDAO();
		request.setAttribute("book", bd.findOne(code));
		request.getRequestDispatcher("/WEB-INF/views/book_alter.jsp").forward(request, response);
	}


}
