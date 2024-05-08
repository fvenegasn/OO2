package ar.edu.unlp.info.oo2.ejercicio15;

public class Modificacion extends Decorator{

	public Modificacion(FileOO2 interfaz) {
		super(interfaz);
	}

	@Override
	public String hook() {
		return this.modificacion();
	}
}
