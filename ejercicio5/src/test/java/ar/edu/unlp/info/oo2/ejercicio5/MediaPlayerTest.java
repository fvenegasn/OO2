package ar.edu.unlp.info.oo2.ejercicio5;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MediaPlayerTest {

	// ----------- N/A
	
	// declaras
	private Media audio;
	private Media videoFile;
	private Media videoStream;
	private List<Media> multimedia;
	private MediaPlayer sistema;
	
	// inicializas
	@BeforeEach
	void setUp() {
		audio = new Audio();
		videoFile = new VideoFile();
		videoStream = new VideoStreamAdapter();
		multimedia = new ArrayList<Media>();
		multimedia.add(audio);
		multimedia.add(videoFile);
		multimedia.add(videoStream);
		sistema = new MediaPlayer(multimedia);
	}
	
	@Test
	// testeas
	void multimediaTest() {
		sistema.play();
	}
}
