package Proyecto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Ticket{

	private List<Producto> productos = new ArrayList();
	private static int numArchivo;
	private static int idStatic;
	private int idMap;
	
	public List<Producto> getTicket() {
		return productos;
	}

	public void arbolesTicket(Arbol arbol) {
		productos.add(arbol);
	}
	
	public void floresTicket(Flor flor) {
		productos.add(flor);
	}
	
	public void decoracionTicket(Decoracion decoracion) {
		productos.add(decoracion);
	}
	
	public void verTicket() {
		productos.forEach(e -> System.out.println(e));
	}
	
	public void imprimirTicket(Floristeria floristeria) throws IOException {
		numArchivo++;
		String nombreFloristeria = floristeria.getNombre();
		String nombreTicket = nombreFloristeria + "_Ticket_"+ numArchivo + ".txt";
		Archivo.guardarTicket(productos, nombreTicket);
	}		
		
	public void verArchivoTicket() {
		Archivo.leerTicket("ticket.txt");
	}
	
}
