package com.ccit.mservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccit.dao.BookDAO;

public class Book_Del extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Book_Del() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = new Integer(request.getParameter("id"));
		BookDAO bd = new BookDAO();
		if(bd.deleteBook(id)){
			response.sendRedirect("/book_list");
		}else{
			response.sendError(444,"没有删除权限！");
		}
	}

}
