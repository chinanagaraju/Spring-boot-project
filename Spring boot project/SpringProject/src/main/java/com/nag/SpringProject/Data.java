package com.nag.SpringProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import org.springframework.stereotype.Component;

@Component
@Entity
public class Data {
	@Id
	@Column
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	 private int id;
	@Column
	private String Name;
	
	
	
	@Column
	private String city;
	
	@Column
	private int age;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	
	
	public Data() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Data(int id,String name, String city, int age ) {
		super();
		  this.id=id;
		this.Name = name;
		this.city = city;
		this.age = age;
	  
	}


	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Data [name=" + Name + ", id=" + id + ", city=" + city + ", age=" + age + "]";
	}


	
	
	

}
