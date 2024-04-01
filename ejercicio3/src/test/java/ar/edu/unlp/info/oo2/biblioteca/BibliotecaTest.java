package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	
	private Biblioteca biblioteca;
	
	@BeforeEach
	void setUp() {
		biblioteca = new Biblioteca();
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		
	}
	
	@Test
	void imprimirTest() {
		System.out.print("AAAAAAAAAAAAAAAAAA: "+ biblioteca.getExporter());
		assertTrue(biblioteca.exportarSocios().contains("[\n"
				+ "	{\n"
				+ "		\"nombre\": \"Arya Stark\",\n"
				+ "		\"email\": \"needle@stark.com\",\n"
				+ "		\"legajo\": \"5234-5\"\n"
				+ "	},\n"
				+ "	{\n"
				+ "		\"nombre\": \"Tyron Lannister\",\n"
				+ "		\"email\": \"tyron@thelannisters.com\",\n"
				+ "		\"legajo\": \"2345-2\"\n"
				+ "	}\n"
				+ "]"));
		
	}
	@Test 
	void imprimir(){
		   assertEquals(biblioteca.exportarSocios(),"[\n"
			  		+ "	{\n"
			  		+ "		\"nombre\": \"Arya Stark\",\n"
			  		+ "		\"email\": \"needle@stark.com\",\n"
			  		+ "		\"legajo\": \"5234-5\"\n"
			  		+ "	},\n"
			  		+ "	{\n"
			  		+ "		\"nombre\": \"Tyron Lannister\",\n"
			  		+ "		\"email\": \"tyron@thelannisters.com\",\n"
			  		+ "		\"legajo\": \"2345-2\"\n"
			  		+ "	}\n"
			  		+ "]");
		
	}
}
