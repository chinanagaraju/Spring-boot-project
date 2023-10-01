package com.mysprings.practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
	@RequestMapping("show")
//	@ResponseBody
 public String show() {
	System.out.println("in show");
	return "Home.jsp";
}
	
	@RequestMapping("new")
	public String shows() {
		System.out.println("in show");
		return "NewFile.html";
	}
}
