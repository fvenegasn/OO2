package ar.edu.unlp.info.oo2.ejercicio17;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConstructorTest {
	
	private DirectorSilver director;
		
	@BeforeEach
	void setUp() {
		director = new DirectorSilver();
	}
	
	@Test
	void testConstructor1() {
		director.construirProducto1();
		assertEquals(director.getConstructor().retornoInversion(10000),);
	}
}
