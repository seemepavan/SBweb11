package com.dxc.model;

import org.springframework.stereotype.Component;

@Component
public class Users {
      private int userid;
      private String username;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
      
}
