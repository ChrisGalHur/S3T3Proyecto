package Proyecto;


import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		Ticket ticket = new Ticket();
		FloristeriaContenedor llamadaObjetosFloristeriaContenedor = new FloristeriaContenedor();
		Floristeria floristeria;
		int opcion = 0, opcionFloristeria = 0, opcionProductos = 0;
		
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
	
}


