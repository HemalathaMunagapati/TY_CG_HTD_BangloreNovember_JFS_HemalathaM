package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EvolvedJDBC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6";
		System.out.println("enter username and password");
		String userName=sc.nextLine();
		String password=sc.nextLine();
		String query="SELECT * FROM users_info";
		try(Connection con=DriverManager.getConnection(dbUrl,userName,password);
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(query)){
			while(rs.next()) {
				System.out.println("Userid:"+rs.getInt(1));
				System.out.println("Username:"+rs.getString(2));
				System.out.println("Usermail:"+rs.getString(3));
				System.out.println("-----------------------");
			}
		sc.close();	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
