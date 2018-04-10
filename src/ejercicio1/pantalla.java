package ejercicio1;

public class pantalla {
	private String Modelo;
	private String Modelo2;
	public pantalla (String Modelo, String Modelo2) {
		this.Modelo=Modelo;
		this.Modelo2=Modelo2;
	}
	public String getPantalla() {
		return this.Modelo;
		
	}
	public void  setPantalla(String Modelo) {
		this.Modelo = Modelo;
	}
	public String getpantalla2() {
		return this.Modelo2;
		
	}
	public void  setpantalla2(String Modelo2) {
		this.Modelo2 = Modelo2;
	}
}
