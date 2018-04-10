package ej3;

import java.util.Date;
import java.util.LinkedList;



public class Libro {
	private String titulo;
	private long isbn;
	private String autor;
	private int añoPublicacion;
	private Pagina miPagina;
	private LinkedList<Pagina> paginas;

	public Libro(String tit, long codigo, String personaje, int tiempo) {
		this.titulo = tit;
		this.isbn = codigo;
		this.autor = personaje;
		this.añoPublicacion = tiempo;
		this.paginas = new LinkedList<Pagina>();
	}

	public void paginacion(String titulo, int num) {
		paginas.add(new Pagina(titulo, num));
	}
	
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String title) {
		this.titulo = title;
	}

	public long getIsbn() {
		return this.isbn;
	}

	public void setIsbn(long code) {
		this.isbn = code;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String aut) {
		this.autor = aut;
	}

	public int añoPublicación() {
		return this.añoPublicacion;
	}

	public void añoPublicacion(int año) {
		this.añoPublicacion = año;
	}
	

	public void salvar() {
		String imprime = "mi Libro " + titulo + " con isbn " + isbn + " escrito por " + autor + " publicado en "
				+ añoPublicacion+ " titulo " ;//+ miPagina.getContenido() + " en la pagina " + miPagina.getNumero();
		System.out.println(imprime);
		for (Pagina Pagina: paginas) {
			System.out.println("--> " + Pagina);
		}
	}
}
