package codigo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testViaje {
	Viaje v1, v2, v3;

	@BeforeEach
	void inicializar() {
		v1 = new Viaje("Madrid", "Barcelona", 10, 10);
		v2 = new Viaje("Valencia", "Galicia", 20, 20);
	}
	
	@Test
	void testConstructor() {
		// Probar constructor
		assertEquals("MABA1", v1.getCodigo());
		assertEquals("VAGA2", v2.getCodigo());
		
		//TAMBIEN QUEDA COMPROBADA LA VARIABLE ESTATICA NUMERO DE VIAJE
	}
	
	@Test
	void testReservar() {
		assertEquals(58, v1.reservar(5, 1));// debe funcionar
		//assertEquals(50, v1.reservar(1, 5));// no debe funcionar porque ya son mas del cupo
		assertEquals(26, v1.reservar(1, 2)); // debe funcionar
		assertEquals(0, v1.reservar(10, 1)); // es escederse en viajeros
		assertEquals(0, v1.reservar(1, 10)); // es escederse en viajeros
		assertEquals(0, v1.reservar(-1, 1)); //negativo no se puede
		assertEquals(0, v1.reservar(1, -1)); //negativo no se puede
	}
	
	@Test
	void testmodPlazas() {
		v1.reservar(9, 0);
		assertTrue(v1.modPlazas(11)); // modifico a un numero mayor de las reservas
		assertEquals(11,v1.getnPlazas()); //compruebo su mod
		assertFalse(v1.modPlazas(8)); //modifico a un numero menor de las reservas
		assertFalse(v1.modPlazas(-11)); //modifico a un numero negativo
	}
	
	@Test
	void testGananciasTotales() {
		v1.reservar(9, 0); //90€
		v2.reservar(1, 0); //20€
		assertEquals(110,Viaje.getRecaudacion()); //DA ERROR PORQUE NO SE LE ESTA SUMANDO SOLO SE QUEDA CON EL ULTIMO EN EL METODO RESERVAR
		
	}

}