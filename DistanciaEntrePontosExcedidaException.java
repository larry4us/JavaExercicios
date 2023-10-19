package br.edu.ufam.icomp.lab_excecoes;

public class DistanciaEntrePontosExcedidaException extends RoverCaminhoException {

	public DistanciaEntrePontosExcedidaException() {
		super( "Distância máxima entre duas coordenadas vizinhas excedida");
		// TODO Auto-generated constructor stub
	}

	public DistanciaEntrePontosExcedidaException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
}
