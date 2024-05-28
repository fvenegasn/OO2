package ar.edu.unlp.info.oo2.ejercicio17;


public class prueba {

	public static void main(String[] args) {
		DirectorSilver director;
		director = new DirectorSilver();
		director.construirProducto1();
		System.out.println(director.getConstructor().retornoInversion(100000));
	}
		

}
