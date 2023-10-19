import java.util.Scanner;

public class Desconto {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		float preco = scan.nextFloat();
		
		if (preco >= 200) {
			System.out.printf("%.2f\n", 0.95 * preco);
		} else {
			System.out.printf("%.2f\n", preco);		
		}
	}
}
