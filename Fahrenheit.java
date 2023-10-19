import java.util.Scanner;

public class Fahrenheit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float celsius;
		float far;
		
		//Convertendo
		celsius = scan.nextFloat();
		far = (celsius*9)/5 + 32;
		System.out.println(far);
	}

}
