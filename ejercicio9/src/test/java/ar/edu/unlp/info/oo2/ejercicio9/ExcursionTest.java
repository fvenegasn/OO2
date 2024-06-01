package ar.edu.unlp.info.oo2.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {

	private Persona usuario1;
	private Persona usuario2;
	private Persona usuario3;
	private Excursion excursion;
	
	@BeforeEach
	void setUp() {
		usuario1 = new Persona("Fabo");
		usuario2 = new Persona("Fran");
		excursion = new Excursion("Dos dias kayak bajando el Paraná", LocalDate.of(2024, 5, 25), 
									LocalDate.of(2024, 5, 27), "La facu", 10000.00, 1,2);
		// inferiorminimo
		excursion.inscribir(usuario1);
		// minimo
		excursion.inscribir(usuario2);
		// maximo
	}
	
	@Test
	void excursionTest() {
		// como esta en maximo a nector si o si lo manda a la espera
		usuario3 = new Persona("Nector");
		excursion.inscribir(usuario3);
		System.out.println(excursion.obtenerInformacion());
		assertEquals(2,excursion.getInscriptos().size());
		assertEquals(1,excursion.getEspera().size());
		assertTrue(excursion.getEstado() instanceof Maximo);
	}
}
