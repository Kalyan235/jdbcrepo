package com.jdbc_mysql.dominstest;

import java.util.List;

import com.jdbc_mysql.dominsdao.EmployeeDaoImpl;
import com.jdbc_sql.domins.Employee;

public class EmployeeDaoTest {

	public static void main(String[] args) {

		Employee employee = new Employee(07, "KalyanAj", 26, 98000.00);//(Only for Insert operations.)
//		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();    (Only for Insert operations.)
//		employeeDaoImpl.insert(employee);         ( Only for Insert operations.)

//		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl(); (only for getAll data)
//		List<Employee> employees = employeeDaoImpl.getAll();   (only for getAll data)
//
//		for (Employee employee : employees) {                   (only for getAll data)
//
//			System.out.println(employee.getE_id()+" "+employee.getName()+" "+employee.getAge()+" "+employee.getSalary());
//		}

		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		employeeDaoImpl.update(employee);
	}

}
