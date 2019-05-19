package database;

import java.sql.*;


public class MyDb {

	private Connection con;
	public Connection connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://" + MyDbInfo.MYSQL_DATABASE_SERVER + "?autoReconnect=true&useSSL=false&",
														 MyDbInfo.MYSQL_USERNAME, MyDbInfo.MYSQL_PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
}
