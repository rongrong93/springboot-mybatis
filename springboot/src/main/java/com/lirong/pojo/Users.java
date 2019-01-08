package com.lirong.pojo;

public class Users {
	private static final long serialVersionUID = 1L;
	private String user_id;
	private int home_city;
	private String user_name;
	private long msisdn;
	private String address;
	private int age;
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getHome_city() {
		return home_city;
	}
	public void setHome_city(int home_city) {
		this.home_city = home_city;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public long getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(long msisdn) {
		this.msisdn = msisdn;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", home_city=" + home_city + ", user_name=" + user_name + ", msisdn="
				+ msisdn + ", address=" + address + ", age=" + age + ", password=" + password + "]";
	}
	
}
