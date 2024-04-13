package ar.edu.unlp.info.oo2.ejercicio4;

public abstract class CasadoConHijos extends Empleado { // ay pepe!!!!!
	
	private boolean casado;
	private int hijos;
	
	private final double adicionalPorCasado = 5000;
	private final double adicionalPorHijo = 2000;
	
	public CasadoConHijos(boolean casado, int hijos) {
		this.casado = casado;
		this.hijos = hijos;
	}
	
	//public abstract double basico();
	
	public double adicional() { // template method?
		double adicional=0;
		if(casado) adicional+=adicionalPorCasado;
		adicional+=(adicionalPorHijo*hijos);
		return adicional;
	}
	

}
