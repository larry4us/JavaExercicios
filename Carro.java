
public class Carro {
	String marca;
	String modelo;
	Proprietario proprietario;
	Placa placa;
	Motor motor;
	
	Carro() {
        this("", "", null, null, null);
    }
    
    Carro(String marca) {
        this(marca, "", null, null, null);
    }
    
    Carro(String marca, String modelo) {
        this(marca, modelo, null, null, null);
    }
    
    Carro(String marca, String modelo, Proprietario proprietario) {
        this(marca, modelo, proprietario, null, null);
    }
    
    Carro(String marca, String modelo, Proprietario proprietario, Placa placa) {
        this(marca, modelo, proprietario, placa, null);
    }
	
	Carro (String marca, String modelo, Proprietario proprietario, Placa placa, Motor motor){
		this.marca = marca;
		this.modelo = modelo;
		this.proprietario = proprietario;
		this.placa = placa;
		this.motor = motor;		
	}
	
	String getDescricao() {
		return "Carro " + this.marca + "/" + this.modelo + ". " + proprietario.getDescricao() +
				placa.getDescricao() + motor.getDescricao();
	}
	
}
