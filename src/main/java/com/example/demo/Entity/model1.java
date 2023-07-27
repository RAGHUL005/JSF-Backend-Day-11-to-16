package com.example.demo.Entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

@jakarta.persistence.Entity
@Table(name="insur")
public class model1 {
@jakarta.persistence.Id
@GeneratedValue
	
	private String email;
	private String pass;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public model1(String email, String pass) {
		super();
		
		this.email = email;
		this.pass = pass;
	}
	public model1()
	{
		
	}
}