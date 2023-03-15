package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OjdbcConnection {

	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static String id = "hyCafe";
	private static String password = "1234";
	
	static { 
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Driver 연결 실패");
		}
		
	}
	

	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(url, id, password);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB연결 실패");
			return null;
		}
	}
	
}
