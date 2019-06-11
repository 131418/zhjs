package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.loginDao;
import enty.login;

/**
 * Servlet implementation class loginServlet
 */
//@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	
   
  
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	 request.setCharacterEncoding("utf-8");
	 String name=request.getParameter("name");
	 String  pwd=request.getParameter("pwd");
	 
	 login logins=new login(name,pwd);
	int result1= loginDao.login1(logins);
	if(result1>0){
	
		response.sendRedirect(request.getContextPath()+"/success.jsp");
	}
	else{
		response.sendRedirect(request.getContextPath()+"/login.jsp");
	}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
