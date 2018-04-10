package ej3;
//javier y Carlos

public class Pagina {

	private String contenido="";
	private int numero=0;

	public Pagina(String entrada, int numero) {
		this.contenido = entrada;
		this.numero = numero;
		
	}

	public String getContenido() {
		return this.contenido;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public void setContenido(int num) {
		numero = num;
	}
	
}
