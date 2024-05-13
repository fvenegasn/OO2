package ar.edu.unlp.info.oo2.ejercicio17;

import java.time.LocalDate;

public abstract class ProductoFinanciero {

	private LocalDate fechaOperacion;
	//private double montoInicial;
	
	public ProductoFinanciero() {
		this.fechaOperacion = LocalDate.now();
		//this.montoInicial = monto;
	}
	
	public abstract double retornoInversion(double montoInicial);

	/*public double getMonto() {
		return this.montoInicial;
	}*/
}
