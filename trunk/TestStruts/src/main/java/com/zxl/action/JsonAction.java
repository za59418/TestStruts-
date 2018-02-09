package com.zxl.action;

import com.opensymphony.xwork2.ActionSupport;

public class JsonAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Name;
	private int Age;
	
	
	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	public String getJson() {
		Name="zxl";
		Age = 20;
		return SUCCESS;
	}
}
