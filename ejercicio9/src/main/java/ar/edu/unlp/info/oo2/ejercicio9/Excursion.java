package ar.edu.unlp.info.oo2.ejercicio9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private List<Persona> inscriptos;
	private List<Persona> espera;
	private EstadoExcursion estado;
	
	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoEncuentro, double costo,
			int cupoMinimo, int cupoMaximo) {
		super();
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoEncuentro = puntoEncuentro;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.inscriptos=new ArrayList<Persona>();
		this.espera=new ArrayList<Persona>();
		this.estado=new InferiorMinimo();
	}
	
	public void inscribir(Persona unUsuario) {
		estado.inscribir(this,unUsuario);
		
	}
	
	public void agregarInscripto(Persona unUsuario) {
		this.inscriptos.add(unUsuario);
	}
	
	public void agregarEspera(Persona unUsuario) {
		this.espera.add(unUsuario);
	}
	
	public boolean alcanzoMinimo() {
		return inscriptos.size()>=this.cupoMinimo;
	}
	
	public boolean alcanzoMaximo() {
		return inscriptos.size()>=this.cupoMaximo;
	}
	
	

	public void setEstado(EstadoExcursion estado) {
		this.estado = estado;
	}

	public String obtenerInformacion() {
		return estado.obtenerInformacion();
	}
	


	
	

}
