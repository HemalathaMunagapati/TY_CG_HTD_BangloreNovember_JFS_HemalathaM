package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;
	
	//Load the driver
	try {
		Driver driver=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(driver);
		System.out.println("Driver Loaded......");
		
		//get the DBConnection via driver
		String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6" ;
		System.out.println("Enter username and password");
		String dbuser =sc.nextLine();
		String dbpass=sc.nextLine();
		con=DriverManager.getConnection(dbUrl,dbuser,dbpass);
		System.out.println("connection established----");
		
		//Issue the sql queries via connection
		String query="SELECT * FROM users_info"
				+ " WHERE userid=2019006 AND password='qwert17'";
		stmt=con.createStatement();
		rs=stmt.executeQuery(query);
		System.out.println("Query issued and executed");
		System.out.println("###########3#######");
		
		//Process the reult returned by the sql statemets
		if(rs.next()) {
			System.out.println("userid:"+ rs.getInt(1));
			System.out.println("username:"+rs.getString(2));
			System.out.println("usermail:"+rs.getString(3));
			System.out.println("----------------------------------");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	
	//close all JDBC objects
	finally {
		if(con!=null)
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if(stmt!=null)
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if(rs!=null)
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
}
}
