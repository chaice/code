package com.ccit.mservlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login_filter implements Filter {
   private String uris;
    public Login_filter() {
       
    }

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest hr = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		HttpSession session = hr.getSession();
		String name = (String) session.getAttribute("username");
		String uri = hr.getRequestURI();
		String[] ur = uris.split(",");
		boolean flag = false;
		for (String str : ur) {
			if(uri.startsWith(str)){
			flag = true;
			break;
			}
		}
		if(flag){
			chain.doFilter(request, response);
		}else{
			if(name == null){
				res.sendRedirect("/login");
				return;
			}else{
				chain.doFilter(request, response);
			}
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		uris = fConfig.getInitParameter("uris");
	}

}
