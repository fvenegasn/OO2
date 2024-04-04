package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;
import org.json.simple.*;

public class JSONAdapter extends VoorheesExporter {
	
	/*
	Aca esta bien que herede a Vorhees, ya que no lo puedo modificar
	y, por ello, no me queda otra. Como regla general, cuando no podes
	tocar o el target o el adaptado (Adaptee), debes heredar. Si es
	codigo propio o modificable, es posible generar una interfaz en el
	medio que permita implementar el patron 
	*/
	
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
