//Program to define Employee Service interface for CRUD operation
package org.tnsif.service;

import java.sql.SQLException;
import java.util.*;

import org.tnsif.entity.Employee;

public interface IEmployeeService {
	
	int addEmployee(Employee emp) throws SQLException;
	
	int deleteEmployeeByEmpno(int empNo) throws SQLException;
	
	int updateEmployeeByEmpno(int empNo,Employee emp) throws SQLException;
	
	List<Employee> getAllEmployees() throws SQLException;
	
	
}
