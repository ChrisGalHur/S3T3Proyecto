package Proyecto;

public class Decoracion extends Producto{

	//Constructor enum (sin declaraciones de acceso siempre será private) 
	enum materiales{
		MADERA, PLASTICO
	};
	
	//Atributos
	private String material;
	
	//Constructor
	public Decoracion(String nombre, double precio, String materiales) {
		super(nombre, precio);
		this.material = materiales;
	}

	//Getters
	public String getMaterial() {
		return material;
	}

	//Setters
	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "(id:" + super.getIdProducto() + ") Decoración | Nombre: " + super.getNombre() + " | Precio: " + super.getPrecio() + "€ | Material: " + this.material;
	}
	
}