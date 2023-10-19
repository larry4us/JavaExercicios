import java.util.Scanner;

public class IdadeUfam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ano_atual = scan.nextInt();
		
		System.out.println("A UFAM tem " + (ano_atual - 1909) + " anos de fundacao");
	}
}
