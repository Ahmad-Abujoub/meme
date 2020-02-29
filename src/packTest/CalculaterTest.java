package packTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pack.Calculater;

class CalculaterTest {

	@Test
	void test() {
		int a = 10;
		int b = 20;
		Calculater calc = new Calculater();
		// Act
		int result = calc.CalcAdd(a, b);
		// Assert
		assertTrue(30==result);
		
	}

}

