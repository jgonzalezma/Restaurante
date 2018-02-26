package modelo;

import java.util.ArrayList;

public class Comida {
	private int id;
	private String nombre;
	private String categoria;
	
	public Comida(){
	}
	public Comida(int id, String nombre, String categoria){
		this.id=id;
		this.nombre=nombre;
		this.categoria=categoria;
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
}
