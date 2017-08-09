package entidades;

public class entDetalleVenta {

	private entVenta idVenta;
	private entPrenda idPrenda;
	private double subtotal;
	
	public entVenta getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(entVenta idVenta) {
		this.idVenta = idVenta;
	}
	public entPrenda getIdPrenda() {
		return idPrenda;
	}
	public void setIdPrenda(entPrenda idPrenda) {
		this.idPrenda = idPrenda;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
	
	
}
