package com.epam.library.dao;

import java.sql.*;

public class ConnectionDaoImpl implements DaoInterface {

	@Override
	public ResultSet dbconnection(String query)throws SQLException {
		try { 
			Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) { 
			e.printStackTrace(); 
			} 
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_task?useSSL=false","root","mysql"); 
			Statement statement = connection.createStatement(); 
			ResultSet result = statement.executeQuery(query);
			                         //Class.forName("com.mysql.jdbc.Driver");
			                         //Connection conn = DriverManager.getConnection("jdbc:mysql://hostname:port/dbname","username", "password");
			                         //conn.close();
		return result;
	}

}

