package Proyecto;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		Ticket ticket = new Ticket();
		FloristeriaContenedor llamadaObjetosFloristeriaContenedor = new FloristeriaContenedor();

		Floristeria floristeria;
		int opcion = 0, opcionFloristeria = 0, opcionProductos = 0, opcionStocksCantidades = 0, opcionStocks = 0;

		
		do {
			try {
				opcion = Menu.menuFloristeria();
<<<<<<< HEAD
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
								//Sería lo mismo que crear ticket?
								break;
							case 2:
								//Mostrar stock
								//floristeria.stockFloristeria();
								break;
							case 3:
								
								break;
							case 4:
								
								break;
							case 5:
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
							case 6:
								
								break;
							case 7:
								
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
	
=======
				
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
					
					if (floristeria != null) {
					do {
						opcionFloristeria = Menu.menuOpcionesFloristeria();
						
						switch (opcionFloristeria) {
						
							case 1:
								
								do {
									opcionProductos = Menu.menuProductos();
									
									switch(opcionProductos) {
									
									case 1:
										
										//Arbol arbol = floristeria.anadirArbol();
										//ticket.arbolesTicket(arbol);
										break;
										
									case 2:
										
										Floristeria.eliminarArbol(floristeria);
										//método retirar árbol
										break;
										
									case 3:
										
										//Decoracion decoracion = floristeria.anadirDecoracion();
										//ticket.decoracionTicket(decoracion);
										break;
										
									case 4:
										Floristeria.eliminarDecoracion(floristeria);
										//método retirar decoración
										break;
										
									case 5:
										
//										Flor flor = floristeria.anadirFlor();
										//ticket.floresTicket(flor);
										break;
										
									case 6:
										Floristeria.eliminarFlor(floristeria);
										//método retirar flor
										break;
										
									case 7:
										
										ticket.verTicket();
										break;
										
									case 0:
										//Para imprimir el ticket y salir
										
										try {
											ticket.imprimirTicket();
											
										} catch (IOException e) {
											e.printStackTrace();
										}
										
										break;
										
									default:
										
										System.out.println("ERROR opción no aceptada.");
										break;
									}
								
								
								} while(opcionProductos != 0);
						
								break;
						
							case 2:
								
								do {
									
									opcionStocks = Menu.menuMostrarStock();
									
									switch(opcionStocks) {
									
									case 1:
										
										System.out.println("INVENTARIO DE ÁRBOLES");
										floristeria.mostrarArboles(floristeria);
										break;

									case 2:
										
										System.out.println("INVENTARIO DE FLORES");
										floristeria.mostrarFlores(floristeria);
										break;

									case 3:
										
										System.out.println("INVENTARIO DE DECORACIONES");
										floristeria.mostrarDecoraciones(floristeria);
										break;

									case 4:
										
										System.out.println("INVENTARIO DE ÁRBOLES");
										floristeria.mostrarArboles(floristeria);
										System.out.println("INVENTARIO DE FLORES");
										floristeria.mostrarFlores(floristeria);
										System.out.println("INVENTARIO DE DECORACIONES");
										floristeria.mostrarDecoraciones(floristeria);
										break;

									case 0:
										
										break;

									default:
										
										System.out.println("ERROR opción no aceptada.");
										break;
									}

								} while (opcionStocks != 0);
							
								break;
								
							case 3:
								
								do {
									
									opcionStocksCantidades = Menu.menuCantidadesStock();
									
									switch(opcionStocksCantidades) {
									
									case 1:
										
										System.out.println("STOCK DE ÁRBOLES");
										floristeria.cantidadStockArboles(floristeria);
										break;

									case 2:
										
										System.out.println("STOCK DE FLORES");
										floristeria.cantidadStockFlores(floristeria);
										break;

									case 3:
										
										System.out.println("STOCK DE DECORACIONES");
										floristeria.cantidadStockDecoraciones(floristeria);
										break;

									case 4:
										
										System.out.println("STOCK DE ÁRBOLES");
										floristeria.cantidadStockArboles(floristeria);
										System.out.println("STOCK DE FLORES");
										floristeria.cantidadStockFlores(floristeria);
										System.out.println("STOCK DE DECORACIONES");
										floristeria.cantidadStockDecoraciones(floristeria);
										break;

									case 0:
										
										break;

									default:
										
										System.out.println("ERROR opción no aceptada.");
										break;
									}

								} while (opcionStocksCantidades != 0);
							
								break;
								
							case 4:
								floristeria.calcularValorTotal(floristeria);
								//método valor total de la floristería
								break;
								
							case 5:
								
								//Crear los tickets, compra
								break;
								
							case 6:
								
								//mostrar ventas anteriores
								break;
								
							case 7:
								
								//ganancias en ventas
								break;
								
							case 8: 
								
								//ver tickets anteriores
								break;
								
							case 0:
								
								break;
								
							default:
								System.out.println("ERROR opción no aceptada.");
						}
						
					} while (opcionFloristeria != 0);
					
					break;
					}
				case 0:
					System.out.println("Hasta luego...");
					break;
					
				}
				
			}catch (Exception ex) {
				System.out.println("ERROR comando introducido no valido.");
			}
			
		} while (opcion != 0);
	}
>>>>>>> 84f349f66f6bb41ba40b42897e05b3970ff3949e
}

