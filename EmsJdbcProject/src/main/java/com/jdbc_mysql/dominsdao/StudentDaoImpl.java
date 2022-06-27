package com.jdbc_mysql.dominsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbc_mysql.dominsqueries.StudentQueries;
import com.jdbc_sql.domins.Student;
import com.jdbc_sql.domins.util.ConnectionUtil;

public class StudentDaoImpl implements StudentDao {

	private static Connection connection = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;

	@Override
	public Student delete(Student student) {

		try {
			connection = ConnectionUtil.openConnection();
			ps = connection.prepareStatement(StudentQueries.DELETE_QUERY);
//
			ps.setInt(1, 104);
//			ps.setString(2, student.getName());
//			ps.setDouble(3, student.getFee());
//			ps.setString(4, student.getAdress());
//			ps.setString(5, student.getCity());
			int result = ps.executeUpdate();
			System.out.println(result + " Row deleted");

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
		ConnectionUtil.closeConnection(connection, ps);

		return student;
	}

}
