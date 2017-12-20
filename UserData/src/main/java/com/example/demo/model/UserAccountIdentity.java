package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Embeddable
public class UserAccountIdentity implements Serializable {
	public UserAccountIdentity() {
		super();
	}

	public UserAccountIdentity(String userName, String acctName) {
		super();
		this.userName = userName;
		this.acctName = acctName;
	}

	@NotNull
	private String userName;

	@NotNull
	private String acctName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	
	  @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;

	        UserAccountIdentity that = (UserAccountIdentity) o;

	        if (!userName.equals(that.userName)) return false;
	        return acctName.equals(that.acctName);
	    }

	    @Override
	    public int hashCode() {
	        int result = userName.hashCode();
	        result = 31 * result + acctName.hashCode();
	        return result;
	    }
}

