package com.nag.SpringProject;
import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;import javax.persistence.Id;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController

public class Controller {
	

//private Service ser;
// used to acces the manual data 
//	@RequestMapping("get")
//	 public List<Data> GET(){
//		 return ser.GetData();
//}
//	@RequestMapping("get/{name}")
//	public Data getname(@PathVariable String name) {
//		return ser.GetName(name);
//				
//	}
	
	//return list of items
//  public List<Data>All(){
//	return (List<Data>) repo.findAll();
//}
	
	@Autowired
	ServiceRepo repo;
	
	@RequestMapping("get")
	 public String getById(@RequestParam  int id) {
//		System.out.println(id);
//		ModelAndView mv=new ModelAndView();
//		Optional<Data> da=repo.findById(id);
//		mv.setViewName("getby.jsp");
//		mv.addObject("data", da);
		return  repo.findById(id).toString();
		
		   
	 }

     @RequestMapping("getall")
     @ResponseBody
     public  List<Data> All(){
 		return  (List<Data>) repo.findAll();
     }

	
     @RequestMapping("del")
     @ResponseBody
     public String Deletebyid(@RequestParam  int id) {
         repo.deleteById(id);
//        System.out.println("deleted record id " +id);
         String msg=null;
        Optional<Data> res=repo.findById(id);
    	if(res!=null) {
    		msg="Selected Record Deleted";
    	}else {
    		msg="Selected Record Not Deleted";
    	}
    	return msg;
     }
     
     @RequestMapping("dele")
     public String DeleteAll() {
       repo.deleteAll();
       String re=null;
       Iterable<Data> res=repo.findAll();
    	if(res!=null) {
    		
    		re="ALL RECORDS ARE DELETED"; 		
    		
    	}else {
    		re="RECORDS NOT DELETED";
    	}
    return re;
     }
	@RequestMapping("update")
	@ResponseBody
	public  String Update( Data  data) {
		System.out.println(data);
		int id= data.getId();
		String r=null;
		if(repo.findById(id).isPresent()) {
			repo.save(data);
			r= "the record is updated"+repo.findById(id).toString();
			
		}else {
			r="not found";
		}
		
		return r;
		 
	}
	
	
}
