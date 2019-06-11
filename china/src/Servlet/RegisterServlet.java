package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.registerDao;
import enty.login;


public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("utf-8");
		 String name=request.getParameter("name");
		 String  pwd=request.getParameter("pwd");
		  login logins=new login(name,pwd);
		int result1= registerDao.login1(logins);
		
		
		if(result1>0){
			response.sendRedirect(request.getContextPath()+"/login.jsp");
		}
	}

}
