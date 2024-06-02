package ar.edu.unlp.info.oo2.ejercicio16;

public class MinimoFarenheitDecorator extends WeatherDecorator{

	public MinimoFarenheitDecorator(WeatherData componente) {
		super(componente);
	}

	@Override
	public String displayData() {
		return "Minimo: "+this.componente.getTemperaturas().stream().mapToDouble(temperatura -> temperatura).min().orElse(0);
	}

}
