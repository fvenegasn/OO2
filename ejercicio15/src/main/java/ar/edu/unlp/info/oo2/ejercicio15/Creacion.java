package ar.edu.unlp.info.oo2.ejercicio15;

import java.time.LocalDate;

public class Creacion extends Decorator{
	
	private LocalDate fechaDeCreacion;
	
	public String prettyPrint() {
		return super.prettyPrint() + fechaDeCreacion;
	}
}
