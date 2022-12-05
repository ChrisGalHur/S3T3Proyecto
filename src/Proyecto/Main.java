package Proyecto;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		//llamada a los objetos
		Floristeria llamadaObjetosFloristeria = new Floristeria();
		FloristeriaContenedor llamadaObjetosFloristeriaContenedor = new FloristeriaContenedor();
		
		int opcion = 0;
		
		do {

			try {

				System.out.println(" \n" 
						+ "Escoge una opción: \n" 
						+ "1. Menú floristería. \n"
						+ "2. Menú de productos. \n"
						+ "3. Mostrar stock. \n"
						+ "4. Mostrar cantidades en stock. \n"
						+ "5. Mostrar valor total de la floristería. \n"
						+ "6. Crear Tickets. \n"
						+ "7. Mostrar ventas anteriores. \n"
						+ "8. Ganancias en ventas. \n"
						+ "0. Salir.");

				opcion = Integer.parseInt(entrada.nextLine());

				switch (opcion) {

				case 1:
					System.out.println("MENÚ FLORISTERÍA");
					llamadaObjetosFloristeriaContenedor.menuFloristería();
					break;

				case 2:
					System.out.println("MENÚ DE PRODUCTOS");
					//llamadaObjetosFloristeria.menuProductos();
					break;

				case 3:
					System.out.println("MOSTRAR STOCK");
					llamadaObjetosFloristeria.stockFloristeria();
					break;

				case 4:
					System.out.println("MOSTRAR CANTIDADES EN STOCK");
					llamadaObjetosFloristeria.printarStockAmbCuantitats();
					break;
					
				case 5:
					System.out.println("MOSTRAR VALOR TOTAL DE LA FLORISTERIA");
					//llamada al método 
					break;
					
				case 6:
					System.out.println("CREAR TICKETS");
					//llamadaObjetosFloristeria.crearTickets();
					break;
					
				case 7:
					System.out.println("MOSTRAR VENTAS ANTERIORES");
					//llamada al método
					break;
					
				case 8:
					System.out.println("GANANCIAS EN VENTAS");
					//llamada al método
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



