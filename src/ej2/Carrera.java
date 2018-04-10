package ej2;

public class Carrera {
	private int distancia;
	private int ronda;
	private long fecha;
	private Calle[] calles;
	public Carrera(int distancia, int ronda, long fecha) {
		this.distancia = distancia;
		this.ronda = ronda;
		this.fecha = fecha;
		this.calles=new Calle[8];
	}



	public int getDistancia() {
		return distancia;

	}

	public void setDistancia(int distancia) {
		this.distancia=distancia;
	}
	public int getRonda() {
		return ronda;

	}
	public void setRonda(int ronda) {
		this.ronda=ronda;
	}
	
	public long getFecha() {
		return fecha;

	}
	public void setFecha(long fecha) {
		this.fecha=fecha;
	}
	public void crearCalle(Calle c, int pos) {
		Calle ca=new Calle(c.getNumero());
		this.calles[pos]=ca;
	}
	public void salvar() {
		System.out.println("La distancia es: "+distancia+ " La ronda es: "+ ronda+ " La fecha es: dia "+ fecha+"Calle: "+calles.toString());
		
	}
}