package com.notepad;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/EditStore")
public class EditStore extends HttpServlet {
	//int id=0;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("inside editstore");
		int id=Integer.parseInt(request.getParameter("id"));
		String title=request.getParameter("title");
		String des=request.getParameter("description");
		System.out.println(title+"  :  "+des);
		Connectjdbc obj=new Connectjdbc();
		
		try {
			obj.editValue(id,title,des);
			List<NoteInfo> li=obj.getvalue();
			request.setAttribute("li", li);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
		rd.forward(request,response);
	}
	
}
