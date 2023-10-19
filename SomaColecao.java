import java.util.Scanner;

public class SomaColecao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor;
        int soma = 0;

        while (true) {
            valor = scan.nextInt();

            if (valor == -1) {
                break;
            }

            soma += valor;
        }

        System.out.println(soma);
    }
}
