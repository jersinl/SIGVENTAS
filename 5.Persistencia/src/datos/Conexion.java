package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;
public class Conexion {

	public static Conexion _Instancia;
	private Conexion(){};
	public static Conexion Instancia(){
		if(_Instancia==null){
			_Instancia = new Conexion();
		}
		return _Instancia;
	}
	//endSingleton
	

	//static ResourceBundle recursos = ResourceBundle.getBundle("database");


	public Connection getConnection() throws Exception {
	
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//Cn Server Develop
			Connection cn = DriverManager.getConnection("jdbc:sqlserver://sigventas.database.windows.net;databaseName=SIGVENTAS","dba","Casa123%");
            	    System.out.println("Conexion a Base de Datos ...Ok");
            	    return cn;
		} catch (Exception e) {
			System.out.println("Error Conexion a la BD " + e.getMessage());
			e.printStackTrace();
			
			System.out.println(e);
			throw e;
		}
	
	}
	
}
