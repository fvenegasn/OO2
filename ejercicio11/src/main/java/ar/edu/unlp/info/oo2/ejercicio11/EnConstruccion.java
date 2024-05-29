package ar.edu.unlp.info.oo2.ejercicio11;

public class EnConstruccion extends Etapa{
	
	
	
	
	@Override
	public void aprobarEtapa(Proyecto contexto) {
		if(contexto.precioDelProyecto() == 0) {
			throw new RuntimeException("El precio del proyecto es 0 en la etapa en construccion.");
		}
		else {
			contexto.setEstado(new EnEvaluacion());
		}
		
	}

	@Override
	public void modificarMargenGanancia(Proyecto contexto,double margen) {
		if(margen >= 0.08 && margen <= 0.10) {
			contexto.setMargenGanancia(margen);
		}
		//else nada
	}



}
