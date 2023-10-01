package com.naga.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


import com.naga.data.Person;



public class AccountFilter implements Filter {

        public AccountFilter() {
       
    }


	public void destroy() {
		
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		String user=request.getParameter("username");
		String email=request.getParameter("email");
		String pse=request.getParameter("cpsw");
		
		System.out.println("from filter");
		PrintWriter out=response.getWriter();
		Person per=new Person();
		if(user!=null&&user.length()<=8) {
			per.setName(user);
		    }
	    if(email!=null) {
			per.setEmail(email);
		     }
	    if(pse!=null && !pse.isEmpty()&&pse.matches("[a-z]{2}[0-9]{3}")) {
			per.setPassword(pse);
			per.setCpassword(pse);
			}
		
		System.out.println(per.getName()+" "+per.getEmail()+" "+per.getPassword()+" "+per.getCpassword());
		if(per.getName()!=null&&per.getEmail()!=null&&per.getPassword()!=null&&per.getCpassword()!=null) {
			request.setAttribute("pers", per);
			chain.doFilter(request, response);
		}else {
		out.println(" <h2> check detials</h2>");
		request.getRequestDispatcher("Home.html").include(request, response);
		}
		
		
	}


	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
