import java.util.Scanner;

public class AproximacaoSeno {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double graus, k;
		
		graus = scan.nextDouble();
		graus = Math.toRadians(graus);
		k = scan.nextDouble();
		aproximacao(graus,k);	
		
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
	
	public static void aproximacao (double x, double n) {
		double res = x;
		System.out.printf("%.10f\n", res);
		
		if (n > 1) {
			for (int i  = 1; i < n; i++) {
				if (i%2 == 0) {
					res +=  Math.pow(x,(1+2*i))/Fatorial(1+2*i);
					System.out.printf("%.10f\n",res);
				} else {
					res -=  Math.pow(x,(1+2*i))/Fatorial(1+2*i);
					System.out.printf("%.10f\n",res);
				}	
			}
		}
			
	}
	

}
