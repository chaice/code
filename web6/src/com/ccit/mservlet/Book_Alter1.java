package com.ccit.mservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccit.dao.BookDAO;
import com.ccit.sta.Book;

public class Book_Alter1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Book_Alter1() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = new Integer(request.getParameter("id"));
		String code = request.getParameter("code");
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String publishing = request.getParameter("publishing");
		int total = Integer.parseInt(request.getParameter("total"));
		int count = Integer.parseInt(request.getParameter("count"));
		Book b = new Book();
		BookDAO bd = new BookDAO();
		b.setId(id);
		b.setCode(code);
		b.setTitle(title);
		b.setAuthor(author);
		b.setPublishing(publishing);
		b.setTotal(total);
		b.setCount(count);
		bd.alterBook(b);
		response.sendRedirect("/book_list");
		
	}

}
