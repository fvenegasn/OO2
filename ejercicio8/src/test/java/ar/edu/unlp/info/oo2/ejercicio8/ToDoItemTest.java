package ar.edu.unlp.info.oo2.ejercicio8;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


//tests sacados de github.com/agusrnfr 
public class ToDoItemTest {
	private ToDoItem tareaIniciada;
	private ToDoItem tareaSinIniciar;
	private ToDoItem tareaTerminada;
	private ToDoItem tareaPausada;

	
	@BeforeEach
	public void setUp() throws Exception {
		this.tareaIniciada = new ToDoItem("tarea1");
		this.tareaSinIniciar = new ToDoItem("tarea2");
		this.tareaTerminada = new ToDoItem("tarea3");
		this.tareaPausada = new ToDoItem("tarea4");
		this.tareaIniciada.start();
		this.tareaTerminada.start();
		this.tareaTerminada.finish();
		this.tareaPausada.start();
		this.tareaPausada.togglePause();
	}
	
	@Test
	public void testStart() {
		assertTrue(this.tareaIniciada.getState() instanceof InProgress);
		assertTrue(this.tareaSinIniciar.getState() instanceof Pending);
		this.tareaTerminada.start();
		assertTrue(this.tareaTerminada.getState() instanceof Finished);
		this.tareaPausada.start();
		assertTrue(this.tareaPausada.getState() instanceof Paused);
	}
	
	public void testTogglePause() {
		this.tareaPausada.togglePause();
		assertTrue(this.tareaPausada.getState() instanceof InProgress);
		this.tareaIniciada.togglePause();
		assertTrue(this.tareaIniciada.getState() instanceof Paused);
	    Exception exceptionFinished = assertThrows(RuntimeException.class, () -> {this.tareaTerminada.togglePause();});
	    assertEquals("ERROR: Intentaste despausar en estado finalizado.",exceptionFinished.getMessage());
	    Exception exceptionPending = assertThrows(RuntimeException.class, () -> {this.tareaSinIniciar.togglePause();});
	    assertEquals("ERROR: Intentaste despausar en estado pendiente.",exceptionPending.getMessage());
	}
	
	@Test
	public void testFinished() {
		assertTrue(this.tareaTerminada.getState() instanceof Finished);
		this.tareaIniciada.finish();
		assertTrue(this.tareaIniciada.getState() instanceof Finished);
		this.tareaSinIniciar.finish();
		assertTrue(this.tareaSinIniciar.getState() instanceof Pending);
		this.tareaPausada.finish();
		assertTrue(this.tareaPausada.getState() instanceof Finished);
		
	}
	
	@Test
	public void testWorkedTime() {
		Exception exceptionPending = assertThrows(RuntimeException.class, () -> {this.tareaSinIniciar.workedTime();});
		assertEquals("ERROR: the task never started",exceptionPending.getMessage());
		this.tareaTerminada.setComienzo(LocalDateTime.of(2023, 3, 31, 15, 32, 0));
		this.tareaTerminada.setFin(LocalDateTime.of(2023, 3, 31, 16, 32, 30));
		assertEquals(3630,this.tareaTerminada.workedTime().getSeconds());
	}

	@Test
	public void testAddComment() {
		this.tareaIniciada.addComment("Hola esto es un comentario");
		this.tareaIniciada.addComment("Hola esto es 2do comentario");
		assertEquals("Hola esto es un comentario",this.tareaIniciada.getComments().get(0));
		assertEquals("Hola esto es 2do comentario",this.tareaIniciada.getComments().get(1));
		
		this.tareaSinIniciar.addComment("Hola esto es un comentario");
		this.tareaSinIniciar.addComment("Hola esto es 2do comentario");
		assertEquals("Hola esto es un comentario",this.tareaSinIniciar.getComments().get(0));
		assertEquals("Hola esto es 2do comentario",this.tareaSinIniciar.getComments().get(1));
		
		this.tareaPausada.addComment("Hola esto es un comentario");
		this.tareaPausada.addComment("Hola esto es 2do comentario");
		assertEquals("Hola esto es un comentario",this.tareaPausada.getComments().get(0));
		assertEquals("Hola esto es 2do comentario",this.tareaPausada.getComments().get(1));
		
		this.tareaTerminada.addComment("Hola esto es un comentario");
		assertEquals(1,this.tareaTerminada.getComments().size());
	}
}
