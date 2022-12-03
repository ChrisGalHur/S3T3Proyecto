package Proyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Floristeria {
	static Scanner entrada = new Scanner(System.in);

	private static List<Arbol> arboles = new ArrayList();
	private static List<Decoracion> decoraciones = new ArrayList();
	private static List<Flor> flores = new ArrayList();

	private String nombre;

	public Floristeria(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	// método ver árboles
	public static void mostrarArboles() {

		if (arboles.size() > 0)
			for (Arbol arbolesVer : arboles) {
				System.out.println(arbolesVer.toString());
			}
		else {
			System.out.println("ERROR: No hay árboles en el inventario.");
		}
	}

	// método ver flores
	public static void mostrarFlores() {

		if (flores.size() > 0)
			for (Flor floresVer : flores) {
				System.out.println(floresVer.toString());
			}
		else {
			System.out.println("ERROR: No hay flores en el inventario.");
		}
	}

	// método ver decoraciones
	public static void mostrarDecoraciones() {

		if (decoraciones.size() > 0)
			for (Decoracion decoracionesVer : decoraciones) {
				System.out.println(decoracionesVer.toString());
			}
		else {
			System.out.println("ERROR: No hay decoraciones en el inventario.");
		}
	}

	// método ver stock
	public static void mostrarStock() {
		int opcion = 0;
		
		do {

			try {

				System.out.println("Escoge una opción: \n" 
						+ "1. Mostrar árboles. \n" 
						+ "2. Mostrar flores. \n"
						+ "3. Mostrar decoraciones. \n" 
						+ "4. Mostrar todos los productos. \n" 
						+ "0. Salir.");

				opcion = Integer.parseInt(entrada.nextLine());

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
					System.out.println("Adios.");
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
	
	public static void cantidadStockArboles() {
		
		System.out.println("Introducir el producto: ");
		String producto = entrada.nextLine();
		
		long cantidad;
		
		if (arboles.size() > 0) {
		cantidad = arboles.stream().filter(cantidadArboles -> cantidadArboles.getNombre().equalsIgnoreCase(producto)).count();
		
		System.out.println("Hay " + cantidad + " arboles.");
		
		} else {
			System.out.println("ERROR no hay árboles en Stock");
		}
	}
	
	public static void cantidadStockFlores() {
		
		System.out.println("Introducir el producto: ");
		String producto = entrada.nextLine();
		
		long cantidad;
		
		if (flores.size() > 0) {
		cantidad = flores.stream().filter(cantidadFlores -> cantidadFlores.getNombre().equalsIgnoreCase(producto)).count();
		
		System.out.println("Hay " + cantidad + " flores.");
		
		} else {
			System.out.println("ERROR no hay flores en Stock");
		}
	}
	
	public static void cantidadStockDecoraciones() {
		
		System.out.println("Introducir el producto: ");
		String producto = entrada.nextLine();
		
		long cantidad;
		
		if (decoraciones.size() > 0) {
		cantidad = decoraciones.stream().filter(cantidadDecoraciones -> cantidadDecoraciones.getNombre().equalsIgnoreCase(producto)).count();
		
		System.out.println("Hay " + cantidad + " decoraciones.");
		
		} else {
			System.out.println("ERROR no hay decoraciones en Stock");
		}
	}
	
	public static void cantidadStockTotal() {
		
		int opcion = 0;
		
		do {

			try {

				System.out.println("Escoge una opción: \n" 
						+ "1. Mostrar stock de árboles. \n" 
						+ "2. Mostrar stock de flores. \n"
						+ "3. Mostrar stock de decoraciones. \n" 
						+ "4. Mostrar todos los stocks. \n" 
						+ "0. Salir.");

				opcion = Integer.parseInt(entrada.nextLine());

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
					System.out.println("Adios.");
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
}