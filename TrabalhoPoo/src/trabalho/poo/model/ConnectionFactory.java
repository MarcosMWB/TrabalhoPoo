package trabalho.poo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static String DRIVER = "";
	private static String URL 	 = "";
	private static String USER	 = "";
	private static String PASSWD = "";
	
	public static Connection getConnection() throws SQLException{
		
		try {
			Class.forName(DRIVER);
			return DriverManager.getConnection(URL, USER, PASSWD);
		}catch (ClassNotFoundException e) {
			throw new SQLException(e.getMessage());
		}
		
	}

}
