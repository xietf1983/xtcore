package com.xtsoft.kernel.log.model;

import java.util.Date;

import com.xtsoft.kernel.service.base.model.BaseModel;

public class LogEvent extends BaseModel<LogEvent> {
	private long id;
	private long userId;
	private String userAccount;
	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	private String methods;
	private Date operTime;
	private String userIP;
	private String className;
	private String arguments;
	private int sucess;
	private String excetption;
	private String description;
	private long exeTime;

	public long getExeTime() {
		return exeTime;
	}

	public void setExeTime(long exeTime) {
		this.exeTime = exeTime;
	}

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

	public String getArguments() {
		return arguments;
	}

	public void setArguments(String arguments) {
		this.arguments = arguments;
	}

	public int getSucess() {
		return sucess;
	}

	public void setSucess(int sucess) {
		this.sucess = sucess;
	}

	public String getExcetption() {
		return excetption;
	}

	public void setExcetption(String excetption) {
		this.excetption = excetption;
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
