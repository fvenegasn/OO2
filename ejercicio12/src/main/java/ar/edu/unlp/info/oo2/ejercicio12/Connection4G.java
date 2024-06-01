package ar.edu.unlp.info.oo2.ejercicio12;

public class Connection4G {	
	private String symb;
	
	
	public Connection4G(String symb) {
		super();
		this.symb = symb;
	}

	public String transmit(String data,long crc) {
		return "DATA4G";
	}

	public String getSymb() {
		return symb;
	}


}
