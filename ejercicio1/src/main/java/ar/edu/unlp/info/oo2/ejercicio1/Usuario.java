package ar.edu.unlp.info.oo2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String screenName;
	private List<Posteo> posteos;
	
	public Usuario(String screenName) {
		this.screenName = screenName;
		this.posteos = new ArrayList<Posteo>();
	}
	
	public void retweetear(Posteo tweet) {
		Posteo rt = new Retweet(tweet.getDuenio(), tweet);
		posteos.add(rt);
	}
	
	public void tweetear(String texto) {
		Posteo tw = new Tweet(this, texto);
		
	}
	

}
