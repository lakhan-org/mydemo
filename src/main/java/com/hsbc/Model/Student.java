package com.hsbc.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student
{
	@Id
	@GeneratedValue
private int rollno;
private String name;
private String address;
private double mobileno;
private String email;
private String username;

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
private String password;

public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public double getMobileno() {
	return mobileno;
}
public void setMobileno(double mobileno) {
	this.mobileno = mobileno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
