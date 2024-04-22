package ar.edu.unlp.info.oo2.ejercicio6;

import java.util.List;

public interface Topografia {

	public double calcular();
	public boolean eliminar(Topografia topografia);
	public boolean agregar(Topografia topografia);

	public boolean compararContraMixta(List<Topografia> topografia);
	public boolean compararContraSimple(Topografia topografia);
	public boolean comparar(Topografia topografia);
	
}
