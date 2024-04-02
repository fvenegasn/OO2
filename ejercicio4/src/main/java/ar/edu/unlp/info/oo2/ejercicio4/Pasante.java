package ar.edu.unlp.info.oo2.ejercicio4;

public class Pasante extends Empleado {

	private int cantExamenes;
	
	
	
	public Pasante(int cantExamenes) {
		this.cantExamenes = cantExamenes;
	}

	public double basico() {
		return 20000;
	}
	
	public double adicional() {
		double adicional=0;
		adicional+=(2000*cantExamenes);
		return adicional;
	}
	
}
