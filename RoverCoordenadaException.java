package br.edu.ufam.icomp.lab_excecoes;

public class RoverCoordenadaException extends RoverException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RoverCoordenadaException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public RoverCoordenadaException (){
		super("Exceção geral de coordenada do rover");
	}
	

}
