package ar.edu.unlp.info.oo2.ejercicio2;

public class Tijera implements Jugada{

	public String jugarContraPiedra() {
		return "pierde";
	}
	
	public String jugarContraPapel() {
		return "gana";
	}
	
	public String jugarContraTijera() {
		return "empata";
	}
	
	public String jugarContraLagarto() {
		return "gana";
	}
	
	public String jugarContraSpock() {
		return "pierde";
	}
	
	public String quienGano(Jugada j2) {
		return j2.jugarContraTijera();
	}
}
