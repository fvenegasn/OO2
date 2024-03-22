package ar.edu.unlp.info.oo2.ejercicio2;

public class Papel implements Jugada{

	public String jugarContraPiedra() {
		return "gana";
	}
	
	public String jugarContraPapel() {
		return "empata";
	}
	
	public String jugarContraTijera() {
		return "pierde";
	}
	
	public String jugarContraLagarto() {
		return "pierde";
	}
	
	public String jugarContraSpock() {
		return "gana";
	}
	
	public String quienGano(Jugada j2) {
		return j2.jugarContraPapel();
	}
}
