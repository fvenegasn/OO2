package ar.edu.unlp.info.oo2.ejercicio16;

public class MinimoCelciusDecorator extends WeatherDecorator{

	public MinimoCelciusDecorator(WeatherData componente) {
		super(componente);
	}

	@Override
	public String displayData() {
		return this.componente.displayData()+"Minimo: "+this.componente.getTemperaturas().stream().mapToDouble(temperatura -> ((temperatura-32)/1.8)).min().orElse(0);
	}
	

}
