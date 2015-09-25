package com.example.http;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	//http://localhost:8080/Http/hello
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//super.doGet(req, resp);
		
		//Ïòä¯ÀÀÆ÷Êä³öÄÚÈÝ
		resp.getWriter().write("this is hello servlet!!!");
	}

}
