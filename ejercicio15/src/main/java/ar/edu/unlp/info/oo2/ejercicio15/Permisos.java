package ar.edu.unlp.info.oo2.ejercicio15;

public class Permisos extends Decorator{

	public Permisos(FileOO2 interfaz) {
		super(interfaz);
	}

	@Override
	public String hook() {
		return this.permisos();
	}

}
