package com.caps.mywebapp.servletsforjsps;

import java.io.IOException;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.caps.mywebapp.beans.EmployeeInfoBean;
import com.caps.mywebapp.service.EmployeeService;
import com.caps.mywebapp.service.EmployeeServiceImpl;
@WebServlet("/login2")
public class LoginServlet extends HttpServlet{
	private EmployeeService service=new EmployeeServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Get the form data
		int empId=Integer.parseInt(req.getParameter("empId"));
		String password=req.getParameter("password");
		EmployeeInfoBean employeeInfoBean=service.authenticate(empId, password);
		if(employeeInfoBean!=null) {
			//valid credentials
			HttpSession session=req.getSession(true);
			session.setAttribute("employeeInfoBean", employeeInfoBean);
			session.setMaxInactiveInterval(60);
			req.getRequestDispatcher("./homePageJsp.jsp").forward(req, resp);

		}else {
			//invalid credentials
			req.setAttribute("msg", "Invalid Credentials!");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
		}
	}//End of doPost()

}//End of class
