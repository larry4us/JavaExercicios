import java.util.Scanner;

public class ValorExpoente {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num;
		
		num = scan.nextInt();
		System.out.println(contaDois(num));
		
		/*
		int soma=0;
		for (int i = 0; i <15; i++) {
			soma += Math.pow(2, i);
		}
		System.out.println(soma);
		*/
	}
	
	public static int contaDois (int num) {
		int soma=0;
		int k = 1;
		
		while (soma <= num) {
			soma += Math.pow(2, k);
			k+=1;
		}
		return k-1;
	}

}
