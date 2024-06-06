package ar.edu.unlp.info.oo2.ejercicio16;

import java.util.List;

public class HomeWeatherStation implements WeatherData{
	
	private double temperatura;
	private double presion;
	private double radiacionSolar;
	private List<Double> temperaturas;
	
	

	public HomeWeatherStation(double temperatura, double presion, double radiacionSolar, List<Double> temperaturas) {
		this.temperatura = temperatura;
		this.presion = presion;
		this.radiacionSolar = radiacionSolar;
		this.temperaturas = temperaturas;
	}

	@Override
	public double getTemperatura() {
		return this.temperatura;
	}

	@Override
	public double getPresion() {
		return this.presion;
	}

	@Override
	public double getRadiacionSolar() {
		return this.radiacionSolar;
	}

	@Override
	public List<Double> getTemperaturas() {
		return this.temperaturas;
	}

	@Override
	public String displayData(){
		return "Temperatura F: " + this.getTemperatura() +
		   	  "Presión atmosf: " + this.getPresion() +
		   	  "Radiación solar: " + this.getRadiacionSolar();
		}

	
}
