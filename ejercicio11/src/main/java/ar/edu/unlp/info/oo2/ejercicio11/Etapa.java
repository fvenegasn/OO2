package ar.edu.unlp.info.oo2.ejercicio11;

public abstract class Etapa {
	
	public abstract void aprobarEtapa(Proyecto contexto);
	
	public abstract void modificarMargenGanancia(Proyecto contexto,double margen);
	
	public void cancelarProyecto(Proyecto contexto) {
		contexto.setEstado(new Cancelada());
	}
	
	
	//Esto nose si va, el proyecto deberia retornarlo.
	public double costoDelProyecto(Proyecto contexto) {
		return contexto.costoDelProyecto();
	}
	
	public double precioDelProyecto(Proyecto contexto) {
		return contexto.precioDelProyecto();
	}

}
