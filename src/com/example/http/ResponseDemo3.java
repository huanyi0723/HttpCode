package com.example.http;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8080/Http/ResponseDemo3
public class ResponseDemo3 extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 * ��ʱˢ�� ԭ���������ʶrefreshͷ���õ�refreshͷ֮����������ǰ��Դ
		 */
		response.setHeader("refresh", "1"); //ÿ��1��ˢ�´�ҳ��
		
		response.getWriter().write( "" + new Date());

		/**
		 * ��n��֮����ת�������Դ
		 */
		//response.setHeader("refresh", "3;url=/Http/adv.html");// ��3��֮����ת��adv.html
	}

}
