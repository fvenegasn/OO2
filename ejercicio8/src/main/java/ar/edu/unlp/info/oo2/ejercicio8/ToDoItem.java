package ar.edu.unlp.info.oo2.ejercicio8;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem /*implements Estado <-- NO lo implemento por los parametros que recibe*/{ 
	
	private Estado estado;
	private String name;
	private List<String> comments;
	private LocalDateTime comienzo;
	private LocalDateTime fin;
	
	
	/**
	* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
	*/
	        public ToDoItem(String name) {
	        	this.name=name;
	        	this.comments=new ArrayList<String>();
	        	this.setEstado(new Pending());
	        }

	   	/**
	* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
	* pending. Si se encuentra en otro estado, no hace nada.
	*/
	        public void start() {
	        	estado.start(this);
	        }

		/**
	* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
	* estado es paused. Caso contrario (pending o finished) genera un error
	* informando la causa específica del mismo.
	*/
	        public void togglePause() {
	        	estado.togglePause(this);
	        }


		/**
	* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
	* in-progress o paused. Si se encuentra en otro estado, no hace nada.
	*/
	        public void finish() {
	        	estado.finish(this);
	        }
	        


		/**
	* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
	* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
	* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
	* genera un error informando la causa específica del mismo.
	*/
			public Duration workedTime() { 
	        	return this.estado.workedTime(this);
	     }
	        
	        public void setEstado(Estado estado) {
	        	this.estado=estado;
	        }
	        
	        public void addComment(String comment) {
	        	this.comments.add(comment);
	        }

	        public Estado getState() {
	        	return this.estado;
	        }

			public LocalDateTime getComienzo() {
				return comienzo;
			}

			public void setComienzo(LocalDateTime comienzo) {
				this.comienzo = comienzo;
			}

			public LocalDateTime getFin() {
				return fin;
			}

			public void setFin(LocalDateTime fin) {
				this.fin = fin;
			}

			public List<String> getComments() {
				return comments;
			}
			

			
	        
	        
}
