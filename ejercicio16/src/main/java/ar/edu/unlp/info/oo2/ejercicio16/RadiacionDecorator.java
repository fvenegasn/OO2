package ar.edu.unlp.info.oo2.ejercicio16;

public class RadiacionDecorator extends WeatherDecorator{

	public RadiacionDecorator(WeatherData componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayData() {
		return this.componente.displayData()+"Radiacion solar: "+this.componente.getRadiacionSolar();
	}

	
}
