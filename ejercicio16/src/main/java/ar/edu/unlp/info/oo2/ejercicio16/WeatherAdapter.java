package ar.edu.unlp.info.oo2.ejercicio16;

import java.util.List;

public class WeatherAdapter implements WeatherData {

	private HomeWeatherStation adaptee;
	
	public WeatherAdapter(double temperatura, double presion, double radiacionSolar, List<Double> temperaturas) {
		adaptee = new HomeWeatherStation(temperatura,presion,radiacionSolar,temperaturas);
	}

	@Override
	public double getTemperatura() {
		return adaptee.getTemperatura();
	}

	@Override
	public double getPresion() {
		return adaptee.getPresion();
	}

	@Override
	public double getRadiacionSolar() {
		return adaptee.getRadiacionSolar();
	}

	@Override
	public List<Double> getTemperaturas() {
		return adaptee.getTemperaturas();
	}

	@Override
	public String displayData() {
		return "";
	}
	
	
}
