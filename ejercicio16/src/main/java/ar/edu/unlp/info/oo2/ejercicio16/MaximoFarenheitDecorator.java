package ar.edu.unlp.info.oo2.ejercicio16;

public class MaximoFarenheitDecorator extends WeatherDecorator{

	public MaximoFarenheitDecorator(WeatherData componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayData() {
		return "Maximo: "+this.componente.getTemperaturas().stream().mapToDouble(temperatura -> temperatura).max().orElse(0);
	}
	

}
