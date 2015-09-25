package com.example.http;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8080/Http/RequestDemo4
public class RequestDemo4 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");

		// �õ�refererͷ
		String referer = request.getHeader("referer");
		System.out.println("referer=" + referer);

		/**
		 * �жϷǷ����ӣ� 1��ֱ�ӷ��ʵĻ�referer=null 2�������ǰ���������Թ��
		 */
		if (referer == null || !referer.contains("/Http/adv.html")) {
			response.getWriter().write(
					"��ǰ�ǷǷ����ӣ���ص���ҳ��<a href='/Http/adv.html'>��ҳ</a>");
		} else {
			// ��ȷ������
			response.getWriter().write("��Դ��������...");
		}

	}

}
