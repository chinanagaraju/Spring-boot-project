package com.naga.data;

public class Person {
	
	private String name;
	private String email;
	private String  password;
	private String cpassword;
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", password=" + password + ", cpassword=" + cpassword
				+ "]";
	}


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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getCpassword() {
		return cpassword;
	}


	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}


	public Person() {
		// TODO Auto-generated constructor stub
	}

}
