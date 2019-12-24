package com.caps.mywebapp.servletsforjsps;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.caps.mywebapp.beans.EmployeeInfoBean;
import com.caps.mywebapp.service.EmployeeService;
import com.caps.mywebapp.service.EmployeeServiceImpl;
@WebServlet("/seeAllEmployees")
public class SeeAllEmployeesServlet extends HttpServlet{
	private EmployeeService service=new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
		//valid session	
		List<EmployeeInfoBean> employeeInfoBean=service.getAllEmp();
			if(employeeInfoBean!=null && !employeeInfoBean.isEmpty()) {
				req.setAttribute(" employeeInfoBean",  employeeInfoBean);
				req.getRequestDispatcher("./seeAllEmployeeJsp.jsp").forward(req, resp);
				
			}else {
				req.setAttribute("msg", "No employees to display");
				req.getRequestDispatcher("./loginForm.jsp").forward(req, resp);
			}
			
		}else {
		//Invalid session
			req.setAttribute("msg", "please..login first");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
			
		}
	}//End of doGet()

}//End of class
