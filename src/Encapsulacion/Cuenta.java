package Encapsulacion;

public class Cuenta {
	
	String titular;
	double saldo;
	
	public Cuenta (String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	double caja = 0;
	
	public void depositar(double monto) {
		if (monto > 0) {
			caja = caja + saldo + monto;
			System.out.println("Monto agregado correctamente. ");
			System.out.println("Cantidad depositada: "+ monto);
		}else {
			System.out.println("No se pueden depositar montos negativos. ");
		}
	}
	
	public void retirar(double monto) {
		if(monto > 0) {
			caja = caja - monto;
			System.out.println("Cantidad retirada correctamente! ");
			System.out.println("Cantidad retirada: "+monto);
		}else if(monto < 0) {
			System.out.println("No puede retirar montos negativos! ");
		}else {
			System.out.println("No puede retirar 0 quetzales! ");
		}
	}
	
	public void mostrar() {
		
		System.out.println("Titular: "+ titular);
		System.out.println("En caja: "+ caja);
		
	}
	
}
