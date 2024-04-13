package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonAdapter extends VoorheesExporter {

	private ObjectMapper exportar(Socio socio) {
		ObjectMapper mapper = new ObjectMapper(); 
		
		// esto de try catch me lo pedía para no romper
		
		try {
			mapper.writeValueAsString("nombre: "+ socio.getNombre());
			mapper.writeValueAsString("email"+socio.getEmail());
			mapper.writeValueAsString("legajo: "+socio.getLegajo());
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mapper;
	}
	
	// no se si anda pero tampoco hay mucha info en internet de cómo hacer este
	@Override
	public String exportar(List<Socio> socios) {
		if (socios.isEmpty()) {
			return "[]";
		}
		String separator = System.lineSeparator();
		StringBuilder buffer = new StringBuilder("[" + separator);
		socios.forEach(socio -> {
			buffer.append(this.exportar(socio))
				.append(",")
				.append(separator);
		});
		// remueve la última coma y fin de línea
		buffer.setLength(buffer.length() - (separator.length() + 1));
		buffer.append(separator).append("]");
		return buffer.toString();
	}
	
}
