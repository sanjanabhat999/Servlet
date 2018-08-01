package com.deloitte;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Passengerservlet
 */
public class Passengerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Passengerservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw= response.getWriter();
		String destination=request.getParameter("dest");
		Dbhelper db= new Dbhelper();
		ArrayList passangersList=db.getAllPassengers(destination);
		String str1=
				"<table border=1>"
						+ "<tr>"
							+ "<th>First name</th>"
							+ "<th>last name</th>"
							+ "<th>Source</th>"
							+ "<th>destination</th>"
							+ "<th>Gender</th>"
						+ "</tr>" ;
		
		pw.println(str1);
		
		System.out.println(passangersList.size());
		
		for(int i=0;i<passangersList.size();i++) {
			Passengervo pvo=(Passengervo)passangersList.get(i);
			String str2=
					"<tr>"
						+ "<td>"+pvo.getFname()+"</td>"
						+ "<td>"+pvo.getLname()+"</td>"
						+ "<td>"+pvo.getSource()+"</td>"
						+ "<td>"+pvo.getDestination()+"</td>"
						+ "<td>"+pvo.getGender()+"</td>"
					+ "</tr>";
			System.out.println(i);
			pw.println(str2);
			}
		pw.println("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
