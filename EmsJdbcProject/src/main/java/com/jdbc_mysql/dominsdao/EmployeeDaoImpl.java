package com.jdbc_mysql.dominsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbc_mysql.dominsqueries.EmployeeQueries;
import com.jdbc_sql.domins.Employee;
import com.jdbc_sql.domins.util.ConnectionUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	private static Connection connection = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;

	@Override
	public Employee insert(Employee employee) {

		try {
			connection = ConnectionUtil.openConnection();
			ps = connection.prepareStatement(EmployeeQueries.INSERT_QUERIES);

			ps.setInt(1, employee.getE_id());
			ps.setString(2, employee.getName());
			ps.setInt(3, employee.getAge());
			ps.setDouble(4, employee.getSalary());
			int result = ps.executeUpdate();
			System.out.println("Inserted " + result + " row");

		} catch (SQLException e) {

			e.printStackTrace();
		}

		ConnectionUtil.closeConnection(connection, ps);
		return employee;
	}

	@Override
	public Employee update(Employee employee) {

		try {
			connection = ConnectionUtil.openConnection();
			ps = connection.prepareStatement(EmployeeQueries.UPDATE_QUERIES);
			ps.setString(1, "Baby");
			ps.setInt(2, 26);
			ps.setDouble(3, 34000.00);
			ps.setInt(4, 07);
			int result = ps.executeUpdate();
			System.out.println("Updated " + result + " row");

		} catch (SQLException e) {

			e.printStackTrace();
		}
		ConnectionUtil.closeConnection(connection, ps);
		return employee;
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> employees = new ArrayList<>();
		try {
			connection = ConnectionUtil.openConnection();
			ps = connection.prepareStatement(EmployeeQueries.SELECT_QUERIES);
			rs = ps.executeQuery();

			while (rs.next()) {
				Employee employee = new Employee();
				employee.setE_id(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setAge(rs.getInt(3));
				employee.setSalary(rs.getDouble(4));

				employees.add(employee);
			}
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}

		ConnectionUtil.closeConnection(connection, ps, rs);

		return employees;
	}

}
