package ar.edu.unlp.info.oo2.ejercicio17;

public class DirectorSilver {
	
	private ConstructorProducto constructor;
	
	public void construirProducto1() {
		constructor = new ConstructorProducto1();
		constructor.construirCompraDolares();
		constructor.construirPlazoFijo(35, 12.0);
		constructor.construirCompraDolares();
	}
	
	public ConstructorProducto getConstructor() {
		return this.constructor;
	}
}
