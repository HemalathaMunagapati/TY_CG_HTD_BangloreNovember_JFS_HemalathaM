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
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {

	private EmployeeService service=new EmployeeServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Get the form data
		String empIdVal=req.getParameter("empId");
		String password=req.getParameter("password");
		int empId=Integer.parseInt(empIdVal);
		EmployeeInfoBean employeeInfoBean=service.authenticate(empId, password);
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		if(employeeInfoBean!=null) {
			//valid credentials
			HttpSession session=req.getSession(true);
			session.setAttribute("employeeInfoBean", employeeInfoBean);
			out.println("<h2 style=color:'blue'>Welcome "+employeeInfoBean.getEName()+"!</h2>");
			out.println("<br><a href='./addEmployee.html'>Add Employee</a> ");
			out.println("<br><a href='#'>Update Employee</a> ");
			out.println("<br><a href='./searchEmployee.html'>Search Employee</a> ");
			out.println("<br><a href='./deleteEmployee.html'>Delete Employee</a> ");
			out.println("<br><a href='./getAllEmployee.html'>Get all Employee</a> ");
			out.println("<br><br><a href='./logout'>Logout</a> ");

		}else {
			//Invalid credentials
			out.println("<h3 style='color:red'>Invalid Credentials</h3>");
			req.getRequestDispatcher("./login.html").include(req, resp);

		}
		out.println("</html>");
		out.println("</body>");



	}//doPost() end
}//end ofclass
