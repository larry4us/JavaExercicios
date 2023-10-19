import java.util.Scanner;

public class RaizDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de termos (N): ");
        int N = scanner.nextInt();

        double seed = 1.0;
        double value = calcularFracaoContinua(N, seed);

        System.out.printf("Resultado da fração contínua com %d termos: %.14f%n", N, value);
    }

    public static double calcularFracaoContinua(int N, double seed) {
        double result = seed;
        for (int i = 1; i <= N; i++) {
            result = 1.0 + 1.0 / result;
        }
        return result;
    }
}
