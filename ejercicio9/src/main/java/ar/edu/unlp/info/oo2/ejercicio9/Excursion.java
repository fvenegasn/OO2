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
		return estado.obtenerInformacion(this);
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}

	public double getCosto() {
		return costo;
	}

	public int getCupoMinimo() {
		return cupoMinimo;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}

	public List<Persona> getInscriptos() {
		return inscriptos;
	}

	public List<Persona> getEspera() {
		return espera;
	}

	public EstadoExcursion getEstado() {
		return estado;
	}
	
	public int faltantesMinimo() {
		return this.cupoMinimo-this.inscriptos.size();
	}
	
	public int faltantesMaximo() {
		return this.cupoMaximo-this.inscriptos.size();
	}
}
