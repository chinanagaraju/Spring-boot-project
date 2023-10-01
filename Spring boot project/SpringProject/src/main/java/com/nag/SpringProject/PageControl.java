package com.nag.SpringProject;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class PageControl {
	@Autowired
	ServiceRepo repo;


	@RequestMapping("/")
	public String obj() {
		return "home.html";
	}

//	@RequestMapping("getby")
//	public String gets() {
//		return "GetById.jsp";
	
	@RequestMapping("addData")
	public String AddData( Data data) {
		repo.save(data);
		System.out.println(data);
	return "index.html";
	}
	
}
