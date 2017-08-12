package entidades;

import java.util.Date;

public class entPrenda {

	private int idPrenda;
	private String codigo;
	private entPrenda idTipoPrenda;
	private entMarca idMarca;
	private entGenero idGenero;
	private entSucursal idSucursal;
	private double precioCompra;
	private double precioVenta;
	private int talla;
	private String color;
	private int estado;
	public int getIdPrenda() {
		return idPrenda;
	}
	public void setIdPrenda(int idPrenda) {
		this.idPrenda = idPrenda;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public entPrenda getIdTipoPrenda() {
		return idTipoPrenda;
	}
	public void setIdTipoPrenda(entPrenda idTipoPrenda) {
		this.idTipoPrenda = idTipoPrenda;
	}
	public entMarca getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(entMarca idMarca) {
		this.idMarca = idMarca;
	}
	public entGenero getIdGenero() {
		return idGenero;
	}
	public void setIdGenero(entGenero idGenero) {
		this.idGenero = idGenero;
	}
	public entSucursal getIdSucursal() {
		return idSucursal;
	}
	public void setIdSucursal(entSucursal idSucursal) {
		this.idSucursal = idSucursal;
	}
	public double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public int getTalla() {
		return talla;
	}
	public void setTalla(int talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
	
}
