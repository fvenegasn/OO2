package ar.edu.unlp.info.oo2.ejercicio16;

import java.util.List;

public abstract class WeatherDecorator implements WeatherData{
	
	protected WeatherData componente;
	
	
	
	public WeatherDecorator(WeatherData componente) {
		super();
		this.componente = componente;
	}

	public double getTemperatura() {
		return this.componente.getTemperatura();
	}
	
	public double getPresion() {
		return this.componente.getPresion();
	}
	
	public double getRadiacionSolar() {
		return this.componente.getRadiacionSolar();
	}
	
	public List<Double> getTemperaturas(){
		return this.componente.getTemperaturas();
	}
	
	public abstract String displayData();
	/*public abstract String displayData() {
		return this.componente.displayData();
	}*/
	
	
}
