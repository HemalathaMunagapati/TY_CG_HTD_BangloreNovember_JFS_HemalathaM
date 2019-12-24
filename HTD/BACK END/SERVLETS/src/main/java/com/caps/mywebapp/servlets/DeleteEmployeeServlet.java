package com.caps.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.caps.mywebapp.service.EmployeeService;
import com.caps.mywebapp.service.EmployeeServiceImpl;
@WebServlet("/deleteEmployee")
public class DeleteEmployeeServlet extends HttpServlet {
	private EmployeeService service=new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session=req.getSession(false);
	if(session!=null) {
		//valid session
		int empId=Integer.parseInt(req.getParameter("empId"));
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		if(service.deleteEmp(empId)) {
			out.println("<h2 style='color:red'>Employee Record for "+empId+"Deleted </h2>");
			
		}else {
			out.println("<h2 style='color:red'>Employee ID"+empId+"Not Found..</h2>");
		}
		out.println("</body>");
		out.println("</html>");
		req.getRequestDispatcher("./deleteEmployee.html").include(req, resp);
	
	}else {
		//Invalid session
		int empId=Integer.parseInt(req.getParameter("empId"));
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2 style='color:red'>please...Login First</h2>");
		out.println("</body>");
		out.println("</html>");
		
		req.getRequestDispatcher("./login.html").include(req, resp);
		
	}
	}//End of doGet()

}//End of class
