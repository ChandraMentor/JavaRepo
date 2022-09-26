package com.venky;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParameterCls
 */
@WebServlet(
		urlPatterns = { "/ParameterCls" }, 
		initParams = { 
				@WebInitParam(name = "id", value = "1000", description = "Employee id is 1000"), 
				@WebInitParam(name = "Name", value = "Anitha")
		})
public class ParameterCls extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ParameterCls() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		    ServletConfig cg=getServletConfig();
			String s1=cg.getInitParameter("id");
			String s2=cg.getInitParameter("Name");

			PrintWriter pw=response.getWriter();
			response.setContentType("text/html");
			Date d=new Date();
			String s=d.toString();
			pw.println("<b> Date is"+s +"</b>");
			pw.println("<font color=red ><br> Param1 :"+s1+"<br> Param2 is:  "+s2+"</font>");
		   	pw.close();		
	}

	}


