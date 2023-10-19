package br.edu.icomp.ufam.lab_heranca;

public class Retangulo extends FormaGeometrica {
	
	public double largura,altura;
	
	public Retangulo(int posX, int posY, double largura, double altura) {
		this.posX = posX;
		this.posY = posY;
		this.largura = largura;
		this.altura = altura;
	}
	
	public Retangulo() {
		this(0,0,0,0);
	}
	
	public double getArea() {
		double area = this.largura * this.altura;
		return area;
	}
	
	public double getPerimetro() {
		return 2*this.altura + 2*this.largura;
	}
	
	public String toString() {
		return "Retângulo na " + this.getPosString() + " com largura de " + this.largura + "cm e altura de " +
				this.altura + "cm(área=" + this.getArea() + "cm2, perímetro=" + this.getPerimetro() + "cm)";
	} 

}
