package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import codigo.Repartidor;
	
class testAlquiler {
	Alquiler v1,v2,v3;
	@BeforeEach
	void inicializar() {
		v1 = new Alquiler("1234LRL", "C1", "Citroen", 2015, 1);
		v2 = new Alquiler("4321BCA", "Yaris", "Toyota", 2020, 2);
		v3 = new Alquiler("4321BCA", "Yaris", "Toyota", 2019, 3);
	}
	
	@Test
	void test_1() {
		// Probar constructor
		assertEquals(1, v1.alquiler(1));
	}

}
