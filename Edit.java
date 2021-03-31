package com.notepad;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Edit
 */
@WebServlet("/Edit")
public class Edit extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("inside edit.java");
		String old_title="",old_des="";
		String title=request.getParameter("title");
		String des=request.getParameter("description");
		Connectjdbc obj=new Connectjdbc();
		EditStore obj1=new EditStore();
		
		try {
			old_title=obj1.getTitle();
			old_des=obj1.getDes();
			obj.editValue(title,des,old_title,old_des);
			List<String> li=obj.getvalue();
			request.setAttribute("li", li);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
		rd.forward(request,response);
	}

}
