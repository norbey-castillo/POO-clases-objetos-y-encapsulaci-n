package Encapsulacion;

public class Persona {
	String nombre;
	String apellido;
	int edad;
	
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public void mostrar() {
		System.out.println("nombre: "+ nombre);
		System.out.println("apellido: "+ apellido);
		System.out.println("edad: "+ edad);
	}

}
