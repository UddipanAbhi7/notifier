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
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		Connectjdbc obj=new Connectjdbc();
		try {
			
			obj.delValue(id);
			List<NoteInfo> li=obj.getvalue();
			request.setAttribute("li", li);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
		rd.forward(request,response);	
	}


}
