package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class ComidaModelo extends Conector {
	public ArrayList<Comida> selectAll(){
		ArrayList<Comida> comidas = new ArrayList<Comida>();
		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM comida");
			while(rs.next()){
				Comida c = new Comida();
				c.setId(rs.getInt("id"));
				c.setNombre(rs.getString("nombre"));
				c.setCategoria(rs.getString("categoria"));
				comidas.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return comidas;
	}
	public Comida selectPorId(int id){
		Comida c = new Comida();
		try {
			PreparedStatement pst = super.conexion.prepareStatement("SELECT * FROM comida WHERE id=?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				c.setId(rs.getInt("id"));
				c.setNombre(rs.getString("nombre"));
				c.setCategoria(rs.getString("categoria"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
		
	}

	public void mostrarComidas(ArrayList<Comida> comidas) {
		Iterator<Comida> i = comidas.iterator();
		while(i.hasNext()){
			Comida comida = i.next();
			this.mostrarComida(comida);
		}
		
	}
	private void mostrarComida(Comida comida) {
		System.out.println("Id: " + comida.getId() + "\nNombre: " + comida.getNombre() + "\nCategoria: " + comida.getCategoria());
		
	}
}
