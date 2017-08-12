package entidades;

public class entDetalleIngreso {

	
	private int idDetalleIngreso;
	private entIngreso idIngreso;
	private entPrenda idPrenda;
	private double precioCompraParcial;
	private int cantidad;
	public int getIdDetalleIngreso() {
		return idDetalleIngreso;
	}
	public void setIdDetalleIngreso(int idDetalleIngreso) {
		this.idDetalleIngreso = idDetalleIngreso;
	}
	public entIngreso getIdIngreso() {
		return idIngreso;
	}
	public void setIdIngreso(entIngreso idIngreso) {
		this.idIngreso = idIngreso;
	}
	public entPrenda getIdPrenda() {
		return idPrenda;
	}
	public void setIdPrenda(entPrenda idPrenda) {
		this.idPrenda = idPrenda;
	}
	public double getPrecioCompraParcial() {
		return precioCompraParcial;
	}
	public void setPrecioCompraParcial(double precioCompraParcial) {
		this.precioCompraParcial = precioCompraParcial;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	
	
}
