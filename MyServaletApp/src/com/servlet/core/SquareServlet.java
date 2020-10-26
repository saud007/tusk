package com.servlet.core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/square")
public class SquareServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int k = 0;
		
		//k =(int) req.getAttribute("k");
		//k = Integer.parseInt(req.getParameter("k"));
		
//		HttpSession s = req.getSession();
//		k = (int)s.getAttribute("k");
//		k*=k;
		
		Cookie cookie[] = req.getCookies();
		for(Cookie c : cookie)
		{
			if(c.getName().equalsIgnoreCase("k"))
			{
				k = Integer.parseInt(c.getValue());
				
			}
		}
		k*=k;
		PrintWriter pw = res.getWriter();
		pw.println("The Square is : "+k);
	}

}
