
public class Sala {
	int bloco, sala, capacidade;
	boolean acessivel;
	
	Sala(){
		this(0,0,0,false);
	}
	
	Sala(int bloco, int sala, int capacidade, boolean acessivel){
		this.bloco = bloco;
		this.sala = sala;
		this.capacidade = capacidade;
		this.acessivel = acessivel;
	}
	
	String getDescricao() {
		String aux;
		if (this.acessivel == true) {
			aux = "acessível";
		} else {
			aux = "não acessível";
		}
		return "Bloco " + this.bloco + ", Sala " + this.sala + " (" + this.capacidade+ " lugares, " + aux + ")";
	}
}
