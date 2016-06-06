package com.ccit.mservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccit.dao.MyService;

public class Ret extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Ret() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MyService ms = new MyService();
		String bookcode = request.getParameter("bookcode");
		String cardcode = request.getParameter("cardcode");
		String mes = ms.book_Ret(bookcode, cardcode);
		response.sendRedirect("/home?mes="+mes);
	}

}
