import java.util.Scanner;

public class VolumeCombustivel {
	public static void main(String[] args) {
		
		double cal_cheia,cil_cheio, H, h, raio, volumeEsfera, volume; 
		Scanner scan = new Scanner(System.in);
		
		
		H = scan.nextDouble();
		h = scan.nextDouble();
		raio = scan.nextDouble();
		
		
		cal_cheia = calota (raio,raio);
		cil_cheio = cilindro ((H - 2*raio), raio);
		if (H >=0 && raio >= 0 && h >=0) {
			if (h<raio && h>=0) {
				volume = calota(h,raio);
				System.out.printf("%.3f",volume);
			} else if (h < (H - raio) && h>=0) {
				volume = cal_cheia + cilindro ((h - raio), raio);
				System.out.printf("%.3f",volume);
			} else if (h <= H && h>=0) {
				volume = cal_cheia + cil_cheio + calota ((h - (H - 2*raio) - raio), raio);
				System.out.printf("%.3f",volume);
			} else {
				System.out.println("-1.000");
			}		
		} else {
			System.out.println("-1.000");
		}
	}
	
	public static double calota (double h, double r) {
		double vol;
		
		vol = (Math.PI/3) * Math.pow(h, 2) * (3*r - h);
		return vol;
	}
	
	public static double cilindro (double h, double r) {
		double vol;
		
		vol = (Math.PI * r * r * h);
		return vol;
	}
}
