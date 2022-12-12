package Proyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Floristeria {

	private Scanner entrada = new Scanner(System.in);
 
	//Atributos
	private String nombre;
	private List<Arbol> arboles = new ArrayList();
	private List<Decoracion> decoraciones = new ArrayList();
	private List<Flor> flores = new ArrayList();

	//Constructores
	public Floristeria() {
		
	}
	
	public Floristeria(String nombre) {
		this.nombre = nombre;
	}
	
	//Getters
	public String getNombre() {
		return nombre;
	}
	
	public List<Arbol> getArboles() {
		return arboles;
	}

	public List<Decoracion> getDecoraciones() {
		return decoraciones;
	}

	public List<Flor> getFlores() {
		return flores;
	}

	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setArboles(List<Arbol> arboles) {
		this.arboles = arboles;
	}

	public void setDecoraciones(List<Decoracion> decoraciones) {
		this.decoraciones = decoraciones;
	}

	public void setFlores(List<Flor> flores) {
		this.flores = flores;
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

	//Métodoseliminar
	public static void eliminarArbol(Floristeria floristeriaEliminarArbol) {
		int idEliminar;
		boolean eliminarHecho = false, encontrado = true;
		
		mostrarArboles();//Llamar al método public static?
		System.out.println("Qué ID de Arbol quieres que eliminemos?");
		idEliminar = entrada.nextInt();
			try {
				for (Producto arbolEliminar : floristeriaEliminarArbol.arboles) {
					if(arbolEliminar.getIdProducto() == idEliminar) {
						System.out.println("El arbol se ha eliminado correctamente.");
					}
				}
			} catch (Exception e) {
				System.out.println("Ese ID no está en la lista.");
			}
	}
	
	public static void eliminarFlor(Floristeria floristeriaEliminarFlor) {
		int idEliminar;
		boolean eliminarHecho = false, encontrado = true;
		
		mostrarFlores();//Llamar al método public static?
		System.out.println("Qué ID de Flor quieres que eliminemos?");
		idEliminar = entrada.nextInt();
			try {
				for (Producto florEliminar : floristeriaEliminarFlor.arboles) {
					if(florEliminar.getIdProducto() == idEliminar) {
						System.out.println("La flor se ha eliminado correctamente.");
					}
				}
			} catch (Exception e) {
				System.out.println("Ese ID de Flor no es valido.");
			}
	}
	
	public static void eliminarDecoracion(Floristeria floristeriaEliminarDecoracion) {
		int idEliminar;
		boolean eliminarHecho = false, encontrado = true;
		
		mostrarDecoraciones();//Llamar al método public static?
		System.out.println("Qué ID de Decoracion quieres que eliminemos?");
		idEliminar = entrada.nextInt();
			try {
				for (Producto decoracionEliminar : floristeriaEliminarDecoracion.arboles) {
					if(decoracionEliminar.getIdProducto() == idEliminar) {
						System.out.println("La decoracion se ha eliminado correctamente");
					}
				}
			} catch (Exception e) {
				System.out.println("Ese ID de decoracion no es valido.");
			}
	}

	//Metodos de valores
	public static void calcularValorTotal(Floristeria floristeriaValorTotal) {
		double valorTotal = 0,valorTotalArboles = 0, valorTotalFlores = 0, valorTotalDecoraciones = 0;
		
		//Valor en arboles 
		for(int i = 0; i < floristeriaValorTotal.getArboles().size(); i++) {
			valorTotalArboles = valorTotalArboles + floristeriaValorTotal.arboles.get(i).getPrecio();
		}
		//Valor en flores
		for(int i = 0; i < floristeriaValorTotal.getArboles().size(); i++) {
			valorTotalFlores = valorTotalFlores + floristeriaValorTotal.flores.get(i).getPrecio();
		}
		//Valor en decoraciones
		for(int i = 0; i < floristeriaValorTotal.getDecoraciones().size(); i++) {
			valorTotalDecoraciones = valorTotalDecoraciones + floristeriaValorTotal.decoraciones.get(i).getPrecio();
		}
		//Suma de valores
		valorTotal = valorTotalArboles + valorTotalFlores + valorTotalDecoraciones;
		//Hago los calculos por separado por si modificamos tenerlos ya
		
		System.out.println("El valor actual de " + floristeriaValorTotal.getNombre() + " es de " + valorTotal + "€.");
	}

	@Override
	public String toString() {
		return "Floristeria: " + nombre ;
	}
}