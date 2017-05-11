package test;

import static org.junit.Assert.*;

import org.junit.Test;

import Logica.CalcularLetra;

public class CalcularLetraTest {

	@Test
	public void calculaTest() {
		CalcularLetra calc = new CalcularLetra("12312312");
		assertEquals('K',calc.devolverLetra());
	}

}
