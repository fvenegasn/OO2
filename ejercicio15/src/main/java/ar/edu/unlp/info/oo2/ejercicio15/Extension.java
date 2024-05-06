package ar.edu.unlp.info.oo2.ejercicio15;

public class Extension extends Decorator {

	public Extension(FileOO2 interfaz) {
		super(interfaz);
	}

	@Override
	public String hook() {
		return this.extension();
	}
}
