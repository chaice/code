package com.ccit.myservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccit.dao.AdminDAO;


public class HomeH extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public HomeH() {
        super();
        
    }
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
  }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		AdminDAO ad = new AdminDAO();
		if (ad.find(name, pwd)) {
			request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
		} else {
			response.sendRedirect("/index.jsp?err=444");
		}
	}

}
