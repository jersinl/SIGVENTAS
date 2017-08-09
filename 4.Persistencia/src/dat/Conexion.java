package dat;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	
	public static Connection getConnection() throws Exception {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//Cn Server Develop
			Connection cn = DriverManager.getConnection("jdbc:sqlserver://sigventas.database.windows.net;databaseName=SIGVENTAS","dba","Casa123%");
			return cn;
		} catch (Exception e) {
			throw e;
		}
	}

}
