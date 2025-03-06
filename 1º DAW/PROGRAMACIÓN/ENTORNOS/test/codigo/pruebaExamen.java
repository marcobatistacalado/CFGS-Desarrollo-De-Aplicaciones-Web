package codigo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class pruebaExamen {

	@Test
	public void test1_validarTirada() { // clase válida
		assertTrue(Examen.validarTirada(1)); // limite
		assertTrue(Examen.validarTirada(5)); // limite
		assertTrue(Examen.validarTirada(2)); // dentro rango
		assertTrue(Examen.validarTirada(3)); // dentro rango
		assertTrue(Examen.validarTirada(4)); // dentro rango
	}

	@Test
	public void test2_validarTirada() { // clase no válida
		assertFalse(Examen.validarTirada(0)); // fuera rango
		assertFalse(Examen.validarTirada(-5)); // fuera rango
		assertFalse(Examen.validarTirada(-150)); // fuera rango
	}

	@Test
	public void test3_validarTirada() { // clase no válida
		assertFalse(Examen.validarTirada(6)); // fuera rango
		assertFalse(Examen.validarTirada(10)); // fuera rango
		assertFalse(Examen.validarTirada(150)); // fuera rango
	}
	// CONCLUSIÓN TEST VALIDAR TIRADA
	/*
	 * Tras realizar los test de validar, todas las clases inválidas (1) (2) nos
	 * devuelve true, lo que nos hace pensar que la sentencia de condición de rango
	 * del valor está mal definida, es decir, no está haciendo que el numero solo
	 * pueda ser entre 1-5
	 */

	@Test
	public void test1_juego() { // clase válida
		assertEquals(-5, Examen.juego(1)); // limite
		assertEquals(5, Examen.juego(5)); // limite
		assertEquals(50, Examen.juego(2)); // dentro rango --> devuelve -5.
		assertEquals(5, Examen.juego(3)); // dentro rango
		assertEquals(-5, Examen.juego(4)); // dentro rango --> devuelve 50.
	}

	@Test
	public void test2_juego() { // clase no válida
		assertEquals(-1, Examen.juego(0)); // fuera rango --> devuelve 0.
		assertEquals(-1, Examen.juego(-5)); // fuera rango --> devuelve 0.
		assertEquals(-1, Examen.juego(-150)); // fuera rango --> devuelve 0.
	}

	@Test
	public void test3_juego() { // clase no válida
		assertEquals(-1, Examen.juego(6)); // fuera rango --> devuelve 0.
		assertEquals(-1, Examen.juego(10)); // fuera rango --> devuelve 0.
		assertEquals(-1, Examen.juego(150)); // fuera rango --> devuelve 0.
	}

	// CONCLUSIÓN TEST JUEGO
	/*
	 * Tras realizar los test, las clases válidas (1) nos hacen pensar que no hay
	 * una correcta asociación del nº a jugar con 0, 1 u otro valor. Ya que cuando
	 * jugamos 2, que está asociado con el nº 50, debería devolver 50 y cuando
	 * jugamos el nº 4 debería estár asociado al nº 0 y devolver -5, pero devuelve
	 * 50.
	 * 
	 * Por otro lado las clases inválidas (1), (2), en vez de retornar -1 retornan
	 * 0. Por lo que hay una incorrecta instanciación. Pero si es cierto que eso
	 * demuestra que a pesar de que no se haya validado correctamente si es un nº
	 * entre 1-5, se hace una asociación solo a esos valores. Por lo que quedan
	 * excluidos cualquiera del rango
	 */

	@Test
	public void test1_tirada() { // clase válida
		assertEquals(0, Examen.tirada(1)); // limite --> devuelve -5.
		assertEquals(1, Examen.tirada(5)); // limite --> devuelve 5.
		assertEquals(50,Examen.juego(2)); // dentro rango --> devuelve -5.
		assertEquals(1, Examen.tirada(3)); // dentro rango --> devuelve 5.
		assertEquals(0, Examen.tirada(4)); // dentro rango --> devuelve 50.
	}

	@Test
	public void test2_tirada() { // clase válida
		assertEquals(-1, Examen.juego(0)); // fuera rango --> devuelve 0.
		assertEquals(-1, Examen.juego(-5)); // fuera rango --> devuelve 0.
		assertEquals(-1, Examen.juego(-150)); // fuera rango --> devuelve 0.
	}

	@Test
	public void test3_tirada() { // clase válida
		assertEquals(-1, Examen.juego(6)); // fuera rango --> devuelve 0.
		assertEquals(-1, Examen.juego(10)); // fuera rango --> devuelve 0.
		assertEquals(-1, Examen.juego(150)); // fuera rango --> devuelve 0.
	}

	// CONCLUSION TIRADA
	/*
	 * Y aquí es donde realmente reside más el problema porque es dónde no se está
	 * haciendo correctamente la asociación de un nº del rango con 0,1 u otro valor,
	 * apra a posterior al usar el metodo juego coger la asociación y asignar los
	 * puntos +5, -5 o valor asociado
	 */

}
