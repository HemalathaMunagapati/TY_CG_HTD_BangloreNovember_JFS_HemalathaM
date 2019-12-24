package com.caps.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Get the Query String
		String idVal=req.getParameter("id");

		//Get the context param
//		ServletContext context=getServletContext();
		ServletContext context=req.getServletContext();
		String contextParamVal=context.getInitParameter("myContextParam");
		
		ServletConfig config=getServletConfig();
		String configParamVal=config.getInitParameter("myConfigParam");
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Employee Id="+idVal);
		out.println("<br>Name=Hema");
		out.println("<br>Salary=30000");
		out.println("<br><br>Context Param Val:"+contextParamVal);
		out.println("<br><br>Config Param Val:"+configParamVal);
		out.println("</body>");
		out.println("</html>");





	}//End of doGet()
}//End of class
