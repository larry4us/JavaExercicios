
import java.util.Scanner;

public class ContaEnergia {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		float consumo = scan.nextFloat();
		
		char instalacao = scan.next().charAt(0);
		
		float total = 0;
		switch (instalacao) {
			case 'R':
				if (consumo <=500 && consumo >=0) {
					total = (float) (consumo * 0.40);
					System.out.printf("%.2f",total);
				} else if (consumo > 500) {
					total = (float)(consumo * 0.65);
					System.out.printf("%.2f",total);
				}
				break;
			
			case 'C':
				if (consumo <= 1000 && consumo >=0) {
					total = (float) (consumo * 0.55);
					System.out.printf("%.2f",total);
				}else if (consumo > 1000) {
					total = (float) (consumo * 0.60);
					System.out.printf("%.2f",total);
				}
				break;
			case 'I':
				if (consumo <= 5000 && consumo >=0) {
					total = (float) (consumo * 0.55);
					System.out.printf("%.2f",total);
				} else if (consumo > 5000){
					total = (float) (consumo * 0.60);
					System.out.printf("%.2f",total);	
				}
			default:
				System.out.println("-1");
				
				
		}
	}
}