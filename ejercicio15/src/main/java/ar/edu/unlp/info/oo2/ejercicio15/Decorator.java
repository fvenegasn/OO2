package ar.edu.unlp.info.oo2.ejercicio15;

public abstract class Decorator implements FileOO2 {

	private FileOO2 componente;
	
	public String prettyPrint() {
		return componente.prettyPrint();
	}
}
