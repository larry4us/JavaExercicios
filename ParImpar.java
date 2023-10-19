import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int num=0;
		while (num != -1) {
			num = scan.nextInt();
			if (num %2 == 0) {
				System.out.println("PAR");
			} else if (num == -1) {
				break;
			} else {
				System.out.println("IMPAR");
			}
		}
	}

}
