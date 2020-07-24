package com.xxw.entity;

public class Admin {
	private int id;
	private String AdminName;
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdminName() {
		return AdminName;
	}

	public void setAdminName(String adminName) {
		AdminName = adminName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "admin [id=" + id + ", AdminName=" + AdminName + ", password=" + password + "]";
	}

}
