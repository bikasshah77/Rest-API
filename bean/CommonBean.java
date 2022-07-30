package com.bean;

import org.springframework.stereotype.Component;

@Component
public class CommonBean {

	String name;
	String fname;
	String add;
	String phone;
	String gndr;

	String stName;
	String distName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGndr() {
		return gndr;
	}

	public void setGndr(String gndr) {
		this.gndr = gndr;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getDistName() {
		return distName;
	}

	public void setDistName(String distName) {
		this.distName = distName;
	}



}
