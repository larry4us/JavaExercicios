package br.edu.ufam.icomp.lab_excecoes;

public class CoordenadaNegativaException extends RoverCoordenadaException {

	public CoordenadaNegativaException() {
		super("Coordenada com valor negativo");
		// TODO Auto-generated constructor stub
	}

	public CoordenadaNegativaException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
