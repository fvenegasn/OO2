package ar.edu.unlp.info.oo2.ejercicio15;

public class Tamanio extends Decorator {

	private int tamanio;
	
	public String prettyPrint() {
		return super.prettyPrint() + tamanio;
	}
}
