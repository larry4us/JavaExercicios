package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica {
	public double raio;
	
	public Circulo(int posX, int posY, double raio){
		this.posX = posX;
		this.posY = posY;
		this.raio = raio;
	}
	
	public Circulo (){
		this(0,0,0);
	}
	
	public double getArea() {
		double area = Math.PI * this.raio * this.raio;
		return area;
	}
	
	public double getPerimetro() {
		double perimetro = 2 * Math.PI * this.raio;
		return perimetro;
	}
	
	public String toString() {
		return "Círculo na " + this.getPosString() + " com raio de " + this.raio + "cm (área=" +
				this.getArea() + "cm2, perímetro =" + this.getPerimetro() + "cm)";
	}
	
	

}
