package com.jdbc_mysql.dominstest;

import com.jdbc_mysql.dominsdao.StudentDaoImpl;
import com.jdbc_sql.domins.Student;

public class StudentDaoTest {

	public static void main(String[] args) {
		Student student = new Student();
		StudentDaoImpl daoImpl = new StudentDaoImpl();
		daoImpl.delete(student);
	}

}
