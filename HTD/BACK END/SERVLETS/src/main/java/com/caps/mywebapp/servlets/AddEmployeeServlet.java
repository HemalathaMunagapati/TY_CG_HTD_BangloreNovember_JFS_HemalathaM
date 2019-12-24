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
@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet{
	private EmployeeService service=new EmployeeServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			//VALID SESSION
			//Get the form data
//			int empId=Integer.parseInt(req.getParameter("empId"));
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
			PrintWriter out=resp.getWriter();
			out.println("<html>");
			out.println("<body");
			if(isAdded) {
				out.println("<h3 style ='color:green'>Employee Added successfully....</h3>");
			}else {
				out.println("<h3 style='color:red'>Unable to Add employee");
			}
			out.println("</body");
			out.println("</html>");
			req.getRequestDispatcher("./addEmployee.html").include(req, resp);
			
			
		}else{
			//invalid session
			PrintWriter out=resp.getWriter();
			out.println("<html>");
			out.println("<body");
			out.println("<h2 style='color:red'>please...Login First!</h2>");
			out.println("</body");
			out.println("</html>");
			req.getRequestDispatcher("./login.html").include(req, resp);
			
		}//end of session validation
	}//End of doPost()

}//End of class
