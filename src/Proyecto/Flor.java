package Proyecto;

public class Flor extends Producto{
	
	//Atributos
	private String color;
	
	//Constructores
	public Flor(String nombre, double precio, String color) {
		super(nombre, precio);
		this.color = color;
	}

	//Getters
	public String getColor() {
		return color;
	}

	//Setters
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "(id:" + super.getIdProducto() + ") Flor | Nombre: " + super.getNombre() + " | Precio: " + super.getPrecio() + "€ | Color: " + this.color;
	}
	
}