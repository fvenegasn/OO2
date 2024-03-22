package ar.edu.unlp.info.oo2.ejercicio1;

public abstract class Posteo {

	private Usuario duenio;
	
	public Posteo(Usuario dueño) {
		this.duenio = dueño;
	}
	
	public Usuario getDuenio() {
		return this.duenio;
	}
}
