package entidades;

import java.sql.Date;

public class entIngreso {

	private int idIngreso;
	private entPrenda idPrenda;
	private entEmpleado idEmpleado;
	private entSucursal idSucursal;
	private Date fechaIngreso;
	private int cantidadIngreso;
	private double precioCompra;
	public int getIdIngreso() {
		return idIngreso;
	}
	public void setIdIngreso(int idIngreso) {
		this.idIngreso = idIngreso;
	}
	public entPrenda getIdPrenda() {
		return idPrenda;
	}
	public void setIdPrenda(entPrenda idPrenda) {
		this.idPrenda = idPrenda;
	}
	public entEmpleado getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(entEmpleado idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public entSucursal getIdSucursal() {
		return idSucursal;
	}
	public void setIdSucursal(entSucursal idSucursal) {
		this.idSucursal = idSucursal;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public int getCantidadIngreso() {
		return cantidadIngreso;
	}
	public void setCantidadIngreso(int cantidadIngreso) {
		this.cantidadIngreso = cantidadIngreso;
	}
	public double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	
	
	
	
}
