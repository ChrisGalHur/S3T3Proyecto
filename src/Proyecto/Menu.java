package Proyecto;

import java.util.Scanner;

public class Menu {

	static int menuFloristeria() {
		Scanner entrada = new Scanner(System.in);
		int opcion;

		System.out.println(" \n"
				+ "PANEL DE CONTROL DE FLORISTERIAS: \n" 
				+ "1. Crear floristería. \n" 
				+ "2. Mostrar floristería. \n"
				+ "3. Eliminar floristería. \n"
				+ "4. Opciones de floristería. \n" 
				+ "0. Salir del programa. \n");
		
		opcion = Integer.parseInt(entrada.next());
		
		return opcion;
		
	}
	
	static int menuOpcionesFloristeria() {
		Scanner entrada = new Scanner(System.in); 
		
		int opcion;
		
		System.out.println(" \n"
				+ "OPCIONES DE FLORISTERIA \n"
				+ "1.  Realizar pedido. \n"
				+ "2.  Mostrar stock. \n"
				+ "3.  Mostrar cantidades en stock. \n"
				+ "4.  Mostrar valor total de la floristería. \n"
				+ "5.  Ver tickets anteriores. \n"
				+ "6.  Buscar ticket impreso.  \n"
				+ "0.  Volver al Menú. \n");
		
		opcion = Integer.parseInt(entrada.next());
		
		return opcion;
	}
	
	static int menuProductos() {
		Scanner entrada = new Scanner(System.in);
		
		int opcion;
		
		System.out.println(" \n"
				+ "OPCIONES DE PRODUCTO \n"
				+ "1.  Añadir árbol. \n"
				+ "2.  Retirar árbol.  \n"
				+ "3.  Añadir decoración. \n"
				+ "4.  Retirar decoración. \n"
				+ "5.  Añadir Flor. \n"
				+ "6.  Retirar flor. \n"
				+ "7.  Ver ticket. \n"
				+ "0.  Generar ticket y salir. \n");
		
		opcion = Integer.parseInt(entrada.next());
		
		return opcion;
	}
	
	static int menuCantidadesStock() {
		Scanner entrada = new Scanner(System.in);
		
		int opcion;
		
		System.out.println(" \n" 
				+ "OPCIONES DE STOCK \n" 
				+ "1. Mostrar stock de árboles. \n" 
				+ "2. Mostrar stock de flores. \n"
				+ "3. Mostrar stock de decoraciones. \n" 
				+ "4. Mostrar todos los stocks. \n" 
				+ "0. Volver al menú de floristería.");
		
		opcion = Integer.parseInt(entrada.next());
		
		return opcion;
	}
	
	static int menuMostrarStock() {
		Scanner entrada = new Scanner(System.in);
		
		int opcion;
		
		System.out.println(" \n" 
				+ "OPCIONES DE MOSTRAR PRODUCTOS \n" 
				+ "1. Mostrar árboles. \n" 
				+ "2. Mostrar flores. \n"
				+ "3. Mostrar decoraciones. \n" 
				+ "4. Mostrar todos los productos. \n" 
				+ "0. Volver al menú de floristería.");

		opcion = Integer.parseInt(entrada.next());
		
		return opcion;
	}
}