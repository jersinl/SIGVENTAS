package entidades;

import java.sql.Time;

public class entCargo {
	
	private int idCargo;
	private String nombre;
	private double sueldo;
	private Time ingreso;
	private Time salida;
	
	public int getIdCargo() {
		return idCargo;
	}
	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public Time getIngreso() {
		return ingreso;
	}
	public void setIngreso(Time ingreso) {
		this.ingreso = ingreso;
	}
	public Time getSalida() {
		return salida;
	}
	public void setSalida(Time salida) {
		this.salida = salida;
	}
	
	

	
}
