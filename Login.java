package com.notepad;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user=request.getParameter("username");
		String pwd=(String)request.getParameter("password");
		String str="";
		
		
		if(!user.equals("abhi")) 
		{
			str="Incorrect Username";
		}
		
		if(!pwd.equals("1234"))
		{
			str="Incorrect Password";
		}
		
		if(user.equals("abhi") && pwd.equals("1234"))
		{
			HttpSession session=request.getSession();
			session.setAttribute("username", user);
			Connectjdbc obj=new Connectjdbc();
			try {
				
				List<NoteInfo> li=obj.getvalue();
				request.setAttribute("li", li);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
			rd.forward(request, response);
		}
		
		else
		{
			request.setAttribute("arr", str);
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
		}	
	}
}
