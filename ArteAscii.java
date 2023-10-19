import java.util.Scanner;

public class ArteAscii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base = scanner.nextInt();
        
        drawFigure(base);
    }

    public static void drawFigure(int base) {
        // Parte superior da figura
        for (int i = base; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Parte inferior da figura
        for (int i = 1; i <= base; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
