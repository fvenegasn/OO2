package ar.edu.unlp.info.oo2.ejercicio17;

public class PlazoFijo extends ProductoFinanciero{

	private int cantidadDias;
	private double interes;
	
	public PlazoFijo(int cantidad, double interes) {
		super();
		this.cantidadDias = cantidad;
		this.interes = interes;
	}
	
	public double retornoInversion(double montoInicial) {
		return montoInicial * (1 + (interes * cantidadDias / 365));
	}
}
