package ar.edu.unlp.info.oo2.ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileOO2Test {

	//declaras
	private FileOO2 archivo;
	
	@BeforeEach
	void setUp() {
		archivo = new File("OO2", "exe", "03.03.2024", "05.05.2024", "RWX","32MB");
	}
	
	@Test
	//testeas
	void testFileOrder1() {
		// orden 1
		assertNotEquals("OO2exe", archivo.prettyPrint());
		archivo = new Extension(archivo); 
		archivo = new Nombre(archivo);
		assertEquals("OO2exe", archivo.prettyPrint());
	}
	
	@Test
	void testFileOrder2() {
		// orden 2
		assertNotEquals("OO2exe03.03.2024", archivo.prettyPrint());
		archivo = new Creacion(archivo);
		archivo = new Extension(archivo); 
		archivo = new Nombre(archivo);
		assertEquals("OO2exe03.03.2024", archivo.prettyPrint());
	}
	
	@Test
	void testFileOrder3() {
		// orden 3
		assertNotEquals("RWXOO2exe32MB", archivo.prettyPrint());
		archivo = new Tamanio(archivo);
		archivo = new Extension(archivo);
		archivo = new Nombre(archivo);
		archivo = new Permisos(archivo);
		assertEquals("RWXOO2exe32MB", archivo.prettyPrint());
	}
	
}
