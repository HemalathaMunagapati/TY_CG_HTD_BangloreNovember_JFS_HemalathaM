package com.caps.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.caps.mywebapp.beans.EmployeeInfoBean;
import com.caps.mywebapp.service.EmployeeService;
import com.caps.mywebapp.service.EmployeeServiceImpl;
@WebServlet("/searchEmployee")
public class SearchEmployeeServlet extends HttpServlet{
	private EmployeeService employeeService=new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Get the form data
		String empIdVal=req.getParameter("EmpId");
		int empId=Integer.parseInt(empIdVal);
		EmployeeInfoBean employeeInfoBean=employeeService.searchEmp(empId);
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		if(employeeInfoBean!=null) {
			out.println("<h3>Employee Id:"+empId+"Found </h3>");
			out.println("Name="+employeeInfoBean.getEName());
			out.println("<br>age="+employeeInfoBean.getAge());
			out.println("<br>Salary="+employeeInfoBean.getSalary());
			out.println("<br>Designation:"+employeeInfoBean.getDesignation());
			out.println("<br>Password:"+employeeInfoBean.getPassword());
			
		}else {
			System.out.println("<h3 style='color:blue'>"+empId+"Employee Not Found...</h3>");
		}
		out.println("/<html>");
		out.println("/<body>");
		
		
	}//End of doGet()

}//End of classs
