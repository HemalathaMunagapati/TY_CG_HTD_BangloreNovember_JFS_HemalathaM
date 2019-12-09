package com.capgemini.jdbc.controller;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin1_dyanmic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		PreparedStatement pstmt=null;
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
					+ " WHERE userid=? AND password=?";
			pstmt=con.prepareStatement(query);
			System.out.println("Enter userId .....");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter password");
			pstmt.setString(2, sc.nextLine());
			rs=pstmt.executeQuery();
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
			if(pstmt!=null)
				try {
					pstmt.close();
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
