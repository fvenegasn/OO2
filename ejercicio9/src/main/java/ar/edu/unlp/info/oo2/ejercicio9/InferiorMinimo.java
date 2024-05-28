package ar.edu.unlp.info.oo2.ejercicio9;

public class InferiorMinimo implements EstadoExcursion{

	@Override
	public void inscribir(Excursion contexto, Persona unUsuario) {
		if(contexto.alcanzoMinimo()) {
			contexto.setEstado(new Minimo());
		}
		contexto.agregarInscripto(unUsuario);	
	}

	@Override
	public String obtenerInformacion() {
		return "Estas en debajo del cupo minimo";
	}

}
