package ar.edu.unlp.info.oo2.ejercicio7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileSystemTest {
	private Archivo a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
	private Directorio d1,d2,d3,d4;
	private List<FileSystem>lista;
	
	@BeforeEach
	void setUp() {
		a2=new Archivo("fifa 16");
		a3=new Archivo("fifa 15");
		a4=new Archivo("geometry dash");
		a5=new Archivo("fifa 18");
		a6=new Archivo("fifa 19");
		a7=new Archivo("chrome");
		a8=new Archivo("mozilla");
		a9=new Archivo("opera");
		a10=new Archivo("fifa");
		
		d1=new Directorio("fifa");
		d2=new Directorio("navegadores");
		d3=new Directorio("fifa");
		d4=new Directorio("pes");
		
		d1.agregarArchivo(a2);
		d1.agregarArchivo(a3);
		
		d2.agregarArchivo(a7);
		d2.agregarArchivo(a8);
		d2.agregarArchivo(a9);
		
		
		d3.agregarArchivo(a5);
		d3.agregarArchivo(a6);
		
		d4.agregarArchivo(d1);
		d4.agregarArchivo(d2);
		d4.agregarArchivo(d3);

		

	}
	
	@Test
	void tamanoTotalTest() {
		assertEquals(224,d4.tamanoTotalOcupado());
		assertEquals(64,d1.tamanoTotalOcupado());
		assertEquals(96,d2.tamanoTotalOcupado());
		assertEquals(64,d3.tamanoTotalOcupado());
	}
	
	@Test 
	void archivoMasGrandeTest() {
		a6.setTamano(69);
		assertEquals(a6,d4.archivoMasGrande());
	}
	
	/*@Test
	void archivoMasNuevoTest() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		a1=new Archivo("whatsApp");
		assertNotEquals(a1.getNombre(),d4.archivoMasNuevo().getNombre());
		assertEquals(a9.getNombre(),d4.archivoMasNuevo().getNombre());
	}*/
	
	@Test
	void buscarTest() {
		assertEquals(d2,d4.buscar("navegadores"));
		assertNull(d4.buscar("fifo"));
	}
	
	@Test
	void buscarTodosTest() {
		lista=new ArrayList<FileSystem>();
		lista.add(d1); lista.add(d3); lista.add(a10);
		d4.agregarArchivo(a10);
		assertEquals(lista,d4.buscarTodos("fifa"));
	}
	
	@Test
	void listarContenido() {
		assertTrue(d4.listarContenido().equals("fifa/navegadores/fifa"));
	}
	
}
