package ar.edu.unlp.info.oo2.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdministradorDeProyectosTest {
	
	private Proyecto proyecto,proyectoEnCero;
	
	
	@BeforeEach
	void setUp() {
		proyecto = new Proyecto("Vacaciones de invierno",LocalDate.of(2024, 5, 10),LocalDate.of(2024, 5, 15),"salir con amigos",3,10000);
		proyectoEnCero=new Proyecto("Vacaciones de invierno",LocalDate.of(2024, 5, 10),LocalDate.of(2024, 5, 15),"salir con amigos",0,0);
	}
	
	@Test
	void proyectoTest() {
		
    	Exception exception = assertThrows(RuntimeException.class, () -> {
    		proyectoEnCero.aprobarEtapa();
        });
    	assertTrue(exception.getMessage().equals("El precio del proyecto es 0 en la etapa en construccion."));
		
		assertTrue(proyecto.getEstado() instanceof EnConstruccion);
		assertEquals(proyecto.costoDelProyecto(),150000);
		assertEquals(proyecto.precioDelProyecto(),139500);
		
		proyecto.aprobarEtapa();
		
		//flujo normal sin testear  el error que tira cuando precio es cero
		assertTrue(proyecto.getEstado() instanceof EnEvaluacion);
		
		proyecto.modificarMargenGanancia(0.12);
		assertNotEquals(proyecto.precioDelProyecto(),139500);
		
		proyecto.aprobarEtapa();
		assertTrue(proyecto.getEstado() instanceof Confirmada);
		
		proyecto.cancelarProyecto();
		assertTrue(proyecto.getEstado() instanceof Cancelada);
	}
	
	

}
