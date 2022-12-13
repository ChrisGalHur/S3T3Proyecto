package Proyecto;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {

		FloristeriaContenedor llamadaObjetosFloristeriaContenedor = new FloristeriaContenedor();

		Floristeria floristeria;
		int opcion = 0, opcionFloristeria = 0, opcionProductos = 0, opcionStocksCantidades = 0, opcionStocks = 0;

		//Para pruebas
		Floristeria floristeriaPrueba = new Floristeria("Pruebas");
		Flor florPrueba = new Flor("amapola", 2.5, "Amarilla");
		Arbol arbolPrueba = new Arbol("Fresno", 25.99, 10.5);
		Decoracion decoracionPrueba = new Decoracion("Gnomo jardín", 21.55, "MADERA");
		//---------------------------------------------------------------
		
		do {
			try {
				opcion = Menu.menuFloristeria();

				switch (opcion) {
				case 1:
					System.out.println("CREAR FLORISTERÍA");
					llamadaObjetosFloristeriaContenedor.crearFloristeria();
					break;
				case 2:
					System.out.println("MOSTRAR FLORISTERÍAS");
					llamadaObjetosFloristeriaContenedor.mostrarFloristerias();
					break;
				case 3:
					System.out.println("ELIMINAR FLORISTERÍA");
					llamadaObjetosFloristeriaContenedor.eliminarFloristeria();
					break;
				case 4:
					System.out.println("OPCIONES DE FLORISTERÍA");
					floristeria = llamadaObjetosFloristeriaContenedor.devuelveFloristeria();
					do {
						opcionFloristeria = Menu.menuOpcionesFloristeria();
						switch (opcionFloristeria) {
							case 1:
								Ticket ticket = new Ticket();
								//Crear los tickets, compra
								do {
									opcionProductos = Menu.menuProductos();
									
									switch(opcionProductos) {
									case 1:
										Arbol arbol = floristeria.anadirArbol();
										ticket.arbolesTicket(arbol);
										break;
									case 2:
										
										break;
									case 3:
										Decoracion decoracion = floristeria.anadirDecoracion();
										ticket.decoracionTicket(decoracion);
										break;
									case 4:
										
										break;
									case 5:
										Flor flor = floristeria.anadirFlor();
										ticket.floresTicket(flor);
										break;
									case 6:
										
										break;
									case 7:
										ticket.verTicket();
										break;
									case 0:
										//Para imprimir el ticket
										try {
											ticket.imprimirTicket();
										} catch (IOException e) {
											e.printStackTrace();
										}
										//Almacenar ticket en hasmap
										ticket.almacenarTicket();
										//aquí el ticket tendría que quedar vacío
										ticket.eliminarTicket();
										break;
									default:
						
									}
								} while(opcionProductos != 0);
								break;
							case 2:
								//Mostrar stock
								//floristeria.stockFloristeria();
								break;
							case 3:
								//Mostrar cantidades en stock
								break;
							case 4:
								//Mostrar valor total de la floristería
								break;
							case 5:
								//Mostrar ventas anteriores
							case 6:
								//Ganancias en ventas
								break;
							case 7:
								//Ver tickets anteriores
								//ticket.mostrarTickets();								
								break;
							case 0:
								System.out.println("Saldría del menú secundario ??");
								break;
							default:
								System.out.println("Número no correcto");
						}
					} while (opcionFloristeria != 0);
					
					break;
				case 0:
					System.out.println("Hasta luego...");
					break;
				}
			}catch (Exception ex) {
				System.out.println("ERROR comando introducido no valido.");
			}
		} while (opcion != 0);

		
	}

}

