package ar.edu.unlp.info.oo2.ejercicio16;

public class CelciusDecorator extends WeatherDecorator{

	public CelciusDecorator(WeatherData componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayData() {
		// TODO Auto-generated method stub
		return this.componente.displayData()+"Temperatura C: "+((this.componente.getTemperatura()-32)/1.8);
	}

}
