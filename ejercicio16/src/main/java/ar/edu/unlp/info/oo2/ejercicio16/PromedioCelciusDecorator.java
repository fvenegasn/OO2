package ar.edu.unlp.info.oo2.ejercicio16;

public class PromedioCelciusDecorator extends WeatherDecorator{
	
	public PromedioCelciusDecorator(WeatherData componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayData() {
		return this.componente.displayData()+"Promedio: "+ this.componente.getTemperaturas().stream().mapToDouble(temperatura ->(( temperatura - 32)/1.8)).average().orElse(0);
	}

}
