package ar.edu.unlp.info.oo2.ejercicio4;

public class Planta extends Empleado{
	
	private boolean casado;
	private int hijos;
	private int antiguedad;
	
	
	
	public Planta(boolean casado, int hijos, int antiguedad) {
		this.casado = casado;
		this.hijos = hijos;
		this.antiguedad = antiguedad;
	}

	public double basico() {
		return 50000;
	}
	
	public double adicional() {
		double adicional=0;
		if(casado) adicional+=5000;
		adicional+=(2000*hijos);
		adicional+=(2000*antiguedad);
		return adicional;
	}
	

}
