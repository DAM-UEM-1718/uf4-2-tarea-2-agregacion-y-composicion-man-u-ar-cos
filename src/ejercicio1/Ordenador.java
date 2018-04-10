package ejercicio1;

import java.util.ArrayList;

public class Ordenador {
	private pantalla miPantalla;
	private raton miRaton;
	private teclado miTeclado;
	private CPU miCPU;
     private ArrayList <Ordenador> miOrdenador;
     public Ordenador () {
    	 miOrdenador = new ArrayList<Ordenador>();
     }
     public void Salvar () {
    	 String imprime = "ordenador" + miCPU.getModelo() + " raton " + miRaton.getRaton() + " pantalla " 
    			 + miPantalla.getPantalla() + "teclado "+ miTeclado.getTeclado();  
    	 System.out.println(imprime);
     }
    }
	