package com.ccit.mservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Book_Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Book_Add() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/book_add.jsp").forward(request, response);
	}

}
