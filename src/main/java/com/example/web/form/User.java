package com.example.web.form;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
 @Table(name = "user")
 
public class User {
    private String name;
    private String email;
    private String phone_no;
    private String address;
    private String sex;
    private boolean Department;
	public String getName() {
		return name;
	}
	public void setName(String name) { 
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public boolean isDepartment() {
		return Department;
	}
	public void setDepartment(boolean department) {
		Department = department;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", phone_no=" + phone_no + ", address=" + address + ", sex="
				+ sex + ", Department=" + Department + "]";
	}
   
    
    
 
}