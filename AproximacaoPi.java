import java.util.Scanner;

public class AproximacaoPi {
	public static void main(String[] args) {
		double n;
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextDouble();
		aproximacao(n);
		scan.close();
	}
	public static void aproximacao (double n) {
		double res = 3;
		if (n == 1) {
			System.out.printf("%.6f", res);
		} else if (n>1) {
			System.out.printf("%.6f\n",res);
			for (int i  = 0; i < n-1; i++) {
				if (i%2 == 0) {
					res += (double)4 / ((2+2*i) * (3+2*i)  * (4 + 2*i));
					System.out.printf("%.6f\n",res);
				} else {
					res -= (double)4 / ((2+2*i) * (3+2*i)  * (4 + 2*i));
					System.out.printf("%.6f\n",res);
				}	
			}
			
		}
	}
}
