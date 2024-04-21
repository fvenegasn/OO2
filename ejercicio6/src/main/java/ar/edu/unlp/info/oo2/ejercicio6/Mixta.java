package ar.edu.unlp.info.oo2.ejercicio6;

import java.util.List;

public class Mixta implements Topografia{
	
	private List<Topografia>hijos;
	
	
	public double calcular() {
		return (hijos.stream().mapToDouble(cacho -> cacho.calcular()).sum()) / 4;
	}
	
	public boolean eliminar(Topografia topografia) {
		hijos.remove(topografia);
		return true;
	}
	
	public boolean agregar(Topografia topografia) {
		hijos.add(topografia);
		return true;
	}

}
