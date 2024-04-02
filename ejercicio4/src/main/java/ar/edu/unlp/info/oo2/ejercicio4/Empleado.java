package ar.edu.unlp.info.oo2.ejercicio4;

public abstract class Empleado {

	//Esta bien que un empleado calcule su sueldo?
	//Con esto es suficiente para que haya template method?
	
	
	
	public double sueldo() {
		return (this.basico()+this.adicional())-this.descuento();

	};
	
	public double descuento() {
		return (this.basico()*0.13)+(this.adicional()*0.05);
	}
	
	
	public abstract double basico();
	
	public abstract double adicional();
}
