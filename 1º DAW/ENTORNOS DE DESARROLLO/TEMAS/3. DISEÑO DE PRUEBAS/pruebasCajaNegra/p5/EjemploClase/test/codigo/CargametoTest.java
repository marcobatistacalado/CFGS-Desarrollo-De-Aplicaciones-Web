package codigo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CargametoTest {

	Cargamento c1,c2,c3;
		
	@BeforeEach
	void inicializar() {
		 c1=new Cargamento("naranja","Valencia",1000,1,1.5);
		 c2=new Cargamento("kiwis","Lugo",500,1.5,2.5);
		 c3=new Cargamento("Peras","Lugo",300,1,2);
	}
	
	@Test
	void rebajarTest() {
		//Tendré que probar con valores que sí rebajen precio y valores que no rebajen precio y con los valores límite
		
		//c1 - 0.5 los precios se quedan iguales, <0.5 se puede rebjar, >0.5 no se puede rebajar
		//c2  1 los precios iguales, <1 puedo rebajar, >1 no puedo rebajar
		
		//ES IMPORTANTE TENER EN CUENTA QUE EL PRECIO DE VENTA VA CAMBIANDO EN LAS SUCESIVAS LLAMADAS, POR ESO, HAY GENTE
		//QUE PREFIERE HACER CADA ASSERT EN UN MÉTODO DIFERENTE
		
		Assertions.assertFalse(c1.rebajar(0.5));
		Assertions.assertTrue(c1.rebajar(0.3));
		Assertions.assertFalse(c1.rebajar(1));		
	}
	
	
	@Test
	void venderTest() {
	Assertions.assertEquals(0, c2.vender(600));
	Assertions.assertEquals(750, c2.vender(300));
	Assertions.assertEquals(0, c2.vender(201));
	Assertions.assertEquals(500,c2.vender(200) );
	Assertions.assertEquals(0,c2.vender(1));
	}
	
	@Test
	void mismoCargamentoTest() {
		Assertions.assertFalse(Cargamento.mismoCargamento(c2, c1));
		Assertions.assertTrue(Cargamento.mismoCargamento(c2, c3));
		
	}
	
	@Test
	void mismoCargamento2Test() {
		Assertions.assertFalse(c2.mismoCargamento2(c1));
		Assertions.assertTrue(c2.mismoCargamento2(c3));
	}

	
	@Test
	void totalGananciasTest() {
		Assertions.assertEquals(750, c2.vender(300));
		Assertions.assertEquals(0, c2.vender(201));
		Assertions.assertEquals(450,c1.vender(300));
		assertEquals(0,c1.vender(1000));
		
		assertEquals(450,Cargamento.getTotalGanancias());
	}
}
