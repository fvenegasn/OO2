package ar.edu.unlp.info.oo2.ejercicio16;

public class MaximoCelsiusDecorator extends WeatherDecorator{

	public MaximoCelsiusDecorator(WeatherData componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String displayData() {
		return this.componente.displayData()+"Maximo: "+this.componente.getTemperaturas().stream().mapToDouble(temperatura -> ((temperatura-32)/1.8)).max().orElse(0);
	}
	

}