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
	
	//Método añadir arbol
	public Arbol anadirArbol() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nombre del árbol: ");
		String nombre = entrada.nextLine();
		System.out.println("Precio del árbol: ");
		double precio = entrada.nextDouble();
		System.out.println("Altura del árbol: ");
		double altura = entrada.nextDouble();
		
		Arbol arbol = new Arbol(nombre,precio,altura);
		arboles.add(arbol);
		System.out.println("Árbol añadido");
		
		return arbol;
	}
	
	//Método añadir Flor
	public Flor anadirFlor() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nombre de la flor: ");
		String nombre = entrada.nextLine();
		System.out.println("Color de la flor: ");
		String color = entrada.nextLine();
		System.out.println("Precio de la flor: ");
		double precio = entrada.nextDouble();
		
		Flor flor = new Flor(nombre,precio, color);
		flores.add(flor);
		System.out.println("Flor añadida");
		return flor;
	}
	
	//Método añadir Decoracion
	public Decoracion anadirDecoracion() {
		Scanner entrada = new Scanner(System.in);
		
		boolean elegido = false;
		System.out.println("Nombre de la decoración: ");
		String nombre = entrada.nextLine();
		System.out.println("Precio de la decoración: ");
		double precio = entrada.nextDouble();
		String materiales ="";
		do {
			System.out.println("Elija material (Madera o Plástico) ");
			materiales = entrada.next();
			if(materiales.equalsIgnoreCase("madera") || materiales.equalsIgnoreCase("plástico")) {
				elegido = true;
				System.out.println("Estoy en el if");
			}
			else {
				System.out.println("opcion no correcta");
			}
		}while(!elegido);
		
		Decoracion decoracion = new Decoracion(nombre,precio,materiales);
		decoraciones.add(decoracion);
		System.out.println("Decoración añadida");
		return decoracion;
	}
	
	// método ver árboles
	public void mostrarArboles() {

		if (arboles.size() > 0)
			for (Arbol arbolesVer : arboles) {
				System.out.println(arbolesVer.toString());
			}
		else {
			System.out.println("ERROR: No hay árboles en el inventario.");
		}
	}
	
	// método ver flores
	public void mostrarFlores() {

		if (flores.size() > 0)
			for (Flor floresVer : flores) {
				System.out.println(floresVer.toString());
			}
		else {
			System.out.println("ERROR: No hay flores en el inventario.");
		}
	}
	
	// método ver decoraciones
	public void mostrarDecoraciones() {

		if (decoraciones.size() > 0)
			for (Decoracion decoracionesVer : decoraciones) {
				System.out.println(decoracionesVer.toString());
			}
		else {
			System.out.println("ERROR: No hay decoraciones en el inventario.");
		}
	}
	
	//método cantidades árboles
	public void cantidadStockArboles() {
		
		int cantidadArboles = arboles.size();
		System.out.println("Hay:" + cantidadArboles + " árboles.");		

	}
	
	//método cantidades flores
	public void cantidadStockFlores() {
		
		int cantidadFlores = flores.size();
		
		System.out.println("Hay: " + cantidadFlores + " flores.");
	}
	
	//método cantidades decoraciones
	public void cantidadStockDecoraciones() {
		
		int cantidadDecoraciones = decoraciones.size();
		
		System.out.println("Hay: " + cantidadDecoraciones + " decoraciones.");
	}

	//Métodoseliminar
//	public void eliminarArbol() {
//		int idEliminar;
//		boolean eliminarHecho = false, encontrado = true;
//		
////		mostrarArboles();//Llamar al método public static?
//		System.out.println("Qué ID de Arbol quieres que eliminemos?");
//		idEliminar = entrada.nextInt();
//			try {
//				for (Producto arbolEliminar : floristeriaEliminarArbol.arboles) {
//					if(arbolEliminar.getIdProducto() == idEliminar) {
//						System.out.println("El arbol se ha eliminado correctamente.");
//					}
//				}
//			} catch (Exception e) {
//				System.out.println("Ese ID no está en la lista.");
//			}
//	}
	
//	public void eliminarFlor() {
//		int idEliminar;
//		boolean eliminarHecho = false, encontrado = true;
//		
//		mostrarFlores();//Llamar al método public static?
//		System.out.println("Qué ID de Flor quieres que eliminemos?");
//		idEliminar = entrada.nextInt();
//			try {
//				for (Producto florEliminar : floristeriaEliminarFlor.arboles) {
//					if(florEliminar.getIdProducto() == idEliminar) {
//						System.out.println("La flor se ha eliminado correctamente.");
//					}
//				}
//			} catch (Exception e) {
//				System.out.println("Ese ID de Flor no es valido.");
//			}
//	}
	
//	public static void eliminarDecoracion(Floristeria floristeriaEliminarDecoracion) {
//		int idEliminar;
//		boolean eliminarHecho = false, encontrado = true;
//		
//		mostrarDecoraciones();//Llamar al método public static?
//		System.out.println("Qué ID de Decoracion quieres que eliminemos?");
//		idEliminar = entrada.nextInt();
//			try {
//				for (Producto decoracionEliminar : floristeriaEliminarDecoracion.arboles) {
//					if(decoracionEliminar.getIdProducto() == idEliminar) {
//						System.out.println("La decoracion se ha eliminado correctamente");
//					}
//				}
//			} catch (Exception e) {
//				System.out.println("Ese ID de decoracion no es valido.");
//			}
//	}
	
//	
//	public void eliminarFlor() {
//		int idEliminar;
//		boolean eliminarHecho = false, encontrado = true;
//		
////		mostrarFlores();//Llamar al método public static?
//		System.out.println("Qué ID de Flor quieres que eliminemos?");
//		idEliminar = entrada.nextInt();
//			try {
//				for (Producto florEliminar : floristeriaEliminarFlor.arboles) {
//					if(florEliminar.getIdProducto() == idEliminar) {
//						System.out.println("La flor se ha eliminado correctamente.");
//					}
//				}
//			} catch (Exception e) {
//				System.out.println("Ese ID de Flor no es valido.");
//			}
//	}
	
	public void eliminarDecoracion(Floristeria floristeriaEliminarDecoracion) {
		int idEliminar;
		boolean eliminarHecho = false, encontrado = true;
		
//		mostrarDecoraciones();//Llamar al método public static?
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
	public void calcularValorTotal(Floristeria floristeriaValorTotal) {
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
		return "Floristeria: " + this.nombre ;
	}
}