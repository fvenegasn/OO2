package ar.edu.unlp.info.oo2.ejercicio17;

import java.util.ArrayList;
import java.util.List;

public class ConstructorProducto1 implements ConstructorProducto{
	
	private List<ProductoFinanciero> productos;
	
	public ConstructorProducto1() {
		this.productos = new ArrayList<ProductoFinanciero>();
	}
	
	@Override
	public void construirCompraDolares() {
		ProductoFinanciero producto = new CompraDolares();
		productos.add(producto);
	}
	
	@Override
	public void construirPlazoFijo(int dias, double interes) {
		ProductoFinanciero producto = new PlazoFijo(dias,interes);
		productos.add(producto);
	}
	
	@Override
	public void construirCompraPesos() {
		ProductoFinanciero producto = new CompraPesos();
		productos.add(producto);
	}
	
	@Override
	public double retornoInversion(double montoInicial) {
		return productos.stream().mapToDouble(producto -> producto.retornoInversion(montoInicial)).sum();
	}


}
