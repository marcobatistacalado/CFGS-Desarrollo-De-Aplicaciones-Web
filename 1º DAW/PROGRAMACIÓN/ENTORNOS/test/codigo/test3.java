package codigo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test3 {

	@Test
	public void testPotencia_1() { // clase válida
		//assertEquals(25,App3.potencia(5,2));
		assertEquals(25,App3.potencia(2,3));
		assertEquals(25,App3.potencia(0,5));

	}
	@Test
	public void testPotencia_4() { // clase válida
		assertEquals(0.5,App3.potencia(2,-1));
		assertEquals(0.25,App3.potencia(2,-2));

	}
	@Test
	public void testPotencia_5() { // clase válida
		assertEquals(4,App3.potencia(-2,3));
		assertEquals(9,App3.potencia(-3,2));

	}
	@Test
	public void testPotencia_6() { // clase válida
		//assertEquals(-8,App3.potencia(-2,3));
		assertEquals(-27,App3.potencia(-3,3));

	}
	@Test
	public void testPotencia_2() { // clase no válida
		assertEquals(-1,App3.potencia(0,0));

	}
	@Test
	public void testPotencia_3() { // clase válida
		assertEquals(1,App3.potencia(5,0));
		assertEquals(1,App3.potencia(-5,0));

	}

}
