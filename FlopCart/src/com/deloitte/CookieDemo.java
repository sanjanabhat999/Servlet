package com.deloitte;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieDemo
 */
public class CookieDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie allCookie[]=request.getCookies();
		PrintWriter pw= response.getWriter();
		if(allCookie==null)
		{   String str1= "<body bgcolor=yellow ></body>";
		    pw.println(str1);
		
			Cookie c= new Cookie("location","Bangalore");
			c.setMaxAge(24*60*60);
			response.addCookie(c);
			pw.println("cookie stored for one day");
			pw.println("Welcome to my store for the first time");
			pw.println("For sure, you will like my store");
			pw.println("For first time users, we give 20% discount");
		}
		else
		{
			//Read all cookies
			//Iterate cookies
			String str2="<body bgcolor=pink ></body>";
			pw.println(str2);
			for(int i=0;i<allCookie.length;i++)
			{
				Cookie cc= allCookie[i];
				System.out.println(cc.getName()+"and"+cc.getValue());
				String name= cc.getName();
				String val= cc.getValue();
				if(name.equals("location")&& val.equals("Bangalore"))
				{
					pw.println("Welcome back to my store");
				}
			}
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
