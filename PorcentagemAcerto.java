import java.util.Scanner;

public class PorcentagemAcerto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] respostas;
        int[] gabarito;
        int tamanho = 0;

        respostas = lerVetor(scan);
        gabarito = lerVetor(scan);

        tamanho = respostas.length;
        int acertos = contarAcertos(respostas, gabarito);
        double porcentagem = (double) acertos / tamanho * 100;

        System.out.printf("%.2f", porcentagem);
   }
 

    public static int[] lerVetor(Scanner scan) {
        int[] vetor = new int[100]; //
        int i = 0;
        while (true) {
            int numero = scan.nextInt();
            if (numero == -1) {
                break;
            }
            vetor[i++] = numero;
        }

        int[] resultado = new int[i];
        System.arraycopy(vetor, 0, resultado, 0, i);
        return resultado;
    }

    public static int contarAcertos(int[] respostas, int[] gabarito) {
        int acertos = 0;
        for (int i = 0; i < respostas.length; i++) {
            if (respostas[i] == gabarito[i]) {
                acertos++;
            }
        }
        return acertos;
    }
}
