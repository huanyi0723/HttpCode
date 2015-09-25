package com.example.http;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8080/Http/RequestDemo1
public class RequestDemo1 extends HttpServlet {

	/**
	 * 1)  tomcat���������յ���������͵��������ݣ�Ȼ���װ��HttpServetRequest����
	 * 2��tomcat����������doGet������Ȼ���request�����뵽servlet�С�
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 * 3)��request����ȡ���������ݡ�
		 */
		t1(request);
		
		t2(request); 
		
		
	}
	
	private void t1(HttpServletRequest request) {
		/**
		 * 3.1 ������   ��ʽ����GET /day09/hello HTTP/1.1��
		 */
		System.out.println("����ʽ��"+request.getMethod());//����ʽ
		System.out.println("URI:"+request.getRequestURI());//������Դ
		System.out.println("URL:"+request.getRequestURL());
		System.out.println("httpЭ��汾��"+request.getProtocol());//httpЭ��
	}
	
	private void t2(HttpServletRequest request) {
		/**
		 * 3.2 ����ͷ
		 */
		String host = request.getHeader("Host"); //����ͷ���Ƶĵ�ͷ������
		System.out.println(host);
		
		//������������ͷ
		Enumeration<String> enums = request.getHeaderNames(); //�õ����е�����ͷ�����б�
		while(enums.hasMoreElements()){//�ж��Ƿ�����һ��Ԫ��
			String headerName = enums.nextElement(); //ȡ����һ��Ԫ��
			String headerValue = request.getHeader(headerName);
			System.out.println(headerName+":"+headerValue);
		}
	}
	
	// Ϊ�˽���POST��ʽ�ύ������
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp)
			throws ServletException, IOException {
		//��ӡ������
		System.out.println(request.getMethod() + " " + request.getRequestURI() + " " + request.getProtocol());
		
		//��ӡ����ͷ
		Enumeration<String> enums = request.getHeaderNames(); //�õ����е�����ͷ�����б�
		while(enums.hasMoreElements()){//�ж��Ƿ�����һ��Ԫ��
			String headerName = enums.nextElement(); //ȡ����һ��Ԫ��
			String headerValue = request.getHeader(headerName);
			System.out.println(headerName+":"+headerValue);
		}
		
		/**
		 * 3.3 �����ʵ������
		 */
		InputStream in = request.getInputStream(); //�õ�ʵ������
		byte[] buf = new byte[1024];
		int len = 0;
		while(  (len=in.read(buf))!=-1 ){
			String str = new String(buf,0,len);
			System.out.println(str);
		}
	}

	
}