package com.jdbc_mysql.dominsqueries;

public interface EmployeeQueries {

	String INSERT_QUERIES = "insert into employee values(?,?,?,?)";

	String SELECT_QUERIES = "select * from employee";

	String UPDATE_QUERIES = "update employee set name=?,age=?,salary=? where e_id=?";
}
