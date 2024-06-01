package ar.edu.unlp.info.oo2.ejercicio12;

public class ConnectionWifi implements Connection{

	@Override
	public String sendData(String data, long crc) {
		return "DATAWIFI";
	}

	@Override
	public String pict() {
		return "PICWIFI";
	}

}
