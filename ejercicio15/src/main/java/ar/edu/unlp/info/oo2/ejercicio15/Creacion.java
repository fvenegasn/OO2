package ar.edu.unlp.info.oo2.ejercicio15;

public class Creacion extends Decorator{
	
	public Creacion(FileOO2 interfaz) {
		super(interfaz);
	}

	@Override
	public String hook() {
		return this.creacion();
	}
}
