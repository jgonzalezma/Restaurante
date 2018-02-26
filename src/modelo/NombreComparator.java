package modelo;

import java.util.Comparator;

public class NombreComparator implements Comparator<Comida> {

	@Override
	public int compare(Comida c1, Comida c2) {
		return c1.getNombre().compareToIgnoreCase(c2.getNombre());
	}

}
