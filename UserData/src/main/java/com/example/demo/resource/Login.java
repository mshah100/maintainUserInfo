package com.example.demo.resource;

import io.katharsis.resource.annotations.JsonApiId;
import io.katharsis.resource.annotations.JsonApiResource;

@JsonApiResource(type = "loginDetails")
public class Login {
	@JsonApiId
	private LoginIdentity loginIdentity;

	private String account;

	public Login(LoginIdentity loginIdentity, String account) {
		super();
		this.loginIdentity = loginIdentity;
		this.account = account;
	}

	public Login(String acct) {
		super();
		account = acct;
	}
	
	public LoginIdentity getLoginIdentity() {
		return loginIdentity;
	}

	public void setLoginIdentity(LoginIdentity loginIdentity) {
		this.loginIdentity = loginIdentity;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

}
