package ejercicio1;

public class raton {
	private String Modelo;
	private String Modelo2;
	public raton (String Modelo, String Modelo2) {
		this.Modelo=Modelo;
		this.Modelo2=Modelo2;
	}
	public String getRaton() {
		return this.Modelo;
		
	}
	public void  setRaton(String Modelo) {
		this.Modelo = Modelo;
	}
	public String getRaton2() {
		return this.Modelo2;
		
	}
	public void  setRaton2(String Modelo2) {
		this.Modelo2 = Modelo2;
	}
}

