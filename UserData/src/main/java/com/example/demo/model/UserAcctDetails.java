package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size; 

@Entity
@Table(name="UserAcctDetails")  
public class UserAcctDetails {
	
	@EmbeddedId
	private UserAccountIdentity userAccountIdentity;
	
	@Column
	@NotNull
    @Size(max = 15)
	private String password;
	
	public UserAcctDetails(UserAccountIdentity userAccountIdentity, String password) {
		super();
		this.userAccountIdentity = userAccountIdentity;
		this.password = password;
	}
	public UserAcctDetails() {
		super();
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserAccountIdentity getUserAccountIdentity() {
		return userAccountIdentity;
	}
	public void setUserAccountIdentity(UserAccountIdentity userAccountIdentity) {
		this.userAccountIdentity = userAccountIdentity;
	}


}
