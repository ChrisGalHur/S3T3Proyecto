package Proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class FloristeriaContenedor {
	
	static Scanner entrada = new Scanner(System.in);
	
	private ArrayList<Floristeria> floristerias = new ArrayList<Floristeria>();
	
	//metodo crear floristería
	private void crearFloristeria() {
		
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
		
		Floristeria floristeriaCrear = new Floristeria(nombre);
		
		floristerias.add(floristeriaCrear);
		
		System.out.println("La floristería " + floristeriaCrear.getNombre() + " se ha creado correctamente.");
		
	}
	
	//método mostrar floristería
	private void mostrarFloristeria() {
		
		String nombre;
		
		System.out.println("Introducir la floristería a buscar: ");
		nombre = entrada.next();
		
		if (floristerias.size() > 0)
			for (Floristeria floristeriaVer : floristerias) {
				System.out.println(floristeriaVer.toString() + " mostrada correctamente.");
			}
		else {
			System.out.println("ERROR: No existe la florisería indicada.");
		}
	}
	
	//método eliminar floristería
	private void eliminarFloristeria() {
		
		String nombre;
		
		System.out.println("Introducir nombre de la floristería a eliminar: ");
		nombre = entrada.next();
		
		if (floristerias.size() == 0)
			System.out.println("ERROR. No existen floristerías en el sistema.");
		
		for ( int i = 0; i < floristerias.size(); i++) {
		
			if (floristerias.get(i).getNombre().equalsIgnoreCase(nombre)) {
				floristerias.remove(i);
				System.out.println("La floristería se ha eliminado correctamente");
			} else {
				System.out.println("ERROR: No existe la florisería indicada.");
			} 
		}
	}
	
	//método menú floristería
	public void menuFloristería() {
		
			int opcion = 0;
			
			do {

				try {

					System.out.println(" \n"
							+ "PANEL DE CONTROL DE FLORISTERIAS: \n" 
							+ "1. Crear floristerías. \n" 
							+ "2. Mostrar floristerías. \n"
							+ "3. Eliminar floristerías. \n" 
							+ "0. Volver al menú principal.");

					opcion = Integer.parseInt(entrada.next());
					
					switch (opcion) {

					case 1:
						System.out.println("CREAR FLORISTERÍA");
						crearFloristeria();
						break;

					case 2:
						System.out.println("MOSTRAR FLORISTERÍA");
						mostrarFloristeria();
						break;

					case 3:
						System.out.println("ELIMINAR FLORISTERÍA");
						eliminarFloristeria();
						break;

					case 0:
						
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