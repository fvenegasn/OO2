package ar.edu.unlp.info.oo2.ejercicio6;

import java.util.List;

public abstract class Simple implements Topografia{
	
	private double distribucion;
	
	public Simple(double distr) {
		distribucion=distr;
	}
	
	public boolean agregar(Topografia topografia) {
		return false;
	}
	
	public boolean eliminar(Topografia topografia) {
		return false;
	}
	
	public double calcular() {
		return this.distribucion;
	}

	@Override
	public boolean compararContraMixta(List<Topografia> topografia) {
		return false;		
	}

	@Override
	public boolean compararContraSimple(Topografia topografia) {
		return this.equals(topografia);
	}
	
	public boolean comparar(Topografia topografia) {
		return topografia.compararContraSimple(topografia);
	}

}
