
public class Motor {
	int tipo;
	double capacidade;
	int potencia;
	
	Motor(){
		this(0,0.0,0);
	}
	
	Motor(int tipo, int potencia){
		this(tipo,0.0,potencia);
	}
	
	Motor(double cap, int potencia){
		this(0,cap,potencia);
	}
	
	Motor(int tipo, double capacidade, int potencia){
		this.tipo = tipo;
		this.capacidade = capacidade;
		this.potencia = potencia;
	}
	
	String getTipoString() {
		switch (this.tipo) {
		case 1:
			return "Gasolina";
		case 2:
			return "Alcool";
		case 3:
			return "Flex";
		case 4:
			return "Diesel";
		case 5:
			return "Eletrico";
		default:
			return "Outros";
		}
	}
	
	String getDescricao() {
		return "Motor: tipo=" + getTipoString() + ", capacidade="
				+ this.capacidade + "L, potencia=" + this.potencia + "CV.";
	}
}

