package com.nagarro.avirup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {


	//	@Column(name="SlNo")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SlNo", updatable = false, nullable = false)
	private long serial;
	private String userId;
	private String password;
	
	public long getSerial() {
		return serial;
	}
	public void setSerial(long serial) {
		this.serial = serial;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userid) {
		this.userId = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [serial=" + serial + ", userId=" + userId + ", password=" + password + "]";
	}
	
}
