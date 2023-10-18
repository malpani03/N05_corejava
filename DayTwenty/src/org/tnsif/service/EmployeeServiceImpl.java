package org.tnsif.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

import org.tnsif.dao.DButil;
import org.tnsif.entity.Employee;

import com.mysql.jdbc.ResultSet;

public class EmployeeServiceImpl implements IEmployeeService{
	PreparedStatement pst;
	Connection cn;
	
	public EmployeeServiceImpl()
	{
		cn=DButil.getCn();
	}

	@Override
	public int addEmployee(Employee emp) throws SQLException{
		pst=cn.prepareStatement("INSERT INTO employee values(?,?,?)");
		pst.setInt(1, emp.getEmpNo());
		pst.setString(2,emp.getEmpName());
		pst.setFloat(3, emp.getSalary());
		return pst.executeUpdate();
	}

	@Override
	public int deleteEmployeeByEmpno(int empNo) throws SQLException {
		pst=cn.prepareStatement("DELETE FROM employee WHERE Empno=?");
		pst.setInt(1,empNo);
		return pst.executeUpdate();
	}

	@Override
	public int updateEmployeeByEmpno(int empNo, Employee emp) throws SQLException {
		pst=cn.prepareStatement("UPDATE employee SET empName=?,salary=? WHERE empno=?");
		pst.setString(1,emp.getEmpName());
		pst.setFloat(2, emp.getSalary());
		pst.setInt(3, emp.getEmpNo());	
		return pst.executeUpdate();
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		ArrayList<Employee> empList=new ArrayList<Employee>();
		pst=cn.prepareStatement("SELECT * FROM employee");
		String empName;
		int empNo;
		float salary;
		Employee emp;
		ResultSet rs=(ResultSet) pst.executeQuery();
		while(rs.next())
		{
			empNo=rs.getInt(1);
			empName=rs.getString(2);
			salary=rs.getFloat(3);
			emp=new Employee(empNo,empName,salary);
			empList.add(emp);
		}
		rs.close();
		return empList;
	}

}
