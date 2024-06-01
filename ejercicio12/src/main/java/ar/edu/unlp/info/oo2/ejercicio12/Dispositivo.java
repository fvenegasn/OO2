package ar.edu.unlp.info.oo2.ejercicio12;

public class Dispositivo {

	private Ringer ringer;
	private CRC_Calculator crcCalculator;
	private Connection connection;
	private Display display;

	public Dispositivo(Ringer ringer, CRC_Calculator crcCalculator, Connection connection, Display display) {
		super();
		this.ringer = ringer;
		this.crcCalculator = crcCalculator;
		this.connection = connection;
		this.display = display;
	}

	public String send(String data) {
		long crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}

	public void changeConnection(Connection connection) {
		this.connection = connection;
		System.out.println(connection.pict());
		System.out.println(ringer.ring());
	}

	public void changeCRC(CRC_Calculator crc) {
		this.crcCalculator = crc;
	}

	public CRC_Calculator getCrcCalculator() {
		return crcCalculator;
	}

	public void setCrcCalculator(CRC_Calculator crcCalculator) {
		this.crcCalculator = crcCalculator;
	}
	
	
}
