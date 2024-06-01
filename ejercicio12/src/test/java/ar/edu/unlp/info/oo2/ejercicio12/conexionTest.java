package ar.edu.unlp.info.oo2.ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class conexionTest {
	
	private Dispositivo dispositivo;
	
	@BeforeEach
	void setUp() {
		dispositivo=new Dispositivo(new Ringer(),new CRC16_calculator(),new ConnectionWifi(),new Display());
	}
	
	@Test
	void testGeneral() {
		assertEquals(dispositivo.send("auauau"),"DATAWIFI");
		dispositivo.changeConnection(new Adapter4G(new Connection4G("EL SIMBOLO")));
		dispositivo.changeCRC(new CRC32_Calculator());
		assertTrue(dispositivo.getCrcCalculator() instanceof CRC32_Calculator);
	}

}
