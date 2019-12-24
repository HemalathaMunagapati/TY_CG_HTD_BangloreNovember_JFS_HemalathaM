package com.caps.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.caps.mywebapp.beans.EmployeeInfoBean;
import com.caps.mywebapp.service.EmployeeService;
import com.caps.mywebapp.service.EmployeeServiceImpl;
@WebServlet("/searchEmployee2")
public class SearchEmployeeServlet2 extends HttpServlet{
	private EmployeeService service=new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session=req.getSession(false);
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	out.println("<html>");
	out.println("<body>");
	if(session!=null) {
		//valid session
		String empIdVal=req.getParameter("empId");
		int empId=Integer.parseInt(empIdVal);
		
		EmployeeInfoBean employeeInfoBean=service.searchEmp(empId);
		if(employeeInfoBean!=null) {
			out.println("<h3 style 'color:green'>Employee Id:"+empId+"Found </h3>");
			out.println("Name="+employeeInfoBean.getEName());
			out.println("<br>age="+employeeInfoBean.getAge());
			out.println("<br>Salary="+employeeInfoBean.getSalary());
			out.println("<br>Designation:"+employeeInfoBean.getDesignation());
			out.println("<br>Password:"+employeeInfoBean.getPassword());
			
		}else {
			out.println("<h3 style='color:blue'>"+empId+"Employee Not Found...</h3>");
		}
		
		
	}else {
		//Invalid session
		out.println("<h2>please...Login First</h2>");
		req.getRequestDispatcher("./login.html").include(req, resp);
		
	}
	out.println("</html>");
	out.println("</body>");
	}//End of doGet()

}//End of class
