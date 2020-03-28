package test1;

import java.io.IOException;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class testServlet1
 */
@WebServlet("/calc4")
public class Calc4 extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		
		String value =request.getParameter("value");
		String operator = request.getParameter("operator");
		String dot = request.getParameter("dot");
		
		String exp="";		
		
		if(cookies!=null)
		for(Cookie c:cookies) {
			if(c.getName().equals("exp")) {
				exp=c.getValue();
				break;
			}
		}
		
		if(operator!=null&& operator.equals("=")) {
			ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
			try {
				exp = String.valueOf(engine.eval(exp));
			} catch (ScriptException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(operator!=null && operator.equals("C")) {
			exp="";
		}else {
			exp+=(value==null)?"":value;
			exp+=(operator==null)?"":operator;
			exp+=(dot==null)?"":dot;
		}
		
		
		
		
		Cookie expCookie = new Cookie("exp", exp);
		if(operator!=null && operator.equals("C")) {
			expCookie.setMaxAge(0);
		}
		//expCookie.setPath("/calc4"); //path 설정은 하나만 가능함 -> CalcPage에 쿠키 전달 불가
		response.addCookie(expCookie);
		System.out.println("asdasd");
		response.sendRedirect("calcpage");
		}
		
		
		
}
