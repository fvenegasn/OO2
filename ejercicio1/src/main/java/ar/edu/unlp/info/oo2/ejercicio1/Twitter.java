package ar.edu.unlp.info.oo2.ejercicio1;

import java.util.List;

public class Twitter {
	
	private List<Usuario> usuarios;
	
	public void agregarUsuario(String alias) {
		//falta validar si existe
		Usuario usuario = new Usuario(alias);
		usuarios.add(usuario);
	}	
	
	public void borrarUsuario(Usuario usuario) {
		usuarios.remove(usuario);
		//validar si se elimina con esa sentencia
		//la referencia de los rts o hay que hacer
		//otra cosa
	}
	
}
