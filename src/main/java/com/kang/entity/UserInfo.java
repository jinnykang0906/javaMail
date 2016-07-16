package com.kang.entity;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class UserInfo extends Authenticator {
	
	 String userName;
	 String password;

	public UserInfo(String userName, String password) {
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
	
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(userName, password);
    }

}
