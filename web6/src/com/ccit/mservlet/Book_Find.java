package com.ccit.mservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccit.dao.BookDAO;

public class Book_Find extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Book_Find() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String wd = new String(request.getParameter("wd").getBytes("ISO-8859-1"),"utf-8");
		BookDAO bd = new BookDAO();
		request.setAttribute("list",bd.findBooks(wd));
		request.getRequestDispatcher("/WEB-INF/views/book_find.jsp").forward(request, response);
	}

}
