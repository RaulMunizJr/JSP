package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getDBConnection() throws SQLException, ClassNotFoundException {
		
		Connection con  = null;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","cosmo$76TCS1");
		
		
		return con;
		
	}
	
	public static void closeConnection(Connection con) throws SQLException {
		if(con != null) {
			con.close();
		}
	}
	
	

}
