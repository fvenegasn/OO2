package ar.edu.unlp.info.oo2.ejercicio17;

public class CompraPesos extends ProductoFinanciero{

	private double valorCompra; // cant pesos que compras
	
	public CompraPesos() {
		//super(monto);
		super();
		this.valorCompra = 1; // 1 ARS = 1 ARS
	}
	
	@Override
	public double retornoInversion(double montoInicial) {
		return montoInicial / this.valorCompra; // montoInicial = 1030 -> 1030/1
	}
}
