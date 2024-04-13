package ar.edu.unlp.info.oo2.ejercicio4;

public class Temporario extends CasadoConHijos{ // papucho!!!

	private int horasTrabajo;
	
	public Temporario(boolean casado, int hijos, int horasTrabajo) {
		super(casado, hijos);
		this.horasTrabajo = horasTrabajo;
	}

	public double basico() {
		return 20000+(horasTrabajo*300);
	}
	
	public double adicional() {
		return super.adicional();
	}
}
