package ar.edu.unlp.info.oo2.ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {
	
	private Etapa estado;
	private String nombre;
	private LocalDate inicio;
	private LocalDate fin;
	private String objetivo;
	private int integrantes;
	private double margenGanancia;
	private double montoPorIntegrante;
	
	
	public Proyecto(String nombre, LocalDate inicio, LocalDate fin, String objetivo, int integrantes,
			 double montoPorIntegrante) {
		super();
		this.nombre = nombre;
		this.inicio = inicio;
		this.fin = fin;
		this.objetivo = objetivo;
		this.integrantes = integrantes;
		margenGanancia = 0.07;
		this.montoPorIntegrante = montoPorIntegrante;
		estado=new EnConstruccion();
	}
	
	public void aprobarEtapa() {
		estado.aprobarEtapa(this);
	}
	
	public double costoDelProyecto() {
		return this.integrantes*this.montoPorIntegrante*(ChronoUnit.DAYS.between(inicio, fin));
	}
	
	public double precioDelProyecto() {
		return this.costoDelProyecto()-(this.costoDelProyecto()*this.margenGanancia);
	}
	
	public void modificarMargenGanancia(double margen) {
		estado.modificarMargenGanancia(this,margen);
	}
	
	public void cancelarProyecto() {
		estado.cancelarProyecto(this);
	}
	
	public void setEstado(Etapa estado) {
		this.estado=estado;
	}
	
	public Etapa getEstado() {
		return this.estado;
	}
	
	public void setMargenGanancia(double margenGanancia) {
		this.margenGanancia=margenGanancia;
	}
	
	
	
	

}
