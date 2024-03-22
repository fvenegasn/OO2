package ar.edu.unlp.info.oo2.ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class JugadaTest {

	//declaras
	Jugada jugador1 = new Piedra();
	Jugada jugador2 = new Papel();
	
	Jugada jugador3 = new Lagarto();
	Jugada jugador4 = new Spock();
	
	//inicias
	void setUp() {
		// n/a
	}
	
	//probas
	@Test
	void TestParte1() {
		//assertEquals("gana", jugador1.jugarContraPapel());
		
		// devuelve el resultado desde la perspectiva del jugador 2
		assertEquals("gana",jugador1.quienGano(jugador2));
		
		// devuelve el resultado desde la perspectiva del jugador 1
		assertEquals("pierde",jugador2.quienGano(jugador1));
		
		assertEquals("empata",jugador1.quienGano(jugador1));
	}
	
	@Test
	void TestParte2() {
		
		//idem resultado
		assertEquals("pierde",jugador3.quienGano(jugador4));
		
		assertEquals("gana",jugador4.quienGano(jugador2));
	}
}
