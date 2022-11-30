package com.DAO;

import com.DataBase.User;

public interface IUserDAO {

	public User insert(User u);
	public User validate(User u);

}
