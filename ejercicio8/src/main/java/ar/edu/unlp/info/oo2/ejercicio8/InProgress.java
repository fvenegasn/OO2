package ar.edu.unlp.info.oo2.ejercicio8;

import java.time.Duration;
import java.time.LocalDateTime;

public class InProgress implements Estado{
	
   	/**
* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
* pending. Si se encuentra en otro estado, no hace nada.
*/
        public void start(ToDoItem toDoItem) {
        	//nada
        }

	/**
* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
* estado es paused. Caso contrario (pending o finished) genera un error
* informando la causa específica del mismo.
*/
        public void togglePause(ToDoItem toDoItem) {
        	toDoItem.setEstado(new Paused());
        }


	/**
* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
* in-progress o paused. Si se encuentra en otro estado, no hace nada.
*/
        public void finish(ToDoItem toDoItem) {
        	toDoItem.setEstado(new Finished());
        	toDoItem.setFin(LocalDateTime.now());
        }
        
    	public Duration workedTime(ToDoItem toDoItem) {
    		return Duration.between(toDoItem.getComienzo(),toDoItem.getFin());
    	}

}
