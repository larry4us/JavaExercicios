import java.util.Scanner;

public class RaizQuadrada {
	public static void main(String[] args) {
		int numero;
		Scanner scan = new Scanner(System.in);
		
		numero = scan.nextInt();
		System.out.printf("%.4f",Math.sqrt(numero));
	}

}

