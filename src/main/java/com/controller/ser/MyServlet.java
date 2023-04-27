package com.controller.ser;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.controller.EmployeeB;
import com.dao.controller.ControllerDao;

@WebServlet("/")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     String path= request.getServletPath();
	     switch(path)
	     {
	     case "/I":getRegPage(request,response);
	     break;
	     case "/D":deleteEmpDetails(request,response);
	     break;
	    
	     case "/U":updateEmployeeDetails(request,response);
	     break;
	    
	     case "/Reg":registerEmployee(request,response);
	     break;
	     case "/UP":getUpdateEmployeeDetails(request,response);
	     break;
	     case "/M":displayEmployeeDetails(request,response);
	     break;
	     default:loginCheck(request,response);
	     
	     }		

	}

	private void getUpdateEmployeeDetails(HttpServletRequest request, HttpServletResponse response) {
		int experience =  Integer.parseInt(request.getParameter("experience"));
		int salary =Integer.parseInt(request.getParameter("salary"));
		String email= request.getParameter("email");
		ControllerDao.updateEmpDetails(experience, salary, email);
		RequestDispatcher rd =request.getRequestDispatcher("UpdateEmployeeDetails.jsp");
	   	 try {
				rd.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		
	}
	

	private void displayEmployeeDetails(HttpServletRequest request, HttpServletResponse response) {
		ArrayList<EmployeeB> s1=ControllerDao.display();
		request.setAttribute("EmployeeList",s1);
		RequestDispatcher rd =request.getRequestDispatcher("DisplayEmp.jsp");
   	 try {
			rd.forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

	private void updateEmployeeDetails(HttpServletRequest request, HttpServletResponse response) {
	
		RequestDispatcher rd =request.getRequestDispatcher("UpdateEmployeeDetails.jsp");
   	 try {
			rd.forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
             

	}

	private void deleteEmpDetails(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html");
         String email=request.getParameter("email");
		ControllerDao.deleteEmployeedetails(email);

		try { 
			response.sendRedirect("DeleteEmp.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private void registerEmployee(HttpServletRequest request, HttpServletResponse response) {
		
		String name =request.getParameter("name");
		String email = request.getParameter("email");
		String department = request.getParameter("department");
		String designation = request.getParameter("designation");
		int experience = Integer.parseInt(request.getParameter("experience"));
		int salary = Integer.parseInt(request.getParameter("salary"));
		EmployeeB s = new EmployeeB( name, email, department, designation, experience, salary);
		ControllerDao.insertEmployeeDetails(s);
		try {
			response.sendRedirect("Controller.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void getRegPage(HttpServletRequest request, HttpServletResponse response) {
		 RequestDispatcher rd =request.getRequestDispatcher("AddEmployee.jsp");
    	 try {
			rd.forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	private void loginCheck(HttpServletRequest request, HttpServletResponse response) {
		
		 String u = request.getParameter("name");
	     String p=request.getParameter("password");
	     boolean status =ControllerDao.checkLogin(u, p);
	   
	     if(status)
	     {
	    	 RequestDispatcher rd =request.getRequestDispatcher("Controller.jsp");
	    	 try {
				rd.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	     }
	     else
	     {
	    	 RequestDispatcher rd =request.getRequestDispatcher("admin.jsp");
	    	 try {
				rd.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     }
	}




	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
