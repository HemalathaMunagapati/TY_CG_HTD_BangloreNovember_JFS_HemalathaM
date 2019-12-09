package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		PreparedStatement pstmt=null;
		//load the driver
		try {
//			Driver driver=new com.mysql.jdbc.Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded....");
			
			//get DBConnection via driver
			String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6";
			System.out.println("enter username and password");
			String userName=sc.nextLine();
			String password=sc.nextLine();
			con=DriverManager.getConnection(dbUrl, userName, password);
			System.out.println("connection established");
			
			//Issue the sql queries via connection
			String query="DELETE FROM users_info WHERE userid= ? AND password=?";
			pstmt=con.prepareStatement(query);
			System.out.println("Enter userid");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter password");
			pstmt.setString(2, sc.nextLine());
			int count=pstmt.executeUpdate();
			//process the result returned by the user
			if(count>0) {
				System.out.println("user deleted");
			}
			else {
				System.out.println("try to give correct values....!!!");
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//close all jdbc objects
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
			
		}
		
   	              
		
		
		
		
		
	}

}
