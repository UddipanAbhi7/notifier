package com.notepad;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Connectjdbc
{
	List<NoteInfo> l1=null;
	public List<NoteInfo> getvalue()throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/noteinfo","root","1234");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from notes;");
		l1=new ArrayList<NoteInfo>();
		while(rs.next())
		{
			String id=rs.getString(1);
			String title=rs.getString(2);
			String desc=rs.getString(3);
			NoteInfo obj=new NoteInfo();
			obj.setDescription(desc);
			obj.setId(id);
			obj.setTitle(title);
			l1.add(obj);
		}
		return l1;
	}
	public void insertValue(String title,String description)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/noteinfo","root","1234");
		Statement st=con.createStatement();
		String str="Insert into notes (title,descrip) values('"+title+"','"+description+"');";
		st.executeUpdate(str);
	}
	public void delValue(int id) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/noteinfo","root","1234");
		Statement st=con.createStatement();
		String str="Delete from notes where id = "+id+";";
		st.executeUpdate(str);
	}
	public void editValue(int id,String title,String description)throws Exception
	{
		System.out.println("Inside editvalue");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/noteinfo","root","1234");
		Statement st=con.createStatement();
		String str="Update notes set title ='"+title+"' , descrip ='"+description+"' where id="+id+";";
		st.executeUpdate(str);
		System.out.println("value edited");
	}
}
