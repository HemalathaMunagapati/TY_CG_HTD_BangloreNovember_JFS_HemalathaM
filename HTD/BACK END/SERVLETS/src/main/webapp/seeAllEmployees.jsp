<%@page import="com.caps.mywebapp.beans.EmployeeInfoBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %>
    <% List<EmployeeInfoBean> employeeInfoBeans=(List<EmployeeInfoBean>)request.getAttribute("employeeInfoBean");
        String msg=(String)request.getAttribute("msg");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4> <a href="./homePageJsp">Home</a> </h4>
<fieldset>
		<legend>Add Employee</legend>
		<form action="./seeAllEmployees" method="get">
<%if(employeeInfoBeans!=null && !employeeInfoBeans.isEmpty()){ %>
     <table>
  <tr>
    <th>empId</th>
    <th>empName</th>
    <th>age</th>
    <th>salary</th>
    <th>designation</th>
  </tr>
  <%for(EmployeeInfoBean employeeInfoBean:employeeInfoBeans){ %>
   
  <tr>
    <td><%=employeeInfoBean.getEmpId() %></td>
    <td><%=employeeInfoBean.getEName() %></td>
    <td><%=employeeInfoBean.getAge() %></td>
    <td><%=employeeInfoBean.getSalary() %></td>
    <td><%=employeeInfoBean.getDesignation() %></td>
  </tr>
  <%} %>
 
  </table>
<%} %>
 <% if(msg!=null && !msg.isEmpty()){%>
   <h2 style="color: orange"><%=msg %></h2>
   <%} %>
</form>
	</fieldset>
</body>
</html>