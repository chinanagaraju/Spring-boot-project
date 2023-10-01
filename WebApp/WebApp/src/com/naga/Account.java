package com.naga;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.naga.data.Person;


public class Account extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Account() {
        super();
 
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		System.out.println("form account");
		
		Person pers=(Person)request.getAttribute("pers");
//		out.println("<h2>  your account is created  login now" +"</h2> ");
		session.setAttribute("person", pers);
		request.getRequestDispatcher("message.html").include(request, response);
		
		
		
//		out.println("<h2>  your account is created  login now" +pers.getName()+" "
//		+pers.getEmail()+""+pers.getCpassword()+session.getCreationTime()+
//		" "+session.getId()+"</h2>");
//		session.invalidate();
//		System.out.println("from servlet");
//		request.getRequestDispatcher("Succes").include(request, response);
//      
//        request.getRequestDispatcher("Home.html").include(request, response);
//    	   PrintWriter out=response.getWriter();
//    	   out.println("password doesnot matched");
//       }
       
	}
		
	

}
