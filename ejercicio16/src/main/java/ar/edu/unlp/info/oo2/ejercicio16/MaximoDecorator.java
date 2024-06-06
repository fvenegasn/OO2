package ar.edu.unlp.info.oo2.ejercicio16;

public class MaximoDecorator extends WeatherDecorator{

	public MaximoDecorator(WeatherData componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayData() {
		return this.componente.displayData()+"Maximo: "+this.componente.getTemperaturas().stream().mapToDouble(temperatura -> temperatura).max().orElse(0);
	}
	

}
