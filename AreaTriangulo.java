import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ladoA = scanner.nextDouble();
        double ladoB = scanner.nextDouble();
        double ladoC = scanner.nextDouble();

        double s = (ladoA + ladoB + ladoC) / 2;

        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            double area = Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
            System.out.printf("%.2f\n", area);
        } else {
            System.out.println("Triangulo invalido");
        }

        scanner.close();
    }
}
