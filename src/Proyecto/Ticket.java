package Proyecto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Ticket{

	private List<Producto> ticket = new ArrayList();
	private static int numArchivo;
	private static int idStatic;
	private int idMap;
	
	public List<Producto> getTicket() {
		return ticket;
	}

	public void arbolesTicket(Arbol arbol) {
		ticket.add(arbol);
	}
	
	public void floresTicket(Flor flor) {
		ticket.add(flor);
	}
	
	public void decoracionTicket(Decoracion decoracion) {
		ticket.add(decoracion);
	}
	
	public void verTicket() {
		ticket.forEach(e -> System.out.println(e));
	}
	
	public void imprimirTicket() throws IOException {
        numArchivo++;
        String nombreTicket = "Ticket_" + numArchivo + ".txt";
        Archivo.guardarTicket(ticket, nombreTicket);
    }
	
	public void almacenarTicket() {
		idStatic++;
		idMap = idStatic;
		tickets.put(idMap, ticket);
	}
	
	public void mostrarTickets() {
		for(Map.Entry entry: tickets.entrySet()) {
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
	}
	
	public void verArchivoTicket() {
		Archivo.leerTicket("ticket.txt");
	}
}
