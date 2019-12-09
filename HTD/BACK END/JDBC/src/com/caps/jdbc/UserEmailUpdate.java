package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserEmailUpdate {
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
			String query="UPDATE  users_info SET usermail=? "
					+ "WHERE userid=? and password=? ";
			pstmt=con.prepareStatement(query);
			System.out.println("Enter values to update");
			System.out.println("Enter userid");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter new email");
			pstmt.setString(1, sc.nextLine());
			System.out.println("Enter password to update");
			pstmt.setString(3, sc.nextLine());
			int count=pstmt.executeUpdate();
			System.out.println("query issued");

			if(count>0) {
				System.out.println("usermail is updated #SUCCESS:)");
			}
			else {
				System.out.println("oops..its not correct dear....!!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			sc.close();
		}
		
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
