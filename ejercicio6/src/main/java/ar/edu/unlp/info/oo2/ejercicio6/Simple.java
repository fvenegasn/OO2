package ar.edu.unlp.info.oo2.ejercicio6;

public abstract class Simple implements Topografia{
	
	private int distribucion;
	
	public Simple(int distr) {
		distribucion=distr;
	}
	
	public abstract String tipo();
	
	public boolean agregar(Topografia topografia) {
		return false;
	}
	
	public boolean eliminar(Topografia topografia) {
		return false;
	}
	
	public double calcular() {
		return this.distribucion;
	}

}
