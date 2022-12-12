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
										
										//método retirar árbol
										break;
										
									case 3:
										
										//Decoracion decoracion = floristeria.anadirDecoracion();
										//ticket.decoracionTicket(decoracion);
										break;
										
									case 4:
										
										//método retirar decoración
										break;
										
									case 5:
										
										//Flor flor = floristeria.anadirFlor();
										//ticket.floresTicket(flor);
										break;
										
									case 6:
										
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
										
										System.out.println("STOCK DE ÁRBOLES");
										floristeria.cantidadStockArboles();
										System.out.println("STOCK DE FLORES");
										floristeria.cantidadStockFlores();
										System.out.println("STOCK DE DECORACIONES");
										floristeria.cantidadStockDecoraciones();
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

}

