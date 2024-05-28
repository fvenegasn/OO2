package ar.edu.unlp.info.oo2.ejercicio9;

public class Maximo extends EstadoExcursion{

	@Override
	public void inscribir(Excursion contexto, Persona unUsuario) {
		contexto.agregarEspera(unUsuario);	
	}

	@Override
	public String obtenerInformacion(Excursion contexto) {
		return super.obtenerInformacion(contexto);
	}

}
