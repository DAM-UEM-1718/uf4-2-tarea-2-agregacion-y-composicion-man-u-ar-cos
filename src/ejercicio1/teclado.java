package ejercicio1;

public class teclado {
	private String Modelo;
	private String Modelo2;
	public teclado (String Modelo, String Modelo2) {
		this.Modelo=Modelo;
		this.Modelo2=Modelo2;
	}
	public String getTeclado() {
		return this.Modelo;
		
	}
	public void  setTeclado(String Modelo) {
		this.Modelo = Modelo;
	}
	public String getTeclado2() {
		return this.Modelo2;
		
	}
	public void  setTeclado2(String Modelo2) {
		this.Modelo2 = Modelo2;
	}
}

