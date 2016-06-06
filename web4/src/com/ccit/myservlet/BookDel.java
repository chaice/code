package com.ccit.myservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccit.dao.BookDAO;

public class BookDel extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BookDel() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int id = new Integer(request.getParameter("id"));
		BookDAO bd = new BookDAO();
		if (bd.deleteBook(id)) {
			response.sendRedirect("/bookhome");
		} else {
			response.sendError(403, "û��ɾ��Ȩ��");
		}
	}

}
