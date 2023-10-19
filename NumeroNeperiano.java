import java.util.Scanner;

public class NumeroNeperiano {
	public static void main(String[] args) {
		double e=0, k;
		Scanner scan = new Scanner (System.in);
		
		k = scan.nextDouble();
		for (int i = 0; i < k; i++) {
			e += 1.0 / Fatorial(i);
		}
		System.out.printf("%.6f",e);
		
		
		
	}
	public static double Fatorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
	    }

	    double fatorial = 1;
	    for (int i = 2; i <= n; i++) {
	    	fatorial *= i;
	    }
	    return fatorial;
	 }

}
