package Encapsulacion;

public class Producto {
	
	String codigo;
	String nombre;
	double precio;
	
	public Producto(String codigo, String nombre, int precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public double aplicarDescuento(double porcentaje) {
		
		precio = precio - (precio * porcentaje / 100);
		
		return precio;
	}
	
	public void mostrar() {
		System.out.println("Codigo: "+ codigo);
		System.out.println("Nombre: "+ nombre);
		System.out.println("precio: "+ precio+"\n");
	}
}
