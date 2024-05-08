package ar.edu.unlp.info.oo2.ejercicio15;

import java.time.LocalDate;

public class File implements FileOO2 {
	
	private String nombre;
	private String extension;
	private String creacion;
	private String modificacion;
	private String permisos;
	private String tamanio;
	
	public File(String nombre, String extension, String creacion, String modificacion, String permisos, String tamanio) {
		this.nombre = nombre;
		this.extension = extension;
		this.creacion = creacion;
		this.modificacion = modificacion;
		this.permisos = permisos;
		this.tamanio = tamanio;
	}
	
	@Override
	public String prettyPrint() {
		return "";
	}
	
	@Override
	public String nombre() {
		return this.nombre;
	}
	
	@Override
	public String extension() {
		return this.extension;
	}
	
	@Override
	public String creacion() {
		return this.creacion;
	}
	
	@Override
	public String modificacion() {
		return this.modificacion;
	}
	
	@Override
	public String permisos() {
		return this.permisos;
	}
	
	@Override
	public String tamanio() {
		return this.tamanio;
	}
}
