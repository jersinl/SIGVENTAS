package datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import entidades.entCargo;
import entidades.entEmpleado;
import entidades.entPersona;
import entidades.entSucursal;

public class daoSucursales {
	
	public static daoSucursales _Instancia;
	private daoSucursales() {};
	public static daoSucursales Instancia() {
		if (_Instancia == null) {
			_Instancia = new daoSucursales();
		}
		return _Instancia;
	}
	
	
	
	public ArrayList<entSucursal> ListarSucursales()throws Exception{
		entSucursal s = null;
		ArrayList<entSucursal> listaSuc = null;
		Connection cn = null;
		CallableStatement cstm = null;
		ResultSet rs = null;
	try {
		cn = Conexion.Instancia().getConnection();
		cstm = cn.prepareCall("{call spListarSucursales}");
		rs = cstm.executeQuery();
		listaSuc =  new ArrayList<entSucursal>();
		while(rs.next()){
			
				s = new entSucursal();
				s.setIdSucursal(rs.getInt(1));
				s.setNombre(rs.getString(2));
				s.setDireccion(rs.getString(3));
				listaSuc.add(s);
		}
		System.out.println("(Persistencia)listado exitoso... ");
		
	} catch (Exception e) {				
		System.out.println("(Persistencia)Nose puede listar!!!!!! :(  : "+e);
		throw e;
	}finally{
		cn.close();
		cstm.close();
		rs.close();
	}
	return listaSuc;
	
	}
}
