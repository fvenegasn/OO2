package ar.edu.unlp.info.oo2.ejercicio12;

public class Adapter4G implements Connection{

	private Connection4G adaptee;
	
	
	
	public Adapter4G(Connection4G adaptee) {
		super();
		this.adaptee = adaptee;
	}

	@Override
	public String sendData(String data, long crc) {
		
		return adaptee.transmit(data, crc);
	}

	@Override
	public String pict() {
		return adaptee.getSymb();
	}

}
