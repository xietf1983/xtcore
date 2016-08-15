package com.xtsoft.kernel.log.model;

import java.util.Date;

import com.xtsoft.kernel.service.base.model.BaseModel;

public class LogEvent extends BaseModel<LogEvent> {
	private long id;
	private long userId;
	private String methods;
	private Date operTime;
	private String userIP;
	private String className;
	private String description;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getMethods() {
		return methods;
	}

	public void setMethods(String methods) {
		this.methods = methods;
	}

	public Date getOperTime() {
		return operTime;
	}

	public void setOperTime(Date operTime) {
		this.operTime = operTime;
	}

	public String getUserIP() {
		return userIP;
	}

	public void setUserIP(String userIP) {
		this.userIP = userIP;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		return null;
	}

}
