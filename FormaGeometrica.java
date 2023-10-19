package br.edu.icomp.ufam.lab_heranca;

public abstract class FormaGeometrica {
	public int posX,posY;
	
	public FormaGeometrica(int x,int y) {
		this.posX = x;
		this.posY = y;
	}
	
	public FormaGeometrica() {
		this(0,0);
	}
	
	public String getPosString() {
		return "posição (" + this.posX + ", " + this.posY + ")";
	}
	
	public abstract double getArea();
	public abstract double getPerimetro();
	
}
