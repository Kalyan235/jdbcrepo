package com.jdbc_mysql.dominsdao;

import java.util.List;

import com.jdbc_sql.domins.Employee;

public interface EmployeeDao {
	
	Employee insert(Employee employee);
	
	Employee update(Employee employee);
	
	List<Employee>getAll();

}
