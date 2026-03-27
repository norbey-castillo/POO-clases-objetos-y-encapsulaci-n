package Encapsulacion;


public class Main {
	
	public static void ejercicio1() {
		
		Persona p1 = new Persona("Norbey", "Castillo", 20);
		Persona p2 = new Persona("Marlyn", "Vanesa", 27);
		Persona p3 = new Persona("Mivian", "Elizabeth", 34);
		
		p1.mostrar();
		p2.mostrar();
		p3.mostrar();
		
	}
	
	public static void ejercicio2() {
		Rectangulo r1 = new Rectangulo(10,8);
		Rectangulo r2 = new Rectangulo(8,9);
		
		r1.area();
		r1.perimetro();
		
		r2.area();
		r2.perimetro();
		
		if(r1.area() > r2.area()) {
			System.out.println("El area de r1 es mas grande. ");
		}else {
			System.out.println("El area de r2 es mas grande. ");
			}
	}
	
	public static void ejercicio3() {
		Producto pd1 = new Producto("pd01","Lavadora",3500);
		Producto pd2 = new Producto("pd02","Secadora",2800);
		
		pd1.aplicarDescuento(20);
		pd2.aplicarDescuento(15);
		
		pd1.mostrar();
		pd2.mostrar();
	}
	
	public static void ejercicio4() {
		Cuenta c1 = new Cuenta("Norbey", 1500);
		
		c1.depositar(500);
		c1.retirar(300);
		
		c1.mostrar();
		
	}
	
	public static void ejercicio5() {
		Libro l1 = new Libro("El nombre del viento","Patrick Rothfuss",880);
		
		l1.esLargo();
		l1.mostrar();
		
	}
	
	public static void ejercicio6() {

		
		Calculadora.sumar(5, 5);
		Calculadora.restar(5, 3);
		Calculadora.multiplicar(5, 3);
		Calculadora.dividir(6, 0);
	}
	
	public static void ejercicio7() {
		Fecha f1 = new Fecha(5,6,2026);
		Fecha f2 = new Fecha(6,5,2026);
		Fecha f3 = new Fecha(33,13,2026);
		
		System.out.println("La fecha es valida: "+ f1.esValida());
		System.out.println("La fecha es valida: "+ f2.esValida());
		System.out.println("La fecha es valida: "+ f3.esValida());
	}

	public static void main(String[] args) {
		
		ejercicio1(); 

	}

}
