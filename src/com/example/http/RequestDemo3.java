package com.example.http;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8080/Http/RequestDemo3
public class RequestDemo3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		//��ȡ����ͷ�� user-agent
		String userAgent = request.getHeader("user-agent");
		System.out.println(userAgent);
		
		//�ж��û�ʹ�õ����������
		if(userAgent.contains("Firefox")){
			response.getWriter().write("������ʹ�û�������");
		}else if(userAgent.contains("Chrome")){
			response.getWriter().write("������ʹ�ùȸ������");
		}else if(userAgent.contains("Trident")){
			response.getWriter().write("������ʹ��IE�����");
		}else{
			response.getWriter().write("������û����������������ʹ�û�������");
		}
	}

	
	
}
