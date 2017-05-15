package Esercitazione;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class GruppoTest {

	private static final Punto origine = new Punto(0,0);
	private Gruppo vuoto;
	private Gruppo gruppo;
	private Gruppo semplice;
	private Cerchio forma;

	@Before
	public void setUp() throws Exception {
		this.vuoto = new Gruppo();
		this.semplice = new Gruppo();
		this.forma = new Cerchio(new Punto(1,0),1);
		semplice.aggiungiForma(forma);
	}
	
	@Test
	public void testGruppiVuotiNonHannoComponenti(){
		assertEquals(0,this.vuoto.getNumeroComponenti());
	}
	
	@Test
	public void testAggiungiUnaForma() {
		assertEquals(0,this.vuoto.getNumeroComponenti());
		final Cerchio unitario = new Cerchio(origine,1);
		this.vuoto.aggiungiForma(unitario);
		assertEquals(1,this.vuoto.getNumeroComponenti());
		
	}
	
	@Test
	public void testAggiungiDueForme() {
		assertEquals(0,this.vuoto.getNumeroComponenti());
		final Cerchio unitario = new Cerchio(origine,1);
		this.vuoto.aggiungiForma(unitario);
		final Rettangolo rettangolo = new Rettangolo(origine,1,2);
		this.vuoto.aggiungiForma(rettangolo);
		assertEquals(2,this.vuoto.getNumeroComponenti());
	}
	@Test
	public void testAggiungiGruppo() {
		this.gruppo = new Gruppo();
		this.gruppo.aggiungiForma(this.vuoto);
		assertEquals(1,this.gruppo.getNumeroComponenti());
	}
	


}
