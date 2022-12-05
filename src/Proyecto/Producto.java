package Proyecto;

public class Producto {

	//Atributos
	private int idProducto;
	private static int idSiguienteProducto = 0;
	private String nombre;
	private double precio;
	
	//Constructores
	public Producto(String nombre, double precio) {
		this.idSiguienteProducto++;
		this.idProducto = this.idSiguienteProducto;
		this.nombre = nombre;
		this.precio = precio;
	}

	//Getters
	public int getIdProducto() {
		return idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	//Setters
//	public void setIdProducto(int idProducto) {
//		this.idProducto = idProducto;
//	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}

