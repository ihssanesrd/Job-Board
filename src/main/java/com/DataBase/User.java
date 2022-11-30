package com.DataBase;

import java.io.Serializable;

public class User implements Serializable{
	private Long id;
	private String uname, password, email, phone;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String uname, String password) {
		super();
		this.uname = uname;
		this.password = password;
	}

	public User(String uname, String password, String email, String phone) {
		super();
		this.uname = uname;
		this.password = password;
		this.email = email;
		this.phone = phone;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
