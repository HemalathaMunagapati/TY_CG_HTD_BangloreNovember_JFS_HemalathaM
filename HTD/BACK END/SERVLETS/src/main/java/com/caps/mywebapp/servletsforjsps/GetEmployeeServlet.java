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
@WebServlet("/searchEmployee3")
public class GetEmployeeServlet extends HttpServlet{
	private EmployeeService service=new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			//valid session
			//Get the form
			int empId=Integer.parseInt(req.getParameter("empId"));
			EmployeeInfoBean employeeInfoBean=service.searchEmp(empId);
			req.setAttribute("employeeInfoBean", employeeInfoBean);
			req.getRequestDispatcher("./searchEmpFormJsp.jsp").forward(req, resp);
			
			
		}else {
			//Invalid session
			req.setAttribute("msg", "please..login first");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
		}
	}//End of doGet()

}//End of class
