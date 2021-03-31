package com.notepad;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Insert
 */
@WebServlet("/Insert")
public class Insert extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String title=request.getParameter("title");
		String desc=request.getParameter("description");
		HttpSession session=request.getSession();
		session.setAttribute("title", title);
		session.setAttribute("desc", desc);
		Connectjdbc obj=new Connectjdbc();
		try {
			
			obj.insertValue(title,desc);
			List<NoteInfo> li=obj.getvalue();
			request.setAttribute("li", li);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
		rd.forward(request,response);	
	}
}
