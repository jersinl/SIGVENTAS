package entidades;

public class entArticulo {
	
	private int idArticulo;
	private String nombre;
	private int talla;
	private String color;
	private entMarca idMarca;
	
	public int getIdArticulo() {
		return idArticulo;
	}
	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTalla() {
		return talla;
	}
	public void setTalla(int talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public entMarca getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(entMarca idMarca) {
		this.idMarca = idMarca;
	}
	
	
	
	

}
