
import java.util.Scanner;

public class Xadrez {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
	
		int linhas = scan.nextInt();
		
		for (int i=0; i<linhas; i++) {
			if (i%2==0) {
				for (int j =0; j <linhas ; j++) {
					System.out.print("* ");
				}
			
			} else {
				System.out.print(" ");
				for (int j=0; j <linhas ; j++) {
					System.out.print("* ");
				}
			}
			System.out.print("\n");
		}
	}
}