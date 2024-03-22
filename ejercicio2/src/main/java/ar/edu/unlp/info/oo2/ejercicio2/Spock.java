package ar.edu.unlp.info.oo2.ejercicio2;

public class Spock implements Jugada{

	public String jugarContraPiedra() {
		return "gana";
	}
	
	public String jugarContraPapel() {
		return "pierde";
	}
	
	public String jugarContraTijera() {
		return "gana";
	}
	
	public String jugarContraLagarto() {
		return "pierde";
	}
	
	public String jugarContraSpock() {
		return "empata";
	}
	
	public String quienGano(Jugada j2) {
		return j2.jugarContraSpock();
	}
}
