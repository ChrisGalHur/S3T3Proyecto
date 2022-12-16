package Proyecto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase Ticket
 * 
 * Contiene los atributos y métodos
 * necesarios para construir un ticket de compra
 * 
 */
public class Ticket{

	private List<Producto> productos = new ArrayList();
	private static int numArchivo;
	private String nombreTicket;

	/**
	 * Retorna un List de productos
	 * 
	 * @return productos
	 */
	public List<Producto> getTicket() {
		return productos;
	}
	/**
	 * Retorna el nombre del archivo .txt
	 * 
	 * @return
	 */
	public String getNombreTicket() {
		return nombreTicket;
	}
	
	/**
	 * Añade a ticket un objeto arbol
	 * 
	 * @param arbol
	 */
	public void arbolesTicket(Arbol arbol) {
		productos.add(arbol);
	}
	
	/**
	 * Elimina de ticket un objeto arbol
	 * 
	 * @param arbol
	 */
	public void eliminaArbolTicket(Arbol arbol) {
		productos.remove(arbol);
	}
	
	/**
	 * Añade a ticket un objeto flor
	 * 
	 * @param flor
	 */
	public void floresTicket(Flor flor) {
		productos.add(flor);
	}
	
	/**
	 * Elimina de ticket un objeto flor
	 * 
	 * @param flor
	 */
	public void eliminaFlorTicket(Flor flor) {
		productos.remove(flor);
	}
	
	/**
	 * Añade a ticket un objeto decoracion
	 * @param decoracion
	 */
	public void decoracionTicket(Decoracion decoracion) {
		productos.add(decoracion);
	}
	
	/**
	 * Elimina de ticket un objeto decoracion
	 * @param decoracion
	 */
	public void eliminaDecoracionTicket(Decoracion decoracion) {
		productos.remove(decoracion);
	}
	
	/**
	 * Muestra los productos contenidos en el ticket
	 */
	public void verTicket() {
		productos.forEach(e -> System.out.println(e));
	}
	
	/**
	 * Imprime en un archivo .txt el ticket con el nombre
	 * de la floristeria
	 * @param floristeria
	 * @throws IOException
	 */
	public void imprimirTicket(Floristeria floristeria) throws IOException {
		numArchivo++;
		String nombreFloristeria = floristeria.getNombre();
		nombreTicket = nombreFloristeria + "_Ticket_"+ numArchivo + ".txt";
		Archivo.guardarTicket(productos, nombreTicket);
	}		

}
