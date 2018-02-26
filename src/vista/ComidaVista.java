package vista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import modelo.Comida;
import modelo.ComidaModelo;
import modelo.NombreComparator;

public class ComidaVista {
		static final int MOSTRAR_COMIDAS = 1;
		static final int AÑADIR_COMIDA = 2;
		static final int SALIR = 0;
		public void menuComida(){
			int opcion;
			Scanner scan = new Scanner(System.in);
			ComidaModelo comidaModelo = new ComidaModelo();
			
			do {
				ArrayList<Comida> comidas = comidaModelo.selectAll();
				System.out.println("---MENU---");
				System.out.println(MOSTRAR_COMIDAS + "- Mostrar comidas");
				System.out.println(AÑADIR_COMIDA + "- Añadir comida");
				System.out.println(SALIR + "- Salir");
				opcion = Integer.parseInt(scan.nextLine());
				
				switch (opcion) {
				case MOSTRAR_COMIDAS:	
						comidaModelo.mostrarComidas(comidas);
					break;
				case AÑADIR_COMIDA:
					
					break;
				case SALIR:
						System.out.println("Saliendo...");
					break;

				default:
					System.out.println("Opcion mal");
					break;
				}
				
			} while (opcion != SALIR);
			
		
	}
}
