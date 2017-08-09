package entidades;

import java.util.Date;

public class entVenta {
	
	private int idVenta;
	private Date fecha;
	private int numBoleta;
	private entSucursal idSucursal;
	private entEmpleado idEmpleado;
	private entCliente idCliente;
	private double precioTotal;
	private entTipoPago idTipoPago;
	
	public int getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getNumBoleta() {
		return numBoleta;
	}
	public void setNumBoleta(int numBoleta) {
		this.numBoleta = numBoleta;
	}
	public entSucursal getIdSucursal() {
		return idSucursal;
	}
	public void setIdSucursal(entSucursal idSucursal) {
		this.idSucursal = idSucursal;
	}
	public entEmpleado getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(entEmpleado idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public entCliente getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(entCliente idCliente) {
		this.idCliente = idCliente;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	public entTipoPago getIdTipoPago() {
		return idTipoPago;
	}
	public void setIdTipoPago(entTipoPago idTipoPago) {
		this.idTipoPago = idTipoPago;
	}
	
	
	
	

}
