package Proyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Floristeria {


	private Scanner entrada = new Scanner(System.in);
 
	private List<Arbol> arboles = new ArrayList();
	private List<Decoracion> decoraciones = new ArrayList();
	private List<Flor> flores = new ArrayList();

	

	//atributos
	private String nombre;
 
	//constructor para objetos
	public Floristeria(String nombre) {
		this.nombre = nombre;
	}
	
	//constructor vacío para la llamada desde el Main
	public Floristeria() {
		
	}

	//getters
	public String getNombre() {
		return nombre;
	}

	// método ver árboles
	public void mostrarArboles(Floristeria mostrarArboles) {

		if (arboles.size() > 0)
			for (Arbol arbolesVer : arboles) {
				System.out.println(arbolesVer.toString());
				System.out.println(mostrarArboles.getNombre());
			}
		else {
			System.out.println("ERROR: No hay árboles en el inventario.");
		}
	}

	// método ver flores
	public void mostrarFlores(Floristeria mostrarFlores) {

		if (flores.size() > 0)
			for (Flor floresVer : flores) {
				System.out.println(floresVer.toString());
				System.out.println(mostrarFlores.getNombre());
			}
		else {
			System.out.println("ERROR: No hay flores en el inventario.");
		}
	}

	// método ver decoraciones
	public void mostrarDecoraciones(Floristeria mostrarDecoraciones) {

		if (decoraciones.size() > 0)
			for (Decoracion decoracionesVer : decoraciones) {
				System.out.println(decoracionesVer.toString());
				System.out.println(mostrarDecoraciones.getNombre());
			}
		else {
			System.out.println("ERROR: No hay decoraciones en el inventario.");
		}
	}

	//método cantidades árboles
	public void cantidadStockArboles(Floristeria cantidadArbolesStock) {
		
		int cantidadArboles = arboles.size();
		
		System.out.println("Hay:" + cantidadArboles + " árboles.");
		System.out.println("Floristería " + cantidadArbolesStock.getNombre());
		
	}
	
	//método cantidades flores
	public void cantidadStockFlores(Floristeria cantidadFloresStock) {
		
		int cantidadFlores = flores.size();
		
		System.out.println("Hay: " + cantidadFlores + " flores.");
		System.out.println("Floristería " + cantidadFloresStock.getNombre());
	}
	
	//método cantidades decoraciones
	public void cantidadStockDecoraciones(Floristeria cantidadDecoracionesStock) {
		
		int cantidadDecoraciones = decoraciones.size();
		
		System.out.println("Hay: " + cantidadDecoraciones + " decoraciones.");
		System.out.println("Floristería " + cantidadDecoracionesStock.getNombre());
	}

	@Override
	public String toString() {
		return "Floristeria " + nombre ;
	}
	
	
}