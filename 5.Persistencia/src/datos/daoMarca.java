package datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import entidades.entMarca;
import entidades.entModelo;
import entidades.entTipoPrenda;

public class daoMarca {

	public static daoMarca _Instancia;
	private daoMarca() {};
	public static daoMarca Instancia() {
		if (_Instancia == null) {
			_Instancia = new daoMarca();
		}
		return _Instancia;
	}
	
	
	
	public ArrayList<entMarca> ListarMarcas()throws Exception{
		entMarca s = null;
		ArrayList<entMarca> lista = null;
		Connection cn = null;
		CallableStatement cstm = null;
		ResultSet rs = null;
	try {
		cn = Conexion.Instancia().getConnection();
		cstm = cn.prepareCall("{call spListarMarcas}");
		rs = cstm.executeQuery();
		lista =  new ArrayList<entMarca>();
		while(rs.next()){
			
				s = new entMarca();
				s.setIdMarca(rs.getInt(1));
				s.setNombre(rs.getString(2));
				lista.add(s);
		}
		System.out.println("(Persistencia)listado de Marcas exitoso... ");
		
	} catch (Exception e) {				
		System.out.println("(Persistencia)Nose puede listar las Marcas!!!!!! :(  : "+e);
		throw e;
	}finally{
		cn.close();
		cstm.close();
		rs.close();
	}
	return lista;
	
	}
	
}
