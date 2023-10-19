import java.util.Scanner;

public class Mediana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int tamanho = 0;
        int numero;
        int[] vetor = new int[100]; 
        int posicao;

        while (true) {
            numero = scan.nextInt();
            
            if (numero == -1) {
                break;
            }
            
            vetor[tamanho] = numero;
            tamanho++;
        }

        if (tamanho % 2 == 1) {
            posicao = tamanho / 2;
            double mediana = vetor[posicao];
            System.out.printf("%.1f%n", mediana);
        } else {
            posicao = tamanho / 2;
            double mediana = (vetor[posicao - 1] + vetor[posicao]) / 2.0;
            System.out.printf("%.1f%n", mediana);
        }
        
        scan.close();
    }
}
