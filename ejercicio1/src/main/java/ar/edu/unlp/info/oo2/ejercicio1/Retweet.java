package ar.edu.unlp.info.oo2.ejercicio1;

public class Retweet extends Posteo{
	
	private Posteo origen;
	
	public Retweet(Usuario usuario, Posteo origen) {
		super(usuario);
		this.origen = origen;
	}
}
