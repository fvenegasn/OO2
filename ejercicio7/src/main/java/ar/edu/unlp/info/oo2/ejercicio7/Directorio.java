package ar.edu.unlp.info.oo2.ejercicio7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Directorio extends FileSystem{

	private List<FileSystem> hijos;

	public Directorio(String nombre) {
		super(nombre);
		this.hijos=new ArrayList<FileSystem>();
	}
	
	@Override
	public int tamanoTotalOcupado() {
		return hijos.stream().mapToInt(hijo -> hijo.tamanoTotalOcupado()).sum();
	}

	public Archivo archivoMasGrande() {
		return hijos.stream().map(hijo -> hijo.archivoMasGrande()) // esto asegura que si está en un directorio, 
																   // se meta al archivo que contiene adentro para 
																   // obtener el dato
				.max((h1,h2)-> Integer.compare(h1.tamanoTotalOcupado(), h2.tamanoTotalOcupado())).orElse(null);
	}
	
	//		return hijos.stream().max((h1,h2)-> Integer.compare(h1.tamanoTotalOcupado(), h2.tamanoTotalOcupado())).orElse(null);


	public Archivo archivoMasNuevo() {
		return hijos.stream().map(hijo -> hijo.archivoMasNuevo())
				.max(Comparator.comparing(archivo -> archivo.getFechaCreacion())).orElse(null);
	}

	
	
	public String listarContenido() {
		return hijos.stream().map(hijo -> hijo.getNombre()).collect(Collectors.joining("/"));
	}


	public FileSystem buscar(String nombre) {
		return hijos.stream().filter(hijo -> hijo.soyYo(nombre)!=null).findFirst().orElse(null);
	}
	
	
	public List<FileSystem> buscarTodos(String nombre) {
		return hijos.stream().filter(hijo -> hijo.soyYo(nombre)!=null).collect(Collectors.toList());
	}
	
	public void agregarArchivo(FileSystem a) {
		this.hijos.add(a);
	}

}
