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
@WebServlet("/add2")
public class add2 extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		
		String[] num_=request.getParameterValues("num");
		
		int result=0;
		
		
		for(int i=0; i<num_.length; i++) {
			int num = Integer.parseInt(num_[i]);
			result+=num;
		}
		
		
		
		out.println("계산결과는");
		out.println(result);
		
	}
}
