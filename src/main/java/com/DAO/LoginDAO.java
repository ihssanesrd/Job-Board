package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.DataBase.User;

public class LoginDAO {
		private String url = "jdbc:mysql://localhost:3306/miniprojet";
		private String user = "root";
		private String passwd = "";
		private String dbDriver = "com.mysql.cj.jdbc.Driver";
		
		public void loadDriver(String dbDriver)
		{
			try {
				Class.forName(dbDriver);
				System.out.println("Driver OK");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//methode connexion renvoyant une instance de connexion
		public Connection getConnection()
		{
			Connection con = null;
			try {
				con = DriverManager.getConnection(url, user, passwd);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
		}
		
		public boolean validate(User user)
		{
			boolean status = false;
			
			loadDriver(dbDriver);
			Connection con = getConnection();
			
			String sql = "select * from user where uname =? and password =?";
			PreparedStatement ps;
			try {
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getUname());
			ps.setString(2, user.getPassword());
			ResultSet rs = ps.executeQuery();
			status = rs.next();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return status;
		}
		}

