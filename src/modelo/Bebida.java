package modelo;

public class Bebida {
	private int id;
	private String nombre;
	private String categoria;
	private boolean alcoholico;
	
	public Bebida(){
		
	}
	public Bebida(int id, String nombre, String categoria, boolean alcoholico){
		this.id=id;
		this.nombre=nombre;
		this.categoria=categoria;
		this.alcoholico=alcoholico;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public boolean isAlcoholico() {
		return alcoholico;
	}
	public void setAlcoholico(boolean alcoholico) {
		this.alcoholico = alcoholico;
	}
}
