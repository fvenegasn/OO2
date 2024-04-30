package ar.edu.unlp.info.oo2.ejercicio15;

import java.time.LocalDate;

public class Modificacion extends Decorator{

	private LocalDate fechaDeModificacion;
	
	public String prettyPrint() {
		return super.prettyPrint() + fechaDeModificacion;
	}
}
