package com.example.http;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8080/Http/ResponseDemo2
public class ResponseDemo2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 * ���� ��ת��adv.html ʹ�������ض��� ����һ��302״̬��+location����Ӧͷ
		 */
		/*
		 * response.setStatus(302);//����һ��302״̬�� response.setHeader("location",
		 * "/day09/adv.html"); //location����Ӧͷ
		 */

		// �����ض����д��
		response.sendRedirect("/Http/adv.html");

	}

}
