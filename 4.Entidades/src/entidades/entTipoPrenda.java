package entidades;

public class entTipoPrenda {

	private int idTipoPrenda;
	private String nombre;
	private String abreviatura;
	public int getIdTipoPrenda() {
		return idTipoPrenda;
	}
	public void setIdTipoPrenda(int idTipoPrenda) {
		this.idTipoPrenda = idTipoPrenda;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAbreviatura() {
		return abreviatura;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	
	@Override
	public String toString() {
		return  nombre;
	}
	
	
	
	
}
