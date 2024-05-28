package ar.edu.unlp.info.oo2.ejercicio9;

public class Minimo implements EstadoExcursion{

	@Override
	public void inscribir(Excursion contexto, Persona unUsuario) {
		if(contexto.alcanzoMaximo()) {
			contexto.setEstado(new Maximo());
			contexto.agregarEspera(unUsuario);
		}
		else {
			contexto.agregarInscripto(unUsuario);
		}
	}

	@Override
	public String obtenerInformacion() {
		// TODO Auto-generated method stub
		return "estas en el limbo";
	}

}
