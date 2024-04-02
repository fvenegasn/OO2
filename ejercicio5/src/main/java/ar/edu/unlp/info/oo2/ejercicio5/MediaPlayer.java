package ar.edu.unlp.info.oo2.ejercicio5;

import java.util.List;

public class MediaPlayer {

	private List<Media> media;
	
	public MediaPlayer(List<Media> media) {
		this.media = media;
	}

	public void play() {
		// stream recorriendo media o afines
		for (Media multimedia: media) {
			multimedia.play();
		}
	}
}
