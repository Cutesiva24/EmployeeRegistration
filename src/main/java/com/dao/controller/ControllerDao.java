package com.dao.controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.bean.controller.EmployeeB;

public class ControllerDao 
{
	static String url ="jdbc:mysql://localhost:3306/java";
	static String user="root";
	static String pass ="admin";
	static Connection con =null;
	static PreparedStatement ps = null;
	static Statement s= null;
	static ResultSet rs =null;
	
	static String insert ="insert into employeee(name,email,department,designation,experience,salary) values(?,?,?,?,?,?)";
	static String delete ="delete from employeee where email=?";
	static String update ="update employeee set experience=?,salary=? where email=?";
	
	
	
	public static boolean checkLogin(String name,String password)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
			s= con.createStatement();
		    rs = s.executeQuery("select * from admin1");
		    while(rs.next())
		    {
		    	String u= rs.getString("name");
		    	String p = rs.getString("password");
		    	if(name.equals(u) && password.equals(p))
		    	{
		    		return true;
		    	}
		    }
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				rs.close();
				s.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
       
	
	  public static void insertEmployeeDetails(EmployeeB s)
	  {
		  try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
			ps=con.prepareStatement(insert);
			ps.setString(1,s.getName());
			ps.setString(2,s.getEmail());
			ps.setString(3, s.getDepartment());
			ps.setString(4, s.getDesignation());
			ps.setInt(5,s.getExperience());
			ps.setInt(6, s.getSalary());
		    ps.executeUpdate();
			
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		  finally
		  {
			  try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
	  } 
		public static void deleteEmployeedetails(String email)
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(url, user, pass);
				ps=con.prepareStatement(delete);
				ps.setString(1, email);
				ps.executeUpdate();
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally
			{
				try {
					ps.close();
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
		  public static void updateEmpDetails(int experience , int salary , String email)
		  {
			  try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(url, user, pass);
				ps=con.prepareStatement(update);
				ps.setInt(1, experience);
				ps.setInt(2, salary);
				ps.setString(3, email);
				ps.executeUpdate();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  finally
			  {
				  try {
						ps.close();
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			  }
			  		  
		  }
		  public static ArrayList<EmployeeB> display()
		  {
			  ArrayList<EmployeeB> al= new ArrayList<EmployeeB>();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection(url, user, pass);
					s = con.createStatement();
					rs=s.executeQuery("select * from employeee");
					while(rs.next())
					{
						int id = rs.getInt("id");
						String name =rs.getString("name");
						String email=rs.getString("email");
						String department = rs.getString("department");
						String designation = rs.getString("designation");
						int experience =rs.getInt("experience");
						int salary = rs.getInt("salary");
						EmployeeB s = new EmployeeB(id, name, email, department, designation, experience, salary);
						al.add(s);
					}

				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally
				{
					try {
						rs.close();
						s.close();
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				return al;

		  }

	  }
	

