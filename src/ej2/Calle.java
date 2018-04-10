package ej2;

import ej2.Atleta;

public class Calle {
	private int numero;
	private Atleta atletas;
	private double tiempo;

	public Calle(int numero) {
		this.numero=numero;
	}
	

	public int getNumero() {
		return numero;

	}

	public Atleta getAtleta() {
		return atletas;

	}

	public void setAtleta(Atleta atletas) {
		this.atletas = atletas;
	}

	public double getTiempo() {
		return tiempo;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}
	public void salida() {
		System.out.println("Los atletas son: "+ atletas.getNombre()+ " "+ atletas.getNacimiento());
	}

}
