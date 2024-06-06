package ar.edu.unlp.info.oo2.ejercicio16;

public class MinimoDecorator extends WeatherDecorator{

	public MinimoDecorator(WeatherData componente) {
		super(componente);
	}

	@Override
	public String displayData() {
		return this.componente.displayData()+"Minimo: "+this.componente.getTemperaturas().stream().mapToDouble(temperatura -> temperatura).min().orElse(0);
	}

}
