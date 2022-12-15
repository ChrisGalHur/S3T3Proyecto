package Proyecto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Floristeria {

	static Scanner entrada = new Scanner(System.in);

	//Atributos
	private String nombre;
	private List<Arbol> arboles = new ArrayList();
	private List<Decoracion> decoraciones = new ArrayList();
	private List<Flor> flores = new ArrayList();
	public Map<Integer, List<Producto>> tickets = new HashMap<>();
	private static int idStatic;
	private int idMap;
	
	//Constructores
	public Floristeria() {
	}

	public Floristeria(String nombre) {
		this.nombre = nombre;
	}

	//getters
	public String getNombre() {
		return nombre;
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
		
		System.out.println("Nombre del árbol: ");
		String nombre = entrada.nextLine();
		System.out.println("Precio del árbol: ");
		double precio = entrada.nextDouble();
		System.out.println("Altura del árbol: ");
		double altura = entrada.nextDouble();
		entrada.nextLine();//Limpiando Buffer
		
		Arbol arbol = new Arbol(nombre,precio,altura);
		arboles.add(arbol);
		System.out.println("Árbol añadido");
		
		return arbol;
	}
	
	//Método añadir Flor
	public Flor anadirFlor() {
		
		System.out.println("Nombre de la flor: ");
		String nombre = entrada.nextLine();
		System.out.println("Color de la flor: ");
		String color = entrada.nextLine();
		System.out.println("Precio de la flor: ");
		double precio = entrada.nextDouble();
		entrada.nextLine();//Limpiando Buffer
		
		Flor flor = new Flor(nombre,precio, color);
		flores.add(flor);
		System.out.println("Flor añadida");
		return flor;
	}
	
	//Método añadir Decoracion
	public Decoracion anadirDecoracion() {
		
		boolean elegido = false;
		System.out.println("Nombre de la decoración: ");
		String nombre = entrada.nextLine();
		System.out.println("Precio de la decoración: ");
		double precio = entrada.nextDouble();
		entrada.nextLine();//Limpiando Buffer
		
		String materiales ="";
		do {
			System.out.println("Elija material (Madera o Plástico) ");
			materiales = entrada.next();
			if(materiales.equalsIgnoreCase("madera") || materiales.equalsIgnoreCase("plástico")) {
				elegido = true;
			}
			else {
				System.out.println("Opcion no correcta.");
			}
		}while(!elegido);
		
		Decoracion decoracion = new Decoracion(nombre, precio, materiales);
		decoraciones.add(decoracion);
		System.out.println("Decoración añadida");
		return decoracion;
	}
	

	// método ver árboles
	public void mostrarArboles() {
		System.out.println("STOCK DE ÁRBOLES");
		
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
		System.out.println("STOCK DE FLORES");
		
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
		System.out.println("STOCK DE DECORACIONES");
		
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

	//Método eliminar Arbol
	public void eliminarArbol() {
		int idEliminar;
		boolean eliminarHecho = false;
		
		mostrarArboles();
		if(arboles.size() > 0) {
			System.out.println("Qué ID de Arbol quieres que eliminemos?");
			idEliminar = entrada.nextInt();
			//Buscamos la coincidencia de id y si la hay la marcamos en eliminarHecho
			for(int i = 0; i < arboles.size(); i++) {
				if (arboles.get(i).getIdProducto() == idEliminar){
					arboles.remove(i);
					eliminarHecho = true;
				}
			}
			//Variará el mensaje si se ha hecho el eliminar o no
			if(eliminarHecho == true){
				System.out.println("El Arbol se ha eliminado correctamente.");
			}else{
				System.out.println("No se ha podido eliminar el Arbol.");
			}
		}
	}
	
	//Método eliminar Flor
	public void eliminarFlor() {
		int idEliminar;
		boolean eliminarHecho = false;
			
		mostrarArboles();
		System.out.println("Qué ID de Flor quieres que eliminemos?");
		idEliminar = entrada.nextInt();
				
		for(int i = 0; i < flores.size(); i++) {
			if (flores.get(i).getIdProducto() == idEliminar){
				flores.remove(i);
				eliminarHecho = true;
			}
		}
		
		if(eliminarHecho == true){
			System.out.println("La Flor se ha eliminado correctamente.");
		}else{
			System.out.println("No se ha podido eliminar la Flor.");
		}
	}
	
	//Método eliminar Decoración
	public void eliminarDecoracion() {
		int idEliminar;
		boolean eliminarHecho = false;
			
		mostrarArboles();
		System.out.println("Qué ID de Arbol quieres que eliminemos?");
		idEliminar = entrada.nextInt();
				
		for(int i = 0; i < decoraciones.size(); i++) {
			if (decoraciones.get(i).getIdProducto() == idEliminar){
				decoraciones.remove(i);
				eliminarHecho = true;
			}
		}
		
		if(eliminarHecho == true){
			System.out.println("La Decoración se ha eliminado correctamente.");
		}else{
			System.out.println("No se ha podido eliminar la Decoración.");
		}
	}

	//Metodos de valores
	public void calcularValorTotal() {
		double valorTotal = 0,valorTotalArboles = 0, valorTotalFlores = 0, valorTotalDecoraciones = 0;
		
		//Valor en arboles 
		for(int i = 0; i < arboles.size(); i++) {
			valorTotalArboles = valorTotalArboles + arboles.get(i).getPrecio();
		}
		//Valor en flores
		for(int i = 0; i < arboles.size(); i++) {
			valorTotalFlores = valorTotalFlores + flores.get(i).getPrecio();
		}
		//Valor en decoraciones
		for(int i = 0; i < decoraciones.size(); i++) {
			valorTotalDecoraciones = valorTotalDecoraciones + decoraciones.get(i).getPrecio();
		}
		//Suma de valores
		valorTotal = valorTotalArboles + valorTotalFlores + valorTotalDecoraciones;
		//Hago los calculos por separado por si modificamos tenerlos ya
		
		System.out.println("El valor actual de " + nombre + " es de " + valorTotal + "€.");
	}

	//Método guardar tiquet
	public void almacenarTicket(List <Producto> producto) {
        idStatic++;
        idMap = idStatic;
        tickets.put(idMap, producto);
    }

	//Método ver tiquets
    public void verTickets() {
        if(tickets.size()== 0) {
            System.out.println("No existen tickets guardados");
        }else {
            for(Map.Entry entry: tickets.entrySet()) {
                System.out.println(entry.getKey() +" "+ entry.getValue());
            }
        }
    }
	
	@Override
	public String toString() {
		return "Floristeria: " + this.nombre ;

	}
	
	
}