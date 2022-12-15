package Proyecto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Floristeria {


	static Scanner entrada = new Scanner(System.in);

	//Ticket ticket = new Ticket();
 
	private List<Arbol> arboles = new ArrayList();
	private List<Decoracion> decoraciones = new ArrayList();
	private List<Flor> flores = new ArrayList();

	//******** NUEVO CLASE FLORISTERIA ************
	public Map<Integer, List<Producto>> ticketsProducto = new HashMap<>();

	
	private static int idStatic;
	private int idMap;
	
	public void guardarTickets(List <Producto> producto) {
		idStatic++;
		idMap = idStatic;
		ticketsProducto.put(idMap, producto);
	}
	
	public void verTickets() {
		if(ticketsProducto.size()== 0) {
			System.out.println("No existen tickets guardados");
		}else {
			for(Map.Entry entry: ticketsProducto.entrySet()) {
				System.out.println(entry.getKey() +" "+ entry.getValue());
			}
		}
	}
	//***************************

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

	public List<Arbol> getArboles() {
		return arboles;
	}

	public List<Decoracion> getDecoraciones() {
		return decoraciones;
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

	//Método eliminar Arbol
    public void eliminarArbol() {
        int idEliminar;
        boolean eliminarHecho = false;

        mostrarArboles();
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
    
    public void eliminarFlor() {
        int idEliminar;
        boolean eliminarHecho = false;

        mostrarFlores();
        System.out.println("Qué ID de Flores quieres que eliminemos?");
        idEliminar = entrada.nextInt();
        //Buscamos la coincidencia de id y si la hay la marcamos en eliminarHecho
        for(int i = 0; i < flores.size(); i++) {
            if (flores.get(i).getIdProducto() == idEliminar){
                flores.remove(i);
                eliminarHecho = true;
            }
        }
        //Variará el mensaje si se ha hecho el eliminar o no
        if(eliminarHecho == true){
            System.out.println("La flor se ha eliminado correctamente.");
        }else{
            System.out.println("No se ha podido eliminar la flor.");
        }
    }
    
    public void eliminarDecoracion() {
        int idEliminar;
        boolean eliminarHecho = false;

        mostrarDecoraciones();
        System.out.println("Qué ID de Decoración quieres que eliminemos?");
        idEliminar = entrada.nextInt();
        //Buscamos la coincidencia de id y si la hay la marcamos en eliminarHecho
        for(int i = 0; i < decoraciones.size(); i++) {
            if (decoraciones.get(i).getIdProducto() == idEliminar){
                decoraciones.remove(i);
                eliminarHecho = true;
            }
        }
        //Variará el mensaje si se ha hecho el eliminar o no
        if(eliminarHecho == true){
            System.out.println("La Decoración se ha eliminado correctamente.");
        }else{
            System.out.println("No se ha podido eliminar la Decoración.");
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