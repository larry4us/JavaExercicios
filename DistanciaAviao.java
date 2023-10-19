import java.util.Scanner;

public class DistanciaAviao {
    public static void main(String[] args) {
        int[][] tempos = {
            {0, 2, 11, 6, 15, 11, 1},
            {2, 0, 7, 12, 4, 2, 15},
            {11, 7, 0, 11, 8, 3, 13},
            {6, 12, 11, 0, 10, 2, 1},
            {15, 4, 8, 10, 0, 5, 13},
            {11, 2, 3, 2, 5, 0, 14},
            {1, 15, 13, 1, 13, 14, 0}
        };

        Scanner scan = new Scanner(System.in);
        int cidadeOrigem = scan.nextInt();
        int cidadeDestino;
        int tempoTotal = 0;

        while (true) {
            cidadeDestino = scan.nextInt();
            if (cidadeDestino == -1) {
                break;
            }
            tempoTotal += tempos[ultimoDigito(cidadeDestino)-1][ultimoDigito(cidadeOrigem)-1];
            cidadeOrigem = cidadeDestino;
        }

        System.out.println(tempoTotal);
    }
    public static int ultimoDigito (int cidade) {
    
    	return cidade%10;
    }
    
}
