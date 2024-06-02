package ar.edu.unlp.info.oo2.ejercicio16;

public class PromedioFarenheitDecorator extends WeatherDecorator{

	public PromedioFarenheitDecorator(WeatherData componente) {
		super(componente);
	}

	
	@Override
	public String displayData() {
		return "Promedio: "+ this.componente.getTemperaturas().stream().mapToDouble(temperatura -> temperatura).average().orElse(0);
	}
	
}
