package com.ccit.mservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccit.dao.BookDAO;
import com.ccit.sta.Book;

public class Book_Add1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Book_Add1() {
		super();

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String code = request.getParameter("code");
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String publishing = request.getParameter("publishing");
		int total = Integer.parseInt(request.getParameter("total"));
		Book b = new Book();
		BookDAO bd = new BookDAO();
		b.setCode(code);
		b.setTitle(title);
		b.setAuthor(author);
		b.setPublishing(publishing);
		b.setTotal(total);
		bd.addBook(b);
		response.sendRedirect("/book_list");
	}

}
