package ej2;


/**
 * 
 * @author Gonzalouem
 *
 */
public class test {
	public static void main(String[] args) {
		Carrera primera = new Carrera(10, 2, 15);
		Calle pantomima=new Calle(1);
		pantomima.setAtleta(new Atleta("Gonzalo", 1999));
		pantomima.setAtleta(new Atleta("Nguema", 1998));
		pantomima.setTiempo(45);
		Calle lunaPluton=new Calle(2);
		lunaPluton.setAtleta(new Atleta("Javier", 1970));
		lunaPluton.setAtleta(new Atleta("Carlos", 1980));
		primera.salvar();
		pantomima.salida();
	}

}
