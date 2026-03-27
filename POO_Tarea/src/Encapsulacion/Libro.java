package Encapsulacion;

public class Libro {
	String titulo;
	String autor;
	int paginas;
	
	public Libro(String titulo, String autor, int paginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}
	
	public boolean esLargo() {
		if (paginas > 300) {
			return true;
		}else {
			return false;
		}
	}
	
	public void mostrar() {
		System.out.println("titulo: "+titulo);
		System.out.println("autor: "+autor);
		System.out.println("paginas: "+paginas);
		System.out.println("Es largo: "+ esLargo());
	}
}
