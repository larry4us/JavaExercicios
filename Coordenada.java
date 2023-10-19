package br.edu.ufam.icomp.lab_excecoes;

public class Coordenada {
	private int posX;
	private int posY;
	private int digito;
	
	public Coordenada(int posX, int posY, int digito) throws CoordenadaNegativaException, CoordenadaForaDosLimitesException, DigitoInvalidoException{
		if (posX < 0 || posY < 0) {
			throw new CoordenadaNegativaException();
		}
		if (posX > 3000 || posY > 3000 ) {
			throw new CoordenadaForaDosLimitesException();
		}
		if ((posX + posY) % 10 != digito) {
			throw new DigitoInvalidoException();
		}
			this.posX = posX;
			this.posY = posY;
			this.digito = digito;
	}

	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public double getPosX() {
		return posX;
	}

	public double getPosY() {
		return posY;
	}

	public double distancia (Coordenada coordenada) {
		double x = coordenada.posX;
		double y = coordenada.posY;
		double res = formula (this.posX, x, this.posY, y);
		return res;
	}
	
	double formula (double x1, double x2, double y1, double y2) {
		double b = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return b;
	}
	
	public String toString() {
		return posX + ", " + posY;
	}
}
