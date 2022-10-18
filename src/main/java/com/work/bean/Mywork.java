package com.work.bean;

public class Mywork {
	private int workid,ph;
	private String wname;
	private String wplace;
	private String dob;
	private String mailid;
	private String password;
	
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPh() {
		return ph;
	}
	public void setPh(int ph) {
		this.ph = ph;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getWorkid() {
		return workid;
	}
	public void setWorkid(int workid) {
		this.workid = workid;
	}
	public String getWname() {
		return wname;
	}
	public void setWname(String wname) {
		this.wname = wname;
	}
	public String getWplace() {
		return wplace;
	}
	public void setWplace(String wplace) {
		this.wplace = wplace;
	}
	@Override
	public String toString() {
		return "Mywork [workid=" + workid + ", wname=" + wname + ", wplace=" + wplace + ", dob=" + dob + "]";
	}
	

}
