package com.deloitte;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculatebonus
 */
@WebServlet("/Calculatebonus")
public class Calculatebonus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculatebonus() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw= response.getWriter();
		String name= request.getParameter("name1");
		double salary= Double.parseDouble(request.getParameter("basic"));
		double bonus = 0;
		String grade= request.getParameter("grade");
		if(salary>100000 && grade.equals("A"))
			 bonus = 0.05*salary;
		else if(salary>50000 && salary<100000 && grade.equals("B"))
			bonus= 0.07*salary;
		else if(salary<50000 && grade.equals("C"))
			bonus=0.2*salary;
		
		double tax=salary*0.25;
		double net= salary+bonus-tax;
		pw.println("<br>Employee Name:"+name);
		pw.println("<br>Basic salary:"+salary);
		pw.println("<br>Bonus:"+bonus);
		pw.println("<br>Tax:"+tax);
		pw.println("<br>Net Salary"+net);
		
				
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
