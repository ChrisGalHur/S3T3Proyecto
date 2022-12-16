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
	//******NUEVO
	private List<String> nombreTickets = new ArrayList();
	//********
	
	
	
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
	
	/**
	 * Crea un nuevo árbol a partir de las entradas del usuario
	 * 
	 * @return Arbol
	 */
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
	
	/**
	 * Crea una nueva flor a partir de las entradas del usuario
	 * 
	 * @return Flor
	 */
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
	
	/**
	 * Crea una nueva decoración a partir de las entradas del usuario
	 * 
	 * @return Decoracion
	 */
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
	public Arbol eliminarArbol() {
		int idEliminar;
		boolean eliminarHecho = false;
		Arbol arbol = null;
		mostrarArboles();
		if(arboles.size() > 0) {
			System.out.println("Qué ID de Arbol quieres que eliminemos?");
			idEliminar = entrada.nextInt();
			//Buscamos la coincidencia de id y si la hay la marcamos en eliminarHecho
			for(int i = 0; i < arboles.size(); i++) {
				if (arboles.get(i).getIdProducto() == idEliminar){
					arbol = arboles.get(i);
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
		return arbol;
	}
	
	//Método eliminar Flor
	public Flor eliminarFlor() {
		int idEliminar;
		boolean eliminarHecho = false;
		Flor flor = null;
		mostrarArboles();
		System.out.println("Qué ID de Flor quieres que eliminemos?");
		idEliminar = entrada.nextInt();
				
		for(int i = 0; i < flores.size(); i++) {
			if (flores.get(i).getIdProducto() == idEliminar){
				flores.get(i);
				flores.remove(i);
				eliminarHecho = true;
			}
		}
		
		if(eliminarHecho == true){
			System.out.println("La Flor se ha eliminado correctamente.");
		}else{
			System.out.println("No se ha podido eliminar la Flor.");
		}
		return flor;
	}
	
	//Método eliminar Decoración
	public Decoracion eliminarDecoracion() {
		int idEliminar;
		boolean eliminarHecho = false;
		Decoracion decoracion = null;	
		mostrarArboles();
		System.out.println("Qué ID de Arbol quieres que eliminemos?");
		idEliminar = entrada.nextInt();
				
		for(int i = 0; i < decoraciones.size(); i++) {
			if (decoraciones.get(i).getIdProducto() == idEliminar){
				decoraciones.get(i);
				decoraciones.remove(i);
				eliminarHecho = true;
			}
		}
		
		if(eliminarHecho == true){
			System.out.println("La Decoración se ha eliminado correctamente.");
		}else{
			System.out.println("No se ha podido eliminar la Decoración.");
		}
		return decoracion;
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

	/**
	 * Se almacena en un map el arrayList de productos
	 * 
	 * @param producto
	 */
	public void almacenarTicket(List <Producto> productos) {
        idStatic++;
        idMap = idStatic;
        tickets.put(idMap, productos);
    }

	/**
	 * Se recorre el map tickets
	 */
    public void verTickets() {
        if(tickets.size()== 0) {
            System.out.println("No existen tickets guardados");
        }else {
            for(Map.Entry entry: tickets.entrySet()) {
                System.out.println(entry.getKey() +" "+ entry.getValue());
            }
        }
    }
	
    /**
     * Se almacena en un arrayList el nombre de los
     * tickets impresos
     * 
     * @param nombreTicket
     */
    public void almacenarNombreTicketsImpresos(String nombreTicket) {
    	nombreTickets.add(nombreTicket);
    }
    
    /**
     * Lee el archivo .txt que desea el usuario.
     */
    public void verNombreTicketsImpresos() {
		Scanner entrada = new Scanner(System.in);
		
		boolean existe = false;
		
		System.out.println("Qué ticket desea comprobar?");
		
    	nombreTickets.forEach(e-> System.out.println(e));
    	
    	String recogerNombreArchivo = entrada.nextLine();
    	
    	for (int i=0; i < nombreTickets.size();i++) {
    		if(nombreTickets.get(i).equals(recogerNombreArchivo)) {
    			existe = true;
    		}
    	}
    	
    	if(existe) {
    		Archivo.leerTicket(recogerNombreArchivo);
    	}else {
    		System.out.println("El archivo no existe");
    	}
    	
    }
    
	@Override
	public String toString() {
		return "Floristeria: " + this.nombre ;

	}
	
	
}