package ar.edu.unlp.info.oo2.ejercicio2;

public class Piedra implements Jugada{

	public String jugarContraPiedra() {
		return "empata";
	}
	
	public String jugarContraPapel() {
		return "pierde";
	}
	
	public String jugarContraTijera() {
		return "gana";
	}
	
	public String jugarContraLagarto() {
		return "gana";
	}
	
	public String jugarContraSpock() {
		return "pierde";
	}
	
	public String quienGano(Jugada j2) {
		return j2.jugarContraPiedra();
	}
}
