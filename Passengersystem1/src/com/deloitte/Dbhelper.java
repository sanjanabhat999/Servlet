package com.deloitte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Dbhelper {
	public ArrayList getAllPassengers(String destination) {
	ArrayList al= new ArrayList();
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott" ,"tiger");
		
		PreparedStatement pstmt= con.prepareStatement("select * from passengers where DESTINATION=?");
		
		pstmt.setString(1, destination);
		
		ResultSet rs= pstmt.executeQuery();
		
		
		//convert ResultSet into ArrayList of object
		
		while(rs.next()) {
			
			String fname=rs.getString(1);
			String lname=rs.getString(2);
			String source=rs.getString(3);
			String dest=rs.getString(4);
			String gender=rs.getString(5);
			
			Passengervo pvo= new Passengervo();
			
			pvo.setFname(fname);
			pvo.setLname(lname);
			pvo.setSource(source);
			pvo.setDestination(destination);
			pvo.setGender(gender);
			
			al.add(pvo);
			
		}
		rs.close();
		pstmt.close();
		con.close();
	}
	catch(ClassNotFoundException e) {
		System.out.println(e.getMessage());
	}
	catch(SQLException se)
	{
		System.out.println(se.getMessage());
	}
	return al;
}

}
