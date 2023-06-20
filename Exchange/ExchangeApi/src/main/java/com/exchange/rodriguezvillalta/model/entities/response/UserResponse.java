package com.exchange.rodriguezvillalta.model.entities.response;

public class UserResponse {
	
	int code = 203;
	String status = "Ok";
	String copyright = "© 2023 Exchange";
	UserResponseData data;
	
	public UserResponse() {
	    code = 203;
	    status = "Ok";
	    copyright = "© 2023 Exchange";
	    data = null;
	  }
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCopyright() {
		return copyright;
	}
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}
	public UserResponseData getData() {
		return data;
	}
	public void setData(UserResponseData data) {
		this.data = data;
	}
	
}
