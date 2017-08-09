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
		Connection con = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//Class.forName("com.mysql.jdbc.Driver");
			//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_jonatan","root","mysql");
			
		    con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"+
									"databaseName=BD_Jonatan","sa","sql");
            	    System.out.println("Conexion a Base de Datos ...Ok");
		} catch (Exception e) {
			System.out.println("Error Conexion a la BD " + e.getMessage());
			e.printStackTrace();
			System.out.println(e);
		}
		return con;
	}
	
}
