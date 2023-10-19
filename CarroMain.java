
public class CarroMain {
	public static void main(String[] args) {
		Proprietario prop1 = new Proprietario();
		System.out.println(prop1.getDescricao());
		
		Placa placa1 = new Placa();
		System.out.println(placa1.getDescricao());
		
		Motor motor1 = new Motor();
		System.out.println();
		
		Carro carro = new Carro("DeLorean", "DMC-12",prop1, placa1, motor1);
		System.out.println(carro.getDescricao());
	}

	
	
}
