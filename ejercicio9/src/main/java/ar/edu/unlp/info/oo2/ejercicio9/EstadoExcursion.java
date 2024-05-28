package ar.edu.unlp.info.oo2.ejercicio9;

public abstract class EstadoExcursion {
	
	public abstract void inscribir(Excursion contexto,Persona unUsuario);
	
	public String obtenerInformacion(Excursion contexto) {
		return "Nombre: " + contexto.getNombre() + " / " +
				"Costo: " + contexto.getCosto() + " / " +
				"Inicio: " + contexto.getFechaInicio() + " / " +
				"Fin: "+ contexto.getFechaFin()+ " / " +
				"Punto de encuentro: " + contexto.getPuntoEncuentro()+ " / ";
	}

}
