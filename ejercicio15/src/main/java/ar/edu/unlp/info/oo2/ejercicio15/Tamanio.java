package ar.edu.unlp.info.oo2.ejercicio15;

public class Tamanio extends Decorator {

	public Tamanio(FileOO2 interfaz) {
		super(interfaz);
	}

	@Override
	public String hook() { 
		return this.tamanio();
	}
}
