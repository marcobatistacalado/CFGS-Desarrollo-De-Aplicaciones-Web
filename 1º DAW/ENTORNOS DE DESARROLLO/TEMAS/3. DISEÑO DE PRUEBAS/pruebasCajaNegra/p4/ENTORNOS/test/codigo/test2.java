package codigo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test2 {

	@Test

	public void testValidarNota_1() { // clase válida
		assertTrue(App2.esValidaNota(0));
		assertTrue(App2.esValidaNota(10));
		assertTrue(App2.esValidaNota(5));
	}

	@Test
	public void testValidarNota_2() { // clase no válida
		assertFalse(App2.esValidaNota(-1));
		assertFalse(App2.esValidaNota(-5));
	}

	@Test
	public void testValidarNota_3() { // clase no válida
		assertFalse(App2.esValidaNota(11));
		assertFalse(App2.esValidaNota(15));
	}

	// probar funcion con todas las pruebas anteriores
	@Test
	public void testCalcularMedia_1() { // clase válida
		assertEquals(0, App2.calcularMedia(0, 0, 0));
		assertEquals(10, App2.calcularMedia(10, 10, 10));
		assertEquals(5, App2.calcularMedia(5, 5, 5));
	}

	@Test
	public void testCalcularMedia_2() { // clase no válida
		assertEquals(-1, App2.calcularMedia(-1, -1, -1));
		assertEquals(-1, App2.calcularMedia(-5, -5, -5));
	}

	@Test
	public void testCalcularMedia_3() { // clase no válida
		assertEquals(-1, App2.calcularMedia(11, 11, 11));
		assertEquals(-1, App2.calcularMedia(15, 15, 15));
	}

	// 2 NOTAS BIEN 1 MAL
	@Test
	public void testCalcularMedia_4() { // clase no válida
		assertEquals(-1, App2.calcularMedia(-1, 10, 10));
		assertEquals(-1, App2.calcularMedia(10, -1, 10));
		assertEquals(-1, App2.calcularMedia(10, 10, -1));
	}

	//2 NOTAS MAL 1 BIEN
	@Test
	public void testCalcularMedia_5() { // clase no válida
		assertEquals(-1, App2.calcularMedia(-1, -1, 10));
		//assertEquals(-1, App2.calcularMedia(10, -1, -1));
		assertEquals(-1, App2.calcularMedia(-1, 10, -1));
	}



}
