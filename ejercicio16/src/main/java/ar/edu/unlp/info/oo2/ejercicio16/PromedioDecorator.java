package ar.edu.unlp.info.oo2.ejercicio16;

public class PromedioDecorator extends WeatherDecorator{

	public PromedioDecorator(WeatherData componente) {
		super(componente);
	}

	
	@Override
	public String displayData() {
		return this.componente.displayData()+"Promedio: "+ this.componente.getTemperaturas().stream().mapToDouble(temperatura -> temperatura).average().orElse(0);
	}
	
}
