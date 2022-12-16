package Proyecto;

import java.io.IOException;
import java.util.List;

public class Main {

	
	public static void main(String[] args) {

		FloristeriaContenedor llamadaObjetosFloristeriaContenedor = new FloristeriaContenedor();

		Floristeria floristeria;
		int opcion = 0, opcionFloristeria = 0, opcionProductos = 0, opcionStocksCantidades = 0, opcionStocks = 0;

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

					if(floristeria != null) {
						do {
							try {
							opcionFloristeria = Menu.menuOpcionesFloristeria();
							switch (opcionFloristeria) {
								case 1:
									Ticket ticket = new Ticket();
									//Crear los tickets, compra
									do {
										try {
										opcionProductos = Menu.menuProductos();
										switch(opcionProductos) {
											case 1:
												//Añade arboles al ticket y floristeria
												Arbol arbol = floristeria.anadirArbol();
												ticket.arbolesTicket(arbol);
												break;
											case 2:
												//Elimina arbol de floristeria
												Arbol arbol1 = floristeria.eliminarArbol();
												ticket.eliminaArbolTicket(arbol1);
												break;
											case 3:
												//Añade arboles al ticket y floristeria
												Decoracion decoracion = floristeria.anadirDecoracion();
												ticket.decoracionTicket(decoracion);
												break;
											case 4:
												Decoracion decoracion1 = floristeria.eliminarDecoracion();
												ticket.eliminaDecoracionTicket(decoracion1);
												break;
											case 5:
												Flor flor = floristeria.anadirFlor();
												ticket.floresTicket(flor);
												break;
											case 6:
												Flor flor1 = floristeria.eliminarFlor();
												ticket.eliminaFlorTicket(flor1);
												break;
											case 7:
												ticket.verTicket();
												break;
											case 0:
												List <Producto> ticketMain = ticket.getTicket();
												floristeria.almacenarTicket(ticketMain);
												//Para imprimir el ticket
												try {
													ticket.imprimirTicket(floristeria);
													floristeria.almacenarNombreTicketsImpresos(ticket.getNombreTicket());
												} catch (IOException e) {
													e.printStackTrace();
												}
												break;
											default:
												System.out.println("Opción no válida");
											}
										}catch(Exception ex) {
										System.out.println("ERROR de comando no válido.");
										}
									} while(opcionProductos != 0);
									break;
								case 2:
									do {
										try {
										opcionStocks = Menu.menuMostrarStock();
										
										switch(opcionStocks) {
										
										case 1:
											System.out.println("INVENTARIO DE ÁRBOLES");
											floristeria.mostrarArboles();
											break;
										case 2:
											System.out.println("INVENTARIO DE FLORES");
											floristeria.mostrarFlores();
											break;
										case 3:
											System.out.println("INVENTARIO DE DECORACIONES");
											floristeria.mostrarDecoraciones();
											break;
										case 4:
											System.out.println("INVENTARIO DE ÁRBOLES");
											floristeria.mostrarArboles();
											System.out.println("INVENTARIO DE FLORES");
											floristeria.mostrarFlores();
											System.out.println("INVENTARIO DE DECORACIONES");
											floristeria.mostrarDecoraciones();
											break;
										case 0:
											break;
										default:
											System.out.println("Opción no válida");
											break;
											}
										}catch(Exception ex) {
											System.out.println("ERROR de comando no válido.");
										}
									} while (opcionStocks != 0);
								break;
									
								case 3:
									do {
										try {
										opcionStocksCantidades = Menu.menuCantidadesStock();
										
										switch(opcionStocksCantidades) {
										
										case 1:
											System.out.println("STOCK DE ÁRBOLES");
											floristeria.cantidadStockArboles();
											break;
										case 2:
											System.out.println("STOCK DE FLORES");
											floristeria.cantidadStockFlores();
											break;
										case 3:
											System.out.println("STOCK DE DECORACIONES");
											floristeria.cantidadStockDecoraciones();
											break;
										case 4:
											floristeria.cantidadStockArboles();
											floristeria.cantidadStockFlores();
											floristeria.cantidadStockDecoraciones();
											break;
										case 0:
											break;
										default:
											System.out.println("Opción no válida");
											break;
											}
										}catch(Exception ex) {
											System.out.println("ERROR de comando no válido.");
										}
	
									} while (opcionStocksCantidades != 0);
								
									break;
								case 4:
									//Mostrar valor total de la floristería
									floristeria.calcularValorTotal();
									break;
								case 5:
									//Mostrar ventas anteriores
									floristeria.verTickets();
									break;
								case 6:
									//Buscar ticket ya impreso
									floristeria.verNombreTicketsImpresos();
									break;
								case 0:
									break;
								default:
									System.out.println("Opción no válida");
								}
							}catch(Exception ex) {
								System.out.println("ERROR de comando no válido.");
							}
						} while (opcionFloristeria != 0);
}
						break;
				case 0:
					System.out.println("Cerrando programa...");
					break;
				default:
					System.out.println("Opción no válida");
				}
			}catch (Exception ex) {
				System.out.println("ERROR comando introducido no valido.");
			}
		} while (opcion != 0);
	}
}