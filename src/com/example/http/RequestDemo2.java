package com.example.http;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDemo2 extends HttpServlet {
	
	//ע�⣺tomcat���������Ȼ����servlet��service������Ȼ����service�������ٸ�������ʽ���ֱ���ö�Ӧ��doXX���������磬�����GET����ʽ����service�����е���doGet������
	//��Ϊ�������ʽ��GET ��POST�����Ա�дservlet����ֻ��Ҫ����doGet��doPost����
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println(req.getMethod());
		System.out.println("service����������");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("GET��ʽ�ύ");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Post��ʽ�ύ");
	}
	
	

}
