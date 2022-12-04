package Proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class FloristeriaContenedor {
	
	static Scanner entrada = new Scanner(System.in);
	
	private ArrayList<Floristeria> floristerias = new ArrayList<Floristeria>();
	
	//metodo crear floristería
	public void crearFloristeria() {
		
		String nombre;
		
		System.out.println("Introducir nombre para la nueva floristería: ");
		nombre = entrada.next();
		
		for ( int i = 0; i < floristerias.size(); i++) {
			
			while(floristerias.get(i).getNombre().equals(nombre)) {
			
				if (floristerias.get(i).getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("El nombre introducido ya existe.");
				
				System.out.println("Introducir el nombre para la nueva floristería: ");
				nombre = entrada.next();
				} 
			}
		}
		
		
		Floristeria floristeria1 = new Floristeria(nombre);
		
		floristerias.add(floristeria1);
		
		System.out.println("La floristería " + floristeria1.getNombre() + " se ha creado correctamente.");
		
	}
}