package ar.edu.unlp.info.oo2.ejercicio16;

public class PresionDecorator extends WeatherDecorator{

	public PresionDecorator(WeatherData componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayData() {
		// TODO Auto-generated method stub
		return this.componente.displayData()+"Presion atmosf: "+this.componente.getPresion();
	}

}
