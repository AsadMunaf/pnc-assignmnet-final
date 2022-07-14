package com.pnc.assignment.response;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserInfo {

	@NotEmpty(message = "username should not be null or empty")
	private String username;

	@NotEmpty(message = "password should not be null or empty")
	@Size(min = 9, message = "Password need to be greater than 8 characters")
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$", message = "Password need to containing at least 1 number, 1 Capitalized letter, 1 special character in this set “_ # $ % .")
	private String password;

	@NotEmpty(message = "ipAdd should not be null or empty")
	private String ipAdd;

	public UserInfo() {
		super();
	}

	public UserInfo(String username, String password, String ipAddress) {
		super();
		this.username = username;
		this.password = password;
		this.ipAdd = ipAddress;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIpAdd() {
		return ipAdd;
	}

	public void setIpAdd(String ipAdd) {
		this.ipAdd = ipAdd;
	}

}
