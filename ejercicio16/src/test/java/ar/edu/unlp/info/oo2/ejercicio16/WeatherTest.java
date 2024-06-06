package ar.edu.unlp.info.oo2.ejercicio16;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeatherTest {
	//Ej 5: “Temperatura C: 30; Presión atmosf: 1008; Radiación solar: 200; Promedio: 30; Mínimo: 27 Máximo: 32;”
	private WeatherData basico;
	
	
	@BeforeEach
	void setUp() {
		List<Double>temperaturas=new ArrayList<Double>();
		temperaturas.add(86d); temperaturas.add(80.6); temperaturas.add(89.6);
		basico=new WeatherAdapter(86,1008,200,temperaturas);
	}
	
	@Test
	void testOrden5() {
		WeatherData celcius=new CelciusDecorator(basico);
		WeatherData presion=new PresionDecorator(celcius);
		WeatherData radiacion=new RadiacionDecorator(presion);
		WeatherData promedio=new PromedioDecorator(radiacion);
		WeatherData minimo=new MinimoDecorator(promedio);
		WeatherData maximo=new MaximoDecorator(minimo);
		System.out.println(maximo.displayData()); // equivale a assertequals
	}
	
}
