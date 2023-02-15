package project2_jese8;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import dao.EmployeedDao;
import dto.Employee;

public class Class extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
////		System.out.println(s1);
//		arg1.getWriter().print(s1);
		
		String s1=arg0.getParameter("empid");//empid is in string format(convert into integer using wrapper class)
		int empid=Integer.parseInt(s1);
		String empname=arg0.getParameter("empname");
		String date=arg0.getParameter("date");
		String gender=arg0.getParameter("gender");
		String country=arg0.getParameter("country");
		
		
		Employee employee=new Employee();
		employee.setEmpid(empid);
		employee.setEmpname(empname);
		employee.setDate(date);
		employee.setGender(gender);
		employee.setCountry(country);
		
		arg1.getWriter().println(country);
		
		EmployeedDao employeedDao=new EmployeedDao();
		employeedDao.insert(employee);
	}
}