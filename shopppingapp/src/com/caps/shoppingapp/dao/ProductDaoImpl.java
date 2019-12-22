package com.caps.shoppingapp.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.caps.shoppingapp.bean.ProductBean;

public class ProductDaoImpl implements ProductDao{
	FileReader reader;
	Properties prop;
	ProductBean user;
	Scanner sc=new Scanner(System.in);

	public ProductDaoImpl() {
		try {

			reader=new FileReader("db.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<ProductBean> getAllProductscts() {
		List<ProductBean> list=new ArrayList<ProductBean>();
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query"))){
			while(rs.next()) {
				user=new ProductBean();
				user.setProductId(rs.getInt(1));
				user.setProductName(rs.getString(2));
				user.setProductCost(rs.getDouble(3));
				user.setProuductColor(rs.getString(4));
				user.setDescription(rs.getString(5));
				user.setNumberOfProducts(rs.getInt(6));
				list.add(user);

			}
			return list;
		}catch(Exception e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ProductBean getProduct(String productName) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("loginQuery"));
				){	
			pstmt.setString(1, productName);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				user=new ProductBean();
				user.setProductId(rs.getInt(1));
				user.setProductName(rs.getString(2));
				user.setProductCost(rs.getDouble(3));
				user.setProuductColor(rs.getString(4));
				user.setDescription(rs.getString(5));
				user.setNumberOfProducts(rs.getInt(6));
			}
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
