import java.util.Scanner;
	public class SomaDigitos {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int numero = scanner.nextInt();

	        int somaDigitos = calcularSomaDigitos(numero);
	        System.out.println(somaDigitos);

	        scanner.close();
	    }

	    public static int calcularSomaDigitos(int numero) {
	        int soma = 0;

	        while (numero != 0) {
	            soma += numero % 10;
	            numero /= 10;
	        }

	        return soma;
	    }
	}
