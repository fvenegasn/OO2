package ar.edu.unlp.info.oo2.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Mixta implements Topografia{
	
	private List<Topografia>hijos;
	
	public Mixta() {
		this.hijos = new ArrayList<Topografia>();
	}
	
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

	public List<Topografia> getHijos(){
		return hijos;
	}

	public boolean comparar(Topografia topografia) {
		return topografia.compararContraMixta(this.getHijos());
	}
	
	@Override
	public boolean compararContraMixta(List<Topografia> topografia) {
		return hijos.equals(topografia);
	}

	@Override
	public boolean compararContraSimple(Topografia topografia) {
		return false;
	}
	
}
