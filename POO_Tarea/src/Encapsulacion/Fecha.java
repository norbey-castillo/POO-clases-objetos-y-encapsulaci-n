package Encapsulacion;

public class Fecha {
	int dia;
	int mes;
	int año;
	
	public Fecha (int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	
	public boolean esValida() {
		if (dia < 1 || dia > 31) {
			return false;
		}
		
		if (mes < 1 || mes > 12) {
			return false;
		}
		
		return true;
	}
}
