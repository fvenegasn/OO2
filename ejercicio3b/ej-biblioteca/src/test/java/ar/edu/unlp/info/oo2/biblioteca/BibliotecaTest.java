package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
    
    private Biblioteca biblioteca;
    private JSONAdapter exportar;
    
    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
        exportar = new JSONAdapter();
    	//biblioteca.setExporter(exportar);
        biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
        biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
        
    }
    
    @Test
    void exporterTest() {
    	// valida que el exporter sea JSON y no Voorhees
        //assertNotEquals(exportar, biblioteca.getExporter());
    	//System.out.print("AAAAAAAAAAAAAAAAAA: "+ biblioteca.getExporter());
        assertTrue(biblioteca.getExporter().toString().contains("VoorheesExporter"));
        biblioteca.setExporter(exportar);
        assertTrue(biblioteca.getExporter().toString().contains("JSONAdapter"));
        //System.out.print("AAAAAAAAAAAAAAAAAA: "+ biblioteca.getExporter());    
    }
    @Test 
    void imprimir(){

        // a desarrollar cuando sepamos si está bien el del 3 normal
    }


}