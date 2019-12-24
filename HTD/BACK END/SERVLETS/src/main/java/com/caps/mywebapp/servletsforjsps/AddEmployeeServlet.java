package com.caps.mywebapp.servletsforjsps;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.caps.mywebapp.beans.EmployeeInfoBean;
import com.caps.mywebapp.service.EmployeeService;
import com.caps.mywebapp.service.EmployeeServiceImpl;
@WebServlet("/addEmployee2")
public class AddEmployeeServlet extends HttpServlet{
	private EmployeeService service=new EmployeeServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			//VALID SESSION
			//Get the form data

			int empId=Integer.parseInt(req.getParameter("empId"));
			String name=req.getParameter("name");
			double salary=Double.parseDouble(req.getParameter("salary"));
			int age=Integer.parseInt(req.getParameter("age"));
		    String designation=req.getParameter("designation");
			String password=req.getParameter("password");
			
			EmployeeInfoBean employeeInfoBean=new EmployeeInfoBean();
			employeeInfoBean.setEmpId(empId);
			employeeInfoBean.setEName(name);
			employeeInfoBean.setSalary(salary);
			employeeInfoBean.setAge(age);
			employeeInfoBean.setDesignation(designation);
			employeeInfoBean.setPassword(password);
			boolean isAdded=service.addEmp(employeeInfoBean);
			if(isAdded) {
			req.setAttribute("msg", "empId "+empId+" details added successfully");
			}else {
				req.setAttribute("msg", "empId"+empId+"details not added");
			}
			req.getRequestDispatcher("./addEmployeeFormJsp").forward(req, resp);
		}else {
			//Invalid session
			req.setAttribute("msg", "please..login first");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
		}//End of doGet()
		
	}//End of class

}
