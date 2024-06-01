package ar.edu.unlp.info.oo2.ejercicio9;

public class Minimo extends EstadoExcursion{

	@Override
	public void inscribir(Excursion contexto, Persona unUsuario) {
		contexto.agregarInscripto(unUsuario); 
		if(contexto.alcanzoMaximo()) {
			contexto.setEstado(new Maximo());
		}
	}

	@Override
	public String obtenerInformacion(Excursion excursion) {
		return super.obtenerInformacion(excursion) +
				"Usuarios faltantes para máximo: " + excursion.faltantesMaximo();
	}

}
