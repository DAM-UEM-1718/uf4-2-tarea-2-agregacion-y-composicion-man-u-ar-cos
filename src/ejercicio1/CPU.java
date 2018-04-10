package ejercicio1;

public class CPU {
	private String Modelo;
	private String Modelo2;
	public CPU (String Modelo, String Modelo2) {
		this.Modelo=Modelo;
		this.Modelo2=Modelo2;
	}
	public String getModelo() {
		return this.Modelo;
		
	}
	public void  setModelo(String Modelo) {
		this.Modelo = Modelo;
	}
	public String getModelo2() {
		return this.Modelo2;
		
	}
	public void  setModelo2(String Modelo2) {
		this.Modelo2 = Modelo2;
	}
}
