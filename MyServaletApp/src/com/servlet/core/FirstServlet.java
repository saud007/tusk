package com.servlet.core;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class FirstServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) {


//		try {
//			int a = Integer.parseInt(req.getParameter("p1"));
//			int b = Integer.parseInt(req.getParameter("p2"));
//
//			int k = a + b;
//			
//			req.setAttribute("k", k);
//			RequestDispatcher rd = req.getRequestDispatcher("square");
//			rd.forward(req, res);
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}

//		try {
//			int a = Integer.parseInt(req.getParameter("p1"));
//			int b = Integer.parseInt(req.getParameter("p2"));
//
//			int k = a + b;
//			
//			res.sendRedirect("square?k="+k);
//			
////			req.setAttribute("k", k);
////			RequestDispatcher rd = req.getRequestDispatcher("square");
////			rd.forward(req, res);
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
//		try {
//			int a = Integer.parseInt(req.getParameter("p1"));
//			int b = Integer.parseInt(req.getParameter("p2"));
//
//			int k = a + b;
//			
//			HttpSession session = req.getSession();
//			session.setAttribute("k",k);
//			
//			res.sendRedirect("square");
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
//		try {
//			int a = Integer.parseInt(req.getParameter("p1"));
//			int b = Integer.parseInt(req.getParameter("p2"));
//
//			int k = a + b;
//			
//			Cookie cookie = new Cookie("k", k+"");
//			res.addCookie(cookie);
//			res.sendRedirect("square");
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
	
//		try {
//			int a = Integer.parseInt(req.getParameter("p1"));
//			int b = Integer.parseInt(req.getParameter("p2"));
//
//			int k = a + b;
//		
//			PrintWriter pw = res.getWriter();
//			pw.println("<html>");
//			pw.println("<body>");    // that is why we use jsp over servlet
//			pw.println("Output : ");
//			pw.println("Output : ");
//			pw.println("Output : ");
//		
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
	}

}
