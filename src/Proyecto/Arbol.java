package Proyecto;

public class Arbol extends Producto{

	//Atributos
	private double altura;
	
	//Constructores
	public Arbol(String nombre, double precio, double altura) {
		super(nombre, precio);
		this.altura = altura;
	}

	//Getters
	public double getAltura() {
		return altura;
	}

	//Setters
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "(id:" + super.getIdProducto() + ") Arbol | Nombre: " + super.getNombre() + " | Precio: " + super.getPrecio() + "€ | Altura: " + this.altura + "cm";
	}

}

