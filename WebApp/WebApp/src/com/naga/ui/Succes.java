package com.naga.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.naga.data.Person;


public class Succes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Succes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter outr=response.getWriter();
		HttpSession session=request.getSession(false);
		String user1=request.getParameter("username");
		String email1=request.getParameter("email");
		String psw=request.getParameter("psw");
		boolean user = false;
		boolean email=false;
		boolean pws=false;
//		outr.println("from sucess");
		Person per = null;
		
		if(session!=null) {
			System.out.println("in session");
			per=(Person)session.getAttribute("person");
		
			if(per!=null) {
			if(per.getName().equalsIgnoreCase(user1)) {
				user=true;
			    }
			if(per.getEmail().equals(email1)) {
					email=true;
			    }
	     	if(per.getPassword().equals(psw)) {
						pws=true;
				}
	     	
		       }
			}else {
				System.out.println("out session");
	            outr.println("first create an acoount then try again");
			  }
		
		if(user!=false && email!=false && pws!=false) {
		outr.println("<h2> welcome to the webapp"+" "+ per.getName() + " </h2>");
		}
			else {
				outr.println("something is wrong enter  details again");
				request.getRequestDispatcher("Home.html").include(request, response);
			}
		}
		
					
	}



