package Proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class FloristeriaContenedor {
	
	private Scanner entrada = new Scanner(System.in);
	
	private ArrayList<Floristeria> floristerias = new ArrayList<Floristeria>();
				
	//metodo crear floristería
	public void crearFloristeria() {
		String nombre;
		
		System.out.println("Introducir nombre para la nueva floristería: ");
		nombre = entrada.nextLine();
		
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
	public void mostrarFloristeria() {

        String nombre;
        Floristeria floristeriaMostrada = null;

        if (floristerias.size() == 0) {
            System.out.println("ERROR. No existen floristerías en el sistema.");
        } else {
        	mostrarFloristerias();

        	System.out.println("Introducir la floristería a buscar: ");
        	nombre = entrada.next();

        	if (floristerias.size() > 0)
        		for ( int i = 0; i < floristerias.size(); i++) {
        			if (floristerias.get(i).getNombre().equalsIgnoreCase(nombre)) {
        				floristeriaMostrada = floristerias.get(i);
        				System.out.println(floristerias.get(i).toString() + " mostrada correctamente.");
        			}
        		}

        	if (floristeriaMostrada == null) {
        		System.out.println("No se ha encontrado la floristería.");
        	}
        }
    }
	
	//método eliminar floristería
	public void eliminarFloristeria() {

        String nombre = "";
        Floristeria floristeriaEncontrada = null;

        mostrarFloristerias();

        if (floristerias.size() > 0) {
	        System.out.println(" \n ");
	        System.out.println("Introducir nombre de la floristería a eliminar: ");
	        nombre = entrada.nextLine();
        }

        if (floristerias.size() > 0) {
        for ( int i = 0; i < floristerias.size(); i++) {

            if (floristerias.get(i).getNombre().equalsIgnoreCase(nombre)) {

                floristeriaEncontrada = floristerias.get(i);
                floristerias.remove(i);
                System.out.println("La floristería se ha eliminado correctamente");
                } 
            }

        if (floristeriaEncontrada == null) {
            System.out.println("No se ha encontrado la floristeria");
            }
        }
    }
	
	//Mostrar floristerias
	public void mostrarFloristerias() {
		if (floristerias.size() > 0)
			for (Floristeria floristeriaVer : floristerias) {
				System.out.println(floristeriaVer.toString());
			}
		else {
			System.out.println("No existen floristerías.");
		}
	}
	

	//Devuelvefloristeria
	public Floristeria devuelveFloristeria() {
        boolean existe = false;

        if(floristerias.size() > 0) {
            mostrarFloristerias();
            System.out.println("Con qué floristería quiere trabajar?");
            String nombre = entrada.nextLine();

            for (Floristeria f : floristerias) {
                if(f.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("Ha escogido la floristería " + f.getNombre() + " correctamente.");
                    existe = true;
                    return f;
                }
            } 
            if (!existe) {
                System.out.println("La floristería indicada no existe");
            }

        }else {
            System.out.println("No existen floristerias");
        }

        return null;
    }

}