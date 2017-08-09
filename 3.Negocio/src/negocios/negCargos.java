package negocios;

import java.util.ArrayList;

import datos.daoCargo;
import datos.daoSucursales;
import entidades.entCargo;
import entidades.entSucursal;

public class negCargos {

	public static negCargos _Instancia;
	private negCargos() {};
	public static negCargos Instancia() {
		if (_Instancia == null) {
			_Instancia = new negCargos();
		}
		return _Instancia;
	}
	
	public ArrayList<entCargo> ListarCargos()throws Exception{
		try {
			ArrayList<entCargo> c = daoCargo.Instancia().ListarCargos();
			System.out.println("(Negocio)Listado de Cargos ok... ");
			return c;
		} catch (Exception e) {
			throw e; 
		}
	
	}
	
}
