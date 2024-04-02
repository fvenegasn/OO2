package ar.edu.unlp.info.oo2.ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {
	private Empleado pasante;//$21200
	private Empleado planta;//$71050
	private Empleado temporario;//$28988
	private List<Empleado>empleados;//total=$121.238
	
	@BeforeEach
	void setUp() {
		pasante=new Pasante(2);
		planta=new Planta(true,2,10);
		temporario=new Temporario(false,5,8);
		empleados=new ArrayList<Empleado>();
		empleados.add(pasante);
		empleados.add(planta);
		empleados.add(temporario);
	}
	
	@Test
	void sueldoTest() {
		double sueldos;
		sueldos=empleados.stream().mapToDouble(empleado -> empleado.sueldo()).sum();
		assertEquals(sueldos,121238);
		assertEquals(pasante.sueldo(),21200);
		assertEquals(planta.sueldo(),71050);
		assertEquals(temporario.sueldo(),28988);
	}
}
