package com.mysprings.practice;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component

public class Alien {

private String name;
private int age;
private String email;
@Autowired
private Auto Auto;


public Alien() {
	// TODO Auto-generated constructor stub
	super();
	System.out.println("obj created");
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public void show() {
	System.out.println("in show ");
	Auto.prin();
}

}
