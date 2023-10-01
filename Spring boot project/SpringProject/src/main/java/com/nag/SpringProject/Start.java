package com.nag.SpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.naga.Sevice"})
public class Start {

	public static void main(String[] args) {
		SpringApplication.run(Start.class, args);
		System.out.println("started");

	}

}
