import java.util.Scanner;

public class Media {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		float numero, soma = 0;
		
		for (int i  = 0; i < 3; i ++) {
			numero = scan.nextFloat();
			soma += numero;
		} 
	
		System.out.printf("%.2f",soma/3);
	}
}
