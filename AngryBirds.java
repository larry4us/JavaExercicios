import java.util.Scanner;

public class AngryBirds {
	public static void main(String[] args) {
		double R, Vo,ang,D, grav = 9.8;
		Scanner scan = new Scanner(System.in);
		//Alcance horizontal
		
		Vo = scan.nextDouble();
		ang = scan.nextDouble();
		ang = Math.toRadians(ang);
		D = scan.nextDouble();
		
		R = Math.pow(Vo,2) * Math.sin(2*ang)/grav;

		if (Math.abs(R-D) <= 0.1){
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		scan.close();
	}

}
