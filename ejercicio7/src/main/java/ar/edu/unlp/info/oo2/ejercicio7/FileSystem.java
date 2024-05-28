package ar.edu.unlp.info.oo2.ejercicio7;

import java.time.*;


public abstract class FileSystem {
	
	private String nombre;
	private LocalDateTime fechaCreacion;
	
	public FileSystem(String nombre) {
		this.nombre=nombre;
		this.fechaCreacion = LocalDateTime.now();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDateTime getFechaCreacion() {
		return this.fechaCreacion;
	}
	public abstract int tamanoTotalOcupado();
	
	public abstract Archivo archivoMasGrande();

	public abstract Archivo archivoMasNuevo();
	
	public FileSystem soyYo(String nombre) {
		if(this.getNombre().equals(nombre)) return this;
		return null;
	}
	
	public void setFechaCreacion(LocalDateTime fecha) {
		this.fechaCreacion = fecha;		
	}
	
}
