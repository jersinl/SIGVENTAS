package entidades;

import java.sql.Date;

public class entPersona {

	@Override
	public String toString() {
		return "entPersona [idPersona=" + idPersona + ", dni=" + dni + ", nombres=" + nombres + ", apellidos="
				+ apellidos + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono
				+ ", correo=" + correo + "]";
	}
	private int idPersona;
	private String dni;
	private String nombres;
	private String apellidos;
	private entGenero sexo;
	private Date fechaNacimiento;
	private int telefono;
	private String correo;
	
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public entGenero getSexo() {
		return sexo;
	}
	public void setSexo(entGenero sexo) {
		this.sexo = sexo;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	
	
}
