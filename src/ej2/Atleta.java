package ej2;

public class Atleta {
	private String nombre;
	private long nacimiento;
	
	public Atleta(String nombre, long nacimiento) {
		this.nombre=nombre;
		this.nacimiento=nacimiento;
	}
	public String getNombre() {
		return nombre;
		
	}
	public long getNacimiento() {
		return nacimiento;
		
	}
}
