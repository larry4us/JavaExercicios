import java.util.Scanner;

public class TanqueCombustivel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double raio, alt;
		int opcao;
		
		raio = scan.nextDouble();
		alt = scan.nextDouble();
		opcao = scan.nextInt();
		
		if (opcao == 1) {
			System.out.printf("%.4f", volumeAr(raio,alt));
		}
		if (opcao == 2) {
			System.out.printf("%.4f", volumeComb(raio,alt));
		}
	}
	
	public static double volumeAr (double raio, double alt){
		double vol;
		
		vol = (Math.PI/3) * Math.pow(alt, 2) * (3*raio - alt);
		return vol;
	}
	
	public static double volumeComb (double raio, double alt){
		double vol, vol_esfera;
		
		vol_esfera = (4.0/3.0) * Math.PI * Math.pow(raio, 3);
		vol = vol_esfera - volumeAr(raio,alt);
		return vol;
	}
}
