package com.sbs.board;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ArticleServlet2")
public class ArticleServlet2 extends HttpServlet {
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		ServletContext application = request.getServletContext();
//		
//		String rst1 = (String)request.getAttribute("key");
//		String rst2 = (String)application.getAttribute("key");
//		
//		if (rst1 == null) {
//			System.out.println("값이 존재하지 않습니다.");
//		}
//		else {				
//			System.out.println(rst1);
//		}
//		
//		if (rst2 == null) {
//			System.out.println("값이 존재하지 않습니다.");
//		}
//		else {				
//			System.out.println(rst2);
//		}
//	}
}