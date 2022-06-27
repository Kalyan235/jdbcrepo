package com.jdbc_sql.domins.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionUtil {

	private static Connection connection = null;

	private static Properties properties=null;
	
	static {

		try {
			properties=new Properties();
			properties.load(ConnectionUtil.class.getClassLoader().getResourceAsStream("com/jdbc_mysql/properties/domines.properties"));
			Class.forName(properties.getProperty("driver"));

			connection = DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"),properties.getProperty("password"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Connection openConnection() {
		return connection;
	}

	public static void closeConnection(Connection connection) {

		if (connection != null) {

			try {
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}
	}

	public static void closeConnection(Connection connection, Statement statement) {

		if (statement != null) {

			try {
				closeConnection(connection);
				statement.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

	public static void closeConnection(Connection connection, Statement statement, ResultSet rs) {

		if (rs != null) {

			try {
				closeConnection(connection, statement);

				rs.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}
//	public static void main(String[] args) {
//		System.out.println(openConnection());
//	}
	

}
