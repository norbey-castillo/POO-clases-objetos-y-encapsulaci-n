package Encapsulacion;

public class Calculadora {
	
	public static void sumar(double numero1, double numero2) {
		double suma = numero1+numero2;
		System.out.println("Suma: "+ suma);
	}
	
	public static void restar(double numero1, double numero2) {
		double resta = numero1-numero2;
		System.out.println("Resta: "+ resta);
	}
	
	public static void multiplicar(double numero1, double numero2) {
		double multiplicacion = numero1*numero2;
		System.out.println("Multiplicacion: "+ multiplicacion);
	}
	
	public static void dividir(double numero1, double numero2) {
			
			if(numero2 == 0) {
			System.out.println("No se puede dividir entre cero. ");
			}else {
				double division = numero1/ numero2;
			System.out.println("Division: "+ division);
		}
	}
	
	
	
}
