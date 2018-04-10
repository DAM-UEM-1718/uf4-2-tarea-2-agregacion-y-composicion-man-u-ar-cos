package ej3;

public class Test {

	public static void main(String[] args) {
		Libro LunaPluton = new Libro("Luna de PLuton", 12, "Dross", 2015);
		Pagina miPagina = new Pagina("Indice", 12);
		LunaPluton.paginacion("Cap2",234);
		LunaPluton.paginacion("Cap3",267);
		LunaPluton.paginacion("Cap3",267);
		LunaPluton.paginacion("Cap3",267);
		LunaPluton.paginacion("Cap3",267);
		
		LunaPluton.salvar();
		
	}

}
