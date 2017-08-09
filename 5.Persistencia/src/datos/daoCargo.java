package datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import entidades.entCargo;

public class daoCargo {

	public static daoCargo _Instancia;
	private daoCargo() {};
	public static daoCargo Instancia() {
		if (_Instancia == null) {
			_Instancia = new daoCargo();
		}
		return _Instancia;
	}
	
	
	
	public ArrayList<entCargo> ListarCargos()throws Exception{
		entCargo s = null;
		ArrayList<entCargo> listaCar = null;
		Connection cn = null;
		CallableStatement cstm = null;
		ResultSet rs = null;
	try {
		cn = Conexion.Instancia().getConnection();
		cstm = cn.prepareCall("{call spListarCargos}");
		rs = cstm.executeQuery();
		listaCar =  new ArrayList<entCargo>();
		while(rs.next()){
			
				s = new entCargo();
				s.setIdCargo(rs.getInt(1));
				s.setNombre(rs.getString(2));
				s.setSueldo(rs.getDouble(3));
				s.setIngreso(rs.getTime(4));
				s.setSalida(rs.getTime(5));
				listaCar.add(s);
		}
		System.out.println("(Persistencia)listado de Cargos exitoso... ");
		
	} catch (Exception e) {				
		System.out.println("(Persistencia)Nose puede listar los Cargos!!!!!! :(  : "+e);
		throw e;
	}finally{
		cn.close();
		cstm.close();
		rs.close();
	}
	return listaCar;
	
	}
	
}
