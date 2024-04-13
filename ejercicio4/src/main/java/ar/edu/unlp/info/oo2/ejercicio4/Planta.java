package ar.edu.unlp.info.oo2.ejercicio4;

public class Planta extends CasadoConHijos{ // si sos dardo o maria elena pasa
	
	private int antiguedad;
	
	public Planta(boolean casado, int hijos, int antiguedad) {
		super(casado,hijos);
		this.antiguedad = antiguedad;
	}

	public double basico() {
		return 50000;
	}
	
	public double adicional() {
		return super.adicional() + (2000*antiguedad);
	}
	

}
