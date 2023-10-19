import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lado1 = scanner.nextDouble();
        double lado2 = scanner.nextDouble();     
        double lado3 = scanner.nextDouble();

        // Verifica se algum lado é negativo ou se os lados não formam um triângulo
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0 || !eTriangulo(lado1, lado2, lado3)) {
            System.out.println("invalido");
        } else {
            // Verifica o tipo de triângulo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("equilatero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("isosceles");
            } else {
                System.out.println("escaleno");
            }
        }

        scanner.close();
    }

    // Função para verificar se os lados formam um triângulo
    public static boolean eTriangulo(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
}
