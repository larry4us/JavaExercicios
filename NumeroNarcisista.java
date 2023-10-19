import java.util.Scanner;

public class NumeroNarcisista {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		boolean teste;
		
		num = scan.nextInt();
		teste = narcisista(num);
		if (teste) {
			System.out.println("SIM");
		} else {
			System.out.println("NAO");
		}
		
		scan.close();
	}
	
	public static boolean narcisista (int numero) {
		int digitos [] = new int [10];
		int cont = 0, soma = 0;
		int num = numero;
		while (numero != 0) {
			digitos [cont]= numero % 10;
			numero /= 10;
			cont +=1;
		}
		
		for (int i = 0; i < digitos.length; i++) {
			soma += Math.pow(digitos[i], cont);		
		}
		
		if (soma == num) {
			return true;
		} else {
			return false;
		}
		
	}
}
