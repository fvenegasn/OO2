package ar.edu.unlp.info.oo2.ejercicio15;

public abstract class Decorator implements FileOO2 {

	private FileOO2 componente;
	
	public Decorator(FileOO2 interfaz) {
		this.componente = interfaz;
	}
	
	public String prettyPrint() {
		return this.hook() + componente.prettyPrint();
	}
	
	public String nombre() {
		return this.componente.nombre();
	}
	
	public String extension() {
		return this.componente.extension();
	}
	
	public String creacion() {
		return this.componente.creacion();
	}
	
	public String modificacion() {
		return this.componente.modificacion();
	}
	
	public String permisos() {
		return this.componente.permisos();
	}
	
	public String tamanio() {
		return this.componente.tamanio();
	}
	
	public abstract String hook();
}
