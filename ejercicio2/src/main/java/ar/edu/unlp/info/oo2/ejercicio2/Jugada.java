package ar.edu.unlp.info.oo2.ejercicio2;

public interface Jugada {

	public String jugarContraPiedra();
	
	public String jugarContraPapel();
	
	public String jugarContraTijera();
	
	public String jugarContraLagarto();
	
	public String jugarContraSpock();

	public String quienGano(Jugada j);
	
}
