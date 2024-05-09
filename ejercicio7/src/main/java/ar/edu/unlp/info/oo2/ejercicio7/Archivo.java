package ar.edu.unlp.info.oo2.ejercicio7;

public class Archivo extends FileSystem{

	private int tamano;
	
	public Archivo(String nombre) {
		super(nombre);
		tamano=32;
	}

	@Override
	public int tamanoTotalOcupado() {
		return tamano;
	}

	@Override
	public Archivo archivoMasGrande() {
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}
	
	public void setTamano(int tamano) {
		this.tamano=tamano;
	}

	
	
	
}
