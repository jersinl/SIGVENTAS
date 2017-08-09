package entidades;

import java.util.Date;

public class entPrenda {

	private int idPrenda;
	private String codigo;
	private entArticulo idArticulo;
	private Date fechaIngreso;
	private Date fechaVenta;
	private double precioCompra;
	private double precioVenta;
	private entSucursal idSucursal;
	private boolean estado;
	
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
	public entArticulo getIdArticulo() {
		return idArticulo;
	}
	public void setIdArticulo(entArticulo idArticulo) {
		this.idArticulo = idArticulo;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public Date getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
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
	public entSucursal getIdSucursal() {
		return idSucursal;
	}
	public void setIdSucursal(entSucursal idSucursal) {
		this.idSucursal = idSucursal;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
}
