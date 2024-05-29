package ar.edu.unlp.info.oo2.ejercicio11;

public class EnEvaluacion extends Etapa{
	
	
	//hacer EnEvaluacion, y los tests
	
	@Override
	public void aprobarEtapa(Proyecto contexto) {
		contexto.setEstado(new Confirmada());
		
	}

	@Override
	public void modificarMargenGanancia(Proyecto contexto,double margen) {
		if(margen >= 0.11 && margen <= 0.15) {
			contexto.setMargenGanancia(margen);
		}
		//else nada
	}


}
