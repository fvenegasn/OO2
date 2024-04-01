package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;
import org.json.simple.*;

public class JSONAdapter extends VoorheesExporter {
	
	private JSONObject exportar(Socio socio) {
		JSONObject asociado = new JSONObject();
		asociado.put("nombre", socio.getNombre());
		asociado.put("email", socio.getEmail());
		asociado.put("legajo", socio.getLegajo());
		return asociado;
	}
	
	@Override
	public String exportar(List<Socio> socios) {
		if (socios.isEmpty()) {
			return "[]";
		}
		
		JSONArray jsonArray = new JSONArray();
		
		socios.forEach(socio -> {
			jsonArray.add(exportar(socio));
		});

		return jsonArray.toJSONString();
	}
}
