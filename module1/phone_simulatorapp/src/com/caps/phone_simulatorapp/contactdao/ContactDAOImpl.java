package com.caps.phone_simulatorapp.contactdao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.caps.phone_simulatorapp.contactbean.ContactBean;

public class ContactDAOImpl implements ContactDAO{

	FileReader reader;
	Properties prop;
	ContactBean user;
	Scanner sc=new Scanner(System.in);
	
	public ContactDAOImpl() {
		try {

			reader=new FileReader("db.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
			System.out.println("driver loaded");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<ContactBean> getAllContacts() {
		List<ContactBean> list=new ArrayList<ContactBean>();
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query"))){
			while(rs.next()) {
            ContactBean user=new ContactBean();
            user.setContactname(rs.getString(1));
            user.setPhno(rs.getInt(2));
            user.setGroup(rs.getString(3));
            list.add(user);
           
			}
			return list;
		}catch(Exception e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addContact(ContactBean contactname) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("insertQuery"));
				){
			pstmt.setString(1, user.getContactname());
			pstmt.setInt(2, user.getPhno());
			pstmt.setString(3, user.getGroup());
			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteContact(String contactname) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("deleteQuery"));
				){
		
				pstmt.setString(1, contactname);
				int count=pstmt.executeUpdate();
				if(count>0) {
					return true;
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		return false;
	}

	@Override
	public boolean editContact(String contactname) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("updateQuery"));
				){			
			
			System.out.println("Enter values to update");
			System.out.println("Enter username...");
			pstmt.setString(1, sc.nextLine());
			int count=pstmt.executeUpdate();
			System.out.println("query issued");
				if(count>0) {
					return true;
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		return false;
	}
	
	
}
