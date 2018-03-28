package com.demo.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.demo.model.Employee;

public class EmployeeService {
	
	Connection con;
	PreparedStatement ps;
	
	public EmployeeService() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jun2017", "root", "password");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public int insert(Employee emp) {
		try {
			ps = con.prepareStatement("insert into emp123 (firstname, lastname, salary) values (?,?,?)");
			ps.setString(1, emp.getFirstname());
			ps.setString(2, emp.getLastname());
			ps.setDouble(3, emp.getSalary());
			ps.executeUpdate();
			System.out.println("Done!");
			return 1;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}
