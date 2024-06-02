package ar.edu.unlp.info.oo2.ejercicio16;

public class FarenheitDecorator extends WeatherDecorator{

	public FarenheitDecorator(WeatherData componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayData() {
		// TODO Auto-generated method stub
		return "Temperatura F: "+this.componente.getTemperatura();
	}

}
