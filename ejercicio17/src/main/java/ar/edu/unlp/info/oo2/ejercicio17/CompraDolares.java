package ar.edu.unlp.info.oo2.ejercicio17;

public class CompraDolares extends ProductoFinanciero{

	private double valorCompra; // cant usd que compras o 1 USD = 1030 ARS?
	
	public CompraDolares() {
		super();
		this.valorCompra = 1030; // 1 USD = 1030 ARS
	}
	
	public double retornoInversion(double montoInicial) {
		return montoInicial/ this.valorCompra; // mtInic = 1030 -> 1030/1030 -> 1
	}
}
