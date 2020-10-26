package com.servlet.core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		out.print("hii ");
		
//		ServletContext ctx = getServletContext();// from GenericServlet bcoz HttpServlet extends the GenericServlet
//		String name = ctx.getInitParameter("name");
//		out.println(name);
//		String phone = ctx.getInitParameter("phone");
//		out.println(phone);
		
		ServletConfig ctx = getServletConfig();// from GenericServlet bcoz HttpServlet extends the GenericServlet
		String name = ctx.getInitParameter("name");
		out.println(name);
	}

}
