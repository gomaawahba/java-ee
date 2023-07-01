package com.mohmmed.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.faces.annotation.RequestMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mohmmed.validation.checklength;
import com.mohmmed.validation.checkvaliduser;
//javaee----java enterprise edition
//mvc ---such as application-spring-mvc---------else ..first-mvc-app
//@WeBServlet(urlpatterns="/login........such as key")
@WebServlet(urlPatterns = "/login")
public class loginservlet extends HttpServlet {
	checkvaliduser chek=new checkvaliduser();
	checklength checlen=new checklength();
	
	@Override
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getParameter("name"));
		req.setAttribute("name",req.getParameter("name"));
		req.setAttribute("password",req.getParameter("password"));
		req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);

		
		
	}
	@Override
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		if(chek.isvalid(name, password)) {
			req.setAttribute("name",req.getParameter("name"));
		req.setAttribute("password",req.getParameter("password"));
		req.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(req, resp);
		System.out.println("ok");
		}else if(checlen.checklengthmethod(name, password)) {
		req.setAttribute("name",req.getParameter("name"));
		req.setAttribute("password",req.getParameter("password"));
		req.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(req, resp);
		System.out.println("ok");
		}else
			
	      	System.out.println(req.getParameter("name"));
	     	System.out.println(req.getParameter("password"));
	     	req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
	     	System.out.println("ok");
		
		
	}

}
/*
 * 		PrintWriter out=resp.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>ahmed wahba</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>This the Heading</h1>");
		out.println("<p> this is goal mohmed salah</p>");
		out.println("<p> this is goal mohmed salah</p>");
		out.println("</body>");
		out.println("</html>");
 * */
