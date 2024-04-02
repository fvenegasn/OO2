package ar.edu.unlp.info.oo2.ejercicio4;

public class Temporario extends Empleado{

	private boolean casado;
	private int hijos;
	private int horasTrabajo;
	
	
	
	public Temporario(boolean casado, int hijos, int horasTrabajo) {
		this.casado = casado;
		this.hijos = hijos;
		this.horasTrabajo = horasTrabajo;
	}

	public double basico() {
		return 20000+(horasTrabajo*300);
	}
	
	public double adicional() {
		double adicional=0;
		if(casado) adicional+=5000;
		adicional+=(2000*hijos);
		return adicional;
	}
}
