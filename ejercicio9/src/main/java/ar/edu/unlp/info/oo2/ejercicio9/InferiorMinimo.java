package ar.edu.unlp.info.oo2.ejercicio9;

public class InferiorMinimo extends EstadoExcursion{

	@Override
	public void inscribir(Excursion contexto, Persona unUsuario) {
		contexto.agregarInscripto(unUsuario);
		if(contexto.alcanzoMinimo()) {
			contexto.setEstado(new Minimo());
		}
	}

	@Override
	public String obtenerInformacion(Excursion contexto) {
		return super.obtenerInformacion(contexto) +
				"Usuarios faltantes como mínimo: "+ contexto.faltantesMinimo();
	}

}
