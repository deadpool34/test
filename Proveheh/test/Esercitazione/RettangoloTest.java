package Esercitazione;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RettangoloTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTrasla() {
		Rettangolo unitario = new Rettangolo(new Punto(0,0),3,5);
		unitario.trasla(1,0);
		assertEquals(new Punto(1,0), unitario.getVertice());
	}

}
