package ar.edu.unlp.info.oo2.ejercicio1;

public class Tweet extends Posteo{
	
	private String texto;
	
	public Tweet(Usuario usuario, String texto) {
		super(usuario);
		this.texto = texto; // falta validar caracteres
	}
}
