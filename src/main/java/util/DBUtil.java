package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	    private static final String USER = "system";
	    private static final String PASSWORD = "1234";

	    public static Connection getConnection() throws Exception {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        return DriverManager.getConnection(URL, USER, PASSWORD);
	    }

}
