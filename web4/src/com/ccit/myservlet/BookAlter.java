package com.ccit.myservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccit.dao.BookDAO;
import com.ccit.sta.Book;

public class BookAlter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BookAlter() {
		super();

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int id = new Integer(request.getParameter("id"));
		Book b = new Book();
		BookDAO bd = new BookDAO();
		String code = request.getParameter("code");
		String title = request.getParameter("title");
		String name = request.getParameter("name");
		String pub = request.getParameter("pub");
		int total = new Integer(request.getParameter("total"));
		int count = new Integer(request.getParameter("count"));
		b.setId(id);
		b.setCode(code);
		b.setTitle(title);
		b.setAuthor(name);
		b.setPublishing(pub);
		b.setTotal(total);
		b.setCount(count);
		bd.alterBook(b);
		response.sendRedirect("/bookhome");
	
	}

}
