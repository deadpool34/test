package Esercitazione;

public class Gruppo implements Forma{
	
	private static final int MAX_FORME = 10;
	private Forma[] componenti;
	private int numeroForme;
	
	public Gruppo(){
		this.componenti = new Forma[MAX_FORME];
		this.numeroForme = 0;
	}
	
	@Override
	public void trasla(int deltaX, int deltaY){
		for(int i=0; i<this.numeroForme; i++){
			this.componenti[i].trasla(deltaX, deltaY);
		}
	}
	
	public void aggiungiForma(Forma nuova){
		if(this.numeroForme<MAX_FORME)
			this.componenti[this.numeroForme++] = nuova;
	}

	public int getNumeroComponenti() {
		return this.numeroForme;
	}
	
}
