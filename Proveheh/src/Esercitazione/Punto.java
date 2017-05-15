package Esercitazione;

public class Punto {
	private int x, y;

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
	
	@Override
	public boolean equals(Object p){
		Punto that = (Punto) p;
		return this.getX() == that.getX() && this.getY() == that.getY();
	}
	
	@Override
	public int hashCode(){
		/*Ancora non ho capito perchè ma in questo corso ogni volta che scrivo equals 
		 * scrivo anche hasCode*/
		return 0;
	}
}