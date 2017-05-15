package Esercitazione;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CerchioTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTrasla() {
		Cerchio unitario = new Cerchio(new Punto(0,0),1);
		unitario.trasla(1,0);
		assertEquals(new Punto(1,0), unitario.getCentro());
	}

}
