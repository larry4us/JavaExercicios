package br.edu.icomp.ufam.lab_heranca;

public class FormasMain {

	FormaGeometrica[] vetor = new FormaGeometrica[3];
	Circulo circ = new Circulo(1,2,3);
	Retangulo ret = new Retangulo(1,2,3,4);
	Quadrado quad = new Quadrado();
	
	for (int i = 0; i < vetor.lenght; i++) {
		System.out.println(vetor.toString());
	}
}
