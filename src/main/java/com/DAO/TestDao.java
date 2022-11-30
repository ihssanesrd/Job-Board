package com.DAO;

import com.DataBase.User;

public class TestDao {
	ImplementationUserDAO imp = new ImplementationUserDAO();
	User u = imp.insert(new User("imane","147","imane@joke.com","06155"));
	User u2 = imp.insert(new User("iman2e","147","imane@joke.com","06155"));

}
