package com.example.demo.resource;

import java.io.Serializable;

public class LoginIdentity implements Serializable {

	private String userName;

	private String password;

	public LoginIdentity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginIdentity(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
