package Proyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Floristeria {
	private Scanner entrada = new Scanner(System.in);
 
	private List<Arbol> arboles = new ArrayList();
	private List<Decoracion> decoraciones = new ArrayList();
	private List<Flor> flores = new ArrayList();
	
	//atributos
	private String nombre;

	//constructor para objetos
	public Floristeria(String nombre) {
		this.nombre = nombre;
	}
	
	//constructor vacío para la llamada desde el Main
	public Floristeria() {
		
	}

	//getters
	public String getNombre() {
		return nombre;
	}

	// método ver árboles
	private void mostrarArboles() {

		if (arboles.size() > 0)
			for (Arbol arbolesVer : arboles) {
				System.out.println(arbolesVer.toString());
			}
		else {
			System.out.println("ERROR: No hay árboles en el inventario.");
		}
	}

	// método ver flores
	private void mostrarFlores() {

		if (flores.size() > 0)
			for (Flor floresVer : flores) {
				System.out.println(floresVer.toString());
			}
		else {
			System.out.println("ERROR: No hay flores en el inventario.");
		}
	}

	// método ver decoraciones
	private void mostrarDecoraciones() {

		if (decoraciones.size() > 0)
			for (Decoracion decoracionesVer : decoraciones) {
				System.out.println(decoracionesVer.toString());
			}
		else {
			System.out.println("ERROR: No hay decoraciones en el inventario.");
		}
	}

	// método ver stock
	public void stockFloristeria() {
		int opcion = 0;
		
		do {

			try {

				System.out.println(" \n" 
						+ "Escoge una opción: \n" 
						+ "1. Mostrar árboles. \n" 
						+ "2. Mostrar flores. \n"
						+ "3. Mostrar decoraciones. \n" 
						+ "4. Mostrar todos los productos. \n" 
						+ "0. Volver al menú principal.");

				opcion = Integer.parseInt(entrada.next());

				switch (opcion) {

				case 1:
					System.out.println("INVENTARIO DE ÁRBOLES");
					mostrarArboles();
					break;

				case 2:
					System.out.println("INVENTARIO DE FLORES");
					mostrarFlores();
					break;

				case 3:
					System.out.println("INVENTARIO DE DECORACIONES");
					mostrarDecoraciones();
					break;

				case 4:
					System.out.println("INVENTARIO DE ÁRBOLES");
					mostrarArboles();
					System.out.println("INVENTARIO DE FLORES");
					mostrarFlores();
					System.out.println("INVENTARIO DE DECORACIONES");
					mostrarDecoraciones();
					break;

				case 0:
					
					break;

				default:
					System.out.println("ERROR opción no aceptada.");
					break;

				}

			} catch (Exception ex) {
				System.out.println("ERROR comando introducido no valido.");
			}

		} while (opcion != 0);

	}
	
	private void cantidadStockArboles() {
		
		int cantidadArboles = arboles.size();
		
		System.out.println("Hay:" + cantidadArboles + " árboles.");
		
	}
	
	private void cantidadStockFlores() {
		
		int cantidadFlores = flores.size();
		
		System.out.println("Hay: " + cantidadFlores + " flores.");
	}
	
	private void cantidadStockDecoraciones() {
		
		int cantidadDecoraciones = decoraciones.size();
		
		System.out.println("Hay: " + cantidadDecoraciones + " decoraciones en la tienda.");
	}
	
	public void printarStockAmbCuantitats() {
		
		int opcion = 0;
		
		do {

			try {

				System.out.println(" \n" 
						+ "Escoge una opción: \n" 
						+ "1. Mostrar stock de árboles. \n" 
						+ "2. Mostrar stock de flores. \n"
						+ "3. Mostrar stock de decoraciones. \n" 
						+ "4. Mostrar todos los stocks. \n" 
						+ "0. Volver al menú principal.");

				opcion = Integer.parseInt(entrada.next());

				switch (opcion) {

				case 1:
					System.out.println("STOCK DE ÁRBOLES");
					cantidadStockArboles();
					break;

				case 2:
					System.out.println("STOCK DE FLORES");
					cantidadStockFlores();
					break;

				case 3:
					System.out.println("STOCK DE DECORACIONES");
					cantidadStockDecoraciones();
					break;

				case 4:
					System.out.println("STOCK DE ÁRBOLES");
					cantidadStockArboles();
					System.out.println("STOCK DE FLORES");
					cantidadStockFlores();
					System.out.println("STOCK DE DECORACIONES");
					cantidadStockDecoraciones();
					break;

				case 0:
					
					break;

				default:
					System.out.println("ERROR opción no aceptada.");
					break;
				}

			} catch (Exception ex) {
				System.out.println("ERROR comando introducido no valido.");
			}

		} while (opcion != 0);

	}

	@Override
	public String toString() {
		return "Floristeria " + nombre ;
	}
	
	
}