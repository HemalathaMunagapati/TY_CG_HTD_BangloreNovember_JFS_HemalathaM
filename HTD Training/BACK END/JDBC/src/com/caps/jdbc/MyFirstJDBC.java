package com.caps.jdbc;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class MyFirstJDBC {

	public static void main(String[] args) {
		java.sql.Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
   
		try {
			//Load the driver
//			Driver driver=new com.mysql.jdbc.Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded.......");
			
			//Get DBConnection via driver
			String dbUrl= "jdbc:mysql://localhost:3306/ty_cg_nov6"+ "?user=root&password=root";
			con=DriverManager.getConnection(dbUrl);
			System.out.println("connection established!!!!!");
			
			//Issue sql queries via connection
			String query="SELECT * FROM users_info";
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			System.out.println("query issued....");
			System.out.println("---------------------------------------");
			//process the result returned by the sql queries
			while(rs.next()) {
				System.out.println("userid:"+ rs.getInt("userid"));
				System.out.println("username:"+rs.getString("username"));
				System.out.println("usermail:"+rs.getString("usermail"));
				System.out.println("password:"+rs.getString("password"));
				System.out.println("----------------------------------");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			 {
				try {
					if(con != null)
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					if(stmt !=null) {
						stmt.close();
					}
				}catch(SQLException e) {
					e.printStackTrace();
				}
				try {
					if(rs !=null) {
						rs  .close();
					}
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
