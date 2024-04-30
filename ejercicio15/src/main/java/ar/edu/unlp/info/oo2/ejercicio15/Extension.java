package ar.edu.unlp.info.oo2.ejercicio15;

public class Extension extends Decorator {
	
	private String extension;
	
	public String prettyPrint() {
		return super.prettyPrint() + extension;
	}
}
