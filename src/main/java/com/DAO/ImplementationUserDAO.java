package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.resource.cci.ResultSet;

import com.DataBase.User;

public class ImplementationUserDAO implements IUserDAO{

	@Override
	public User insert(User user) {
		// TODO Auto-generated method stub
		Connection connection = SingletonConnection.getConnection();
		try {
			String sql = "insert into user values(?,?,?,?)";
			PreparedStatement ps;
			ps = connection.prepareStatement(sql);
			ps.setString(1, user.getUname());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPhone());
			ps.executeUpdate();
			
			PreparedStatement ps2 = connection.prepareStatement("SELECT MAX(ID) AS MAXID FROM user");
			java.sql.ResultSet rs = ps2.executeQuery();
			if(rs.next()){
				user.setId(rs.getLong("MAX_ID"));			
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public User validate(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
