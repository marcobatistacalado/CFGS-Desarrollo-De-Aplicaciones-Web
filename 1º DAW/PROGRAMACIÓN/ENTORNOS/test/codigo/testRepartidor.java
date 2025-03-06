package codigo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testRepartidor {

	Repartidor r1, r2, r3;

	@BeforeEach
	void inicializar() {
		r1 = new Repartidor(1);
		r2 = new Repartidor(2);
		r3 = new Repartidor(3);
	}

	@Test
	void testConstructor() {
		// Probar constructor
		assertEquals(1, r1.getId());
		assertEquals(2, r2.getId());
		assertEquals(3, r3.getId());
	}

	@Test
	void testRealizarPedidoActualVariables() {
		r1.realizarPedido(5, 2); // totalpedidos = 1; numpedidos = 1; ganacias = 3;
		assertEquals(1, r1.getNpedido());
		assertEquals(1, Repartidor.getTotalPedidos());//PORQUE ESTÁ MAL?
		assertEquals(3, r1.getTgan());
		
		//probamos que las variables estaticas realmente lo sean o funcionen bien
		r2.realizarPedido(5, 2); // totalpedidos = 2; numpedidos = 1; ganancias = 3;
		assertEquals(1, r1.getNpedido());
		assertEquals(2, Repartidor.getTotalPedidos());//ESTO TIENE QUE SER ASI O ESTARA MAL
		assertEquals(3, r1.getTgan());
	}

	@Test
	void testNegativosPositivos() {
		// ahora probamos clases validas e invalidas
		r1.realizarPedido(-5, 2); // clase invalida
		assertEquals(0, r1.getNpedido());
		assertEquals(0, Repartidor.getTotalPedidos());
		//assertEquals(3, r1.getTgan()); // si NO es igual es que no esta realizando correctamente.
		r1.realizarPedido(0, 2); // clase invalida
		assertEquals(0, r1.getNpedido());//
		assertEquals(0, Repartidor.getTotalPedidos());
		assertEquals(0, r1.getTgan()); // si NO es igual es que no esta realizando correctamente.
		r1.realizarPedido(5, -2); // clase invalida
		assertEquals(0, r1.getNpedido());
		assertEquals(0, Repartidor.getTotalPedidos());
		assertEquals(0, r1.getTgan()); // si es igual es que no esta realizando correctamente.
	}

}
