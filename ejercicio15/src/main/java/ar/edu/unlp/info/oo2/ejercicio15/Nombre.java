package ar.edu.unlp.info.oo2.ejercicio15;

public class Nombre extends Decorator {
	
	public Nombre(FileOO2 interfaz) {
		super(interfaz);
	}

	@Override
	public String hook() {
		return this.nombre();
	}
}