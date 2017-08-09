package entidades;

import java.util.Date;

public class entCliente {

	private int idCliente;
	private String codigo;
	private entPersona idPersona;
	private Date fechaRegistro;
	private String categoria;
	private int numCompras;
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public entPersona getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(entPersona idPersona) {
		this.idPersona = idPersona;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getNumCompras() {
		return numCompras;
	}
	public void setNumCompras(int numCompras) {
		this.numCompras = numCompras;
	}
	
	
}
