package ar.edu.unlp.info.oo2.ejercicio6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {

	// declaras
	private Topografia agua,tierra,mixta1, mixta2, mixta3, mixta4;
	private Simple water, water2,dirt;
	
	
	// inicializas
	@BeforeEach
	void setUp() {
		agua = new Mixta();
		tierra = new Mixta();
		mixta1 = new Mixta();
		mixta2 = new Mixta();
		mixta3 = new Mixta();
		mixta4 = new Mixta();
		water = new Agua();
		water2 = new Agua();
		dirt = new Tierra();
		
		agua.agregar(water);
		agua.agregar(water);
		agua.agregar(water);
		agua.agregar(water);
		
		tierra.agregar(dirt);
		tierra.agregar(dirt);
		tierra.agregar(dirt);
		tierra.agregar(dirt);
		
		mixta1.agregar(water);
		mixta1.agregar(dirt);
		mixta1.agregar(water);
		mixta1.agregar(dirt);
		
		mixta2.agregar(water);
		mixta2.agregar(dirt);
		mixta2.agregar(dirt);
		mixta2.agregar(mixta1);
		
		mixta3.agregar(water);
		mixta3.agregar(dirt);
		mixta3.agregar(water);
		mixta3.agregar(dirt);
		
		mixta4.agregar(water);
		mixta4.agregar(dirt);
		mixta4.agregar(dirt);
		mixta4.agregar(mixta1);
	}
	
	// testeas
	@Test
	void calcularProporciones() {
		assertEquals(1.0, agua.calcular());
		assertEquals(0.0, tierra.calcular());
		assertEquals(0.5, mixta1.calcular());
		assertEquals(0.375, mixta2.calcular());
		assertEquals(1, water.calcular());
	}
	
	@Test
	void compararTopografias() {
		assertTrue(mixta1.comparar(mixta3));
		assertFalse(mixta1.comparar(mixta2));
		assertTrue(mixta3.comparar(mixta1));
		assertTrue(water.comparar(water2));
		assertFalse(mixta2.comparar(mixta3));
		assertTrue(mixta4.comparar(mixta2));
	}
	
	
}
