package ar.edu.unlp.info.oo2.ejercicio4;

public abstract class Empleado {

	//Esta bien que un empleado calcule su sueldo? --> aca si, no pasa nada
	//Con esto es suficiente para que haya template method? --> si, cumple el objetivo
	
	/*
	Objetivo (template method): Me da la receta a la solucion que necesito y ademas
	me permite saber que todo objeto que me herede, sabe implementar lo que yo pido.
	Obligo a que implementen lo que pido.
	*/
	
	final double descuentoBasico = 0.13; 
	final double descuentoAdicional = 0.05;
	
	public double sueldo() {
		return (this.basico()+this.adicional())-this.descuento();

	}
	
	public double descuento() {
		return (this.basico()*descuentoBasico)+(this.adicional()*descuentoAdicional);
	}
	
	
	public abstract double basico();
	
	public abstract double adicional();
}
