package ar.edu.unlp.info.oo2.ejercicio16;

import java.util.List;
import java.util.stream.Collectors;

public class CelciusDecorator extends WeatherDecorator{

	public CelciusDecorator(WeatherData componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Double> getTemperaturas(){
		return this.componente.getTemperaturas().stream()
				.mapToDouble(temperatura -> ((temperatura-32)/1.8))
				.boxed() // que carajo es esto!!!!!! (gpt)
				.collect(Collectors.toList()); 
	}
	
	@Override
	public double getTemperatura() {
		return (this.componente.getTemperatura()-32)/1.8;
	}
	
	@Override
	public String displayData() {
		// TODO Auto-generated method stub
		//return this.componente.displayData()+"Temperatura C: "+((this.componente.getTemperatura()-32)/1.8);
		return this.componente.displayData()+"Temperatura C: "+((this.getTemperatura()));
	}

}
