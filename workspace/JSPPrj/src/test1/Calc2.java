package test1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class testServlet1
 */
@WebServlet("/calc2")
public class Calc2 extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		
		String fn_=request.getParameter("x");
		String sn_=request.getParameter("y");
		String op =request.getParameter("operator");
		
		int fn=0;
		int sn=0;
		
		
		if(fn_!=null&&!fn_.equals("")) {fn=Integer.parseInt(request.getParameter("x"));}
		if(sn_!=null&&!fn_.equals("")) {sn=Integer.parseInt(request.getParameter("y"));}
		
		int result=0;
		if(op.equals("µ¡¼À")) {
			result=fn+sn;
		}else {
			result=fn-sn;
		}
		
		out.println("°è»ê°á°ú´Â");
		out.println(result);
		
	}
}
