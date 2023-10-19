import java.util.Scanner;

public class FaltasTrabalho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dia = 0;
        int segunda = 0, terca = 0, quarta = 0, quinta = 0, sexta = 0, sabado = 0, faltas = 0;

        while (dia != -1) {
            dia = scan.nextInt();
            switch (dia) {
                case 2:
                    segunda += 1;
                    break;
                case 3:
                    terca += 1;
                    break;
                case 4:
                    quarta += 1;
                    break;
                case 5:
                    quinta += 1;
                    break;
                case 6:
                    sexta += 1;
                    break;
                case 7:
                    sabado += 1;
                    break;
                default:
                    break;
            }
            if (dia != -1) {
                faltas += 1;
            }
        }

        double totalFaltas = (double) faltas;
        System.out.printf("%.1f %.1f %.1f %.1f %.1f %.1f",
            porcentagem(totalFaltas, segunda), porcentagem(totalFaltas, terca),
            porcentagem(totalFaltas, quarta), porcentagem(totalFaltas, quinta),
            porcentagem(totalFaltas, sexta), porcentagem(totalFaltas, sabado));
    }

    public static double porcentagem(double total, int faltas) {
        return (faltas / total) * 100.0;
    }
}
