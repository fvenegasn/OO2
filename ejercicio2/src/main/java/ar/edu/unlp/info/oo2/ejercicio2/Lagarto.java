package ar.edu.unlp.info.oo2.ejercicio2;

public class Lagarto implements Jugada{
	
	public String jugarContraPiedra() {
		return "pierde";
	}
	
	public String jugarContraPapel() {
		return "gana";
	}
	
	public String jugarContraTijera() {
		return "pierde";
	}
	
	public String jugarContraLagarto() {
		return "empata";
	}
	
	public String jugarContraSpock() {
		return "gana";
	}
	
	public String quienGano(Jugada j2) {
		return j2.jugarContraLagarto();
	}
}
