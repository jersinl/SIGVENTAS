package datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import entidades.entCargo;
import entidades.entTipoPrenda;

public class daoTipoPrenda {

	public static daoTipoPrenda _Instancia;
	private daoTipoPrenda() {};
	public static daoTipoPrenda Instancia() {
		if (_Instancia == null) {
			_Instancia = new daoTipoPrenda();
		}
		return _Instancia;
	}
	
	
	
	public ArrayList<entTipoPrenda> ListarTiposPrenda()throws Exception{
		entTipoPrenda s = null;
		ArrayList<entTipoPrenda> lista = null;
		Connection cn = null;
		CallableStatement cstm = null;
		ResultSet rs = null;
	try {
		cn = Conexion.Instancia().getConnection();
		cstm = cn.prepareCall("{call spListarTipoPrendas}");
		rs = cstm.executeQuery();
		lista =  new ArrayList<entTipoPrenda>();
		while(rs.next()){
			
				s = new entTipoPrenda();
				s.setIdTipoPrenda(rs.getInt(1));
				s.setNombre(rs.getString(2));
				s.setAbreviatura(rs.getString(3));
				lista.add(s);
		}
		System.out.println("(Persistencia)listado de Tipos de Prendas exitoso... ");
		
	} catch (Exception e) {				
		System.out.println("(Persistencia)Nose puede listar los Tipos de Prendas!!!!!! :(  : "+e);
		throw e;
	}finally{
		cn.close();
		cstm.close();
		rs.close();
	}
	return lista;
	
	}
	
	
}
