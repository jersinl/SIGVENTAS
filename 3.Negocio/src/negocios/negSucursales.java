package negocios;

import java.util.ArrayList;

import datos.daoSucursales;
import entidades.entSucursal;

public class negSucursales {
	
	public static negSucursales _Instancia;
	private negSucursales() {};
	public static negSucursales Instancia() {
		if (_Instancia == null) {
			_Instancia = new negSucursales();
		}
		return _Instancia;
	}
	
	public ArrayList<entSucursal> ListarSucursales()throws Exception{
		try {
			ArrayList<entSucursal> o = daoSucursales.Instancia().ListarSucursales();
			System.out.println("(Negocio)Listado de Sucursales ok... ");
			return o;
		} catch (Exception e) {
			throw e; 
		}
	
	}
	
}
