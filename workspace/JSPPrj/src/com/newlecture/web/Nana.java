package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet(name="hello", urlPatterns = {"/hi"})
@WebServlet("/hi")
public class Nana extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();
		/*
		for(int i=0; i<5; i++) {
			out.println(i+". �ȳ� servlet! <br>");
		}
		*/
		
		String cnt_ = req.getParameter("cnt");
		int cnt=100;
		if(cnt_ !=null&& !cnt_.contentEquals("")) {
			cnt = Integer.parseInt(cnt_);
		}
		
		for(int i=0; i<cnt; i++) {
			out.println(i+ ". �ȳ� Servlet<br/>");
		}
		
	}

}
