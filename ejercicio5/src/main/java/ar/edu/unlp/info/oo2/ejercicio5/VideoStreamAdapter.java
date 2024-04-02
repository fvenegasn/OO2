package ar.edu.unlp.info.oo2.ejercicio5;

public class VideoStreamAdapter extends Media {
	
	private VideoStream adaptee;
	
	public VideoStreamAdapter() { // asi está bien o lo asigno desde setter?
		adaptee = new VideoStream();
	}
	
	@Override
	public void play() {
		adaptee.reproduce(); // esto estaría bien? cumple el objetivo de adaptar?
	}
	
}
