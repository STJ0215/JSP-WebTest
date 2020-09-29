package com.sbs.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sbs.board.article.dao.ArticleDao;
import com.sbs.board.member.dao.Member;


@WebServlet("/ArticleServlet")
public class ArticleServlet extends HttpServlet {
//	ArticleDao dao = new ArticleDao();
//	MyBatis my = new MyBatis();
//
//
//	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
//		ServletContext application = req.getServletContext();
//		HttpSession session = req.getSession();
//		String action = req.getParameter("action");
//		//String flag = req.getParameter("flag"); // y, n
//		
//		/*
//		if (flag.equals("y")) {
//			req.setAttribute("key", "req_val");
//			application.setAttribute("key", "context_val");			
//		}
//		*/
//		
//		if (action.equals("req")) {
//			String rst = (String)req.getAttribute("key");
//			
//			if (rst == null) {
//				System.out.println("값이 존재하지 않습니다.");
//			}
//			else {				
//				System.out.println(rst);
//			}	
//		}
//		else if (action.equals("context")) {
//			String rst = (String)application.getAttribute("key");
//			
//			if (rst == null) {
//				System.out.println("값이 존재하지 않습니다.");
//			}
//			else {				
//				System.out.println(rst);
//			}
//		}
//		else if (action.equals("doLogin")) {
//			String id = req.getParameter("id");
//			String pw = req.getParameter("pw");
//			
//			Member member = dao.loginCheck(id, pw);
//			
//			if (member != null) {
//				application.setAttribute("loginedMember", member);
//			}
//			req.setAttribute("articles", dao.getAllArticles());
//			
//			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/list.jsp");
//			rd.forward(req, response);
//		}
//		else if (action.equals("doLogout")) {
//			session.invalidate();
//			
//			response.sendRedirect("ArticleServlet?action=showLogin");
//		}
//		else if (action.equals("showLogin")) {
//			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/login.jsp");
//			
//			rd.forward(req, response);
//		}
//		else if (action.equals("list")) {
//			//req.setAttribute("test", "el test!!!");
//			req.setAttribute("articles", dao.getAllArticles());
//			/*
//			for (Article a : dao.getAllArticles()) {
//				
//			}
//			*/
//			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/list.jsp");
//			rd.forward(req, response);
//		}
//		else if (action.equals("read")) {
//			int id = Integer.parseInt(req.getParameter("id"));
//			
//			my.getArticleById(id);
//		}
//		else if (action.equals("doAdd")) {
//			String title = req.getParameter("title");
//			String body = req.getParameter("body");
//			
//			my.insertArticle(title, body);
//		}
//		else if (action.equals("showAdd")) {
//			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/add.jsp");
//			
//			rd.forward(req, response);
//		}
//		else if (action.equals("doUpdate")) {
//			
//		}
//		else if (action.equals("doDelete")) {
//			
//		}
//		else if (action.equals("my")) {
//			MyBatis mb = new MyBatis();
//			
//			mb.getAllArticles();
//		}
//	}
//	
//	
//	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
//		doGet(req, response);
//	}
}