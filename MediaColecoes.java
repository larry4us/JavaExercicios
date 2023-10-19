import java.util.Scanner;

public class MediaColecoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor;
        while (true) {
            double media;
            int soma = 0, cont = 0;
            while (true) {
                valor = scan.nextInt();

                if (valor == -1) {
                    break;
                }
                soma += valor;
                cont += 1;
            }
            if (soma == 0) {
                break;
            }
            media = (double) soma / cont; 
            System.out.printf("%.2f%n", media);
        }
    }
}
