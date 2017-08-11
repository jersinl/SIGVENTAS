package entidades;

import java.sql.Date;

public class entEmpleado {
	
	@Override
	public String toString() {
		return "entEmpleado [idEmpleado=" + idEmpleado + ", idPersona=" + idPersona + ", usuario=" + usuario
				+ ", password=" + password + ", estado=" + estado + ", fechaIngreso=" + fechaIngreso + ", fechaTermino="
				+ fechaTermino + ", idCargo=" + idCargo + ", idSucursal=" + idSucursal + "]";
	}
	private int idEmpleado;
	private entPersona idPersona; 
	private String usuario;
	private String password;
	private Boolean estado;
	private Date fechaIngreso;
	private Date fechaTermino;
	private entCargo idCargo;
	private entSucursal idSucursal;
	
	public Date getFechaTermino() {
		return fechaTermino;
	}
	public void setFechaTermino(Date fechaTermino) {
		this.fechaTermino = fechaTermino;
	}
	
	public entSucursal getIdSucursal() {
		return idSucursal;
	}
	public void setIdSucursal(entSucursal idSucursal) {
		this.idSucursal = idSucursal;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public entPersona getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(entPersona idPersona) {
		this.idPersona = idPersona;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public entCargo getIdCargo() {
		return idCargo;
	}
	public void setIdCargo(entCargo idCargo) {
		this.idCargo = idCargo;
	}
	
	

}
