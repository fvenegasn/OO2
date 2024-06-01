package ar.edu.unlp.info.oo2.ejercicio12;

import java.util.zip.CRC32;

public class CRC32_Calculator implements CRC_Calculator{

	@Override
	public long crcFor(String data) {
		CRC32 crc = new CRC32();
		crc.update(data.getBytes());
		long result = crc.getValue();
		return result;
	}

}
