import java.util.Scanner;

public class HorasTrabalho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrizHoras = new int[100][7]; 
        int numeroFuncionarios = 0;

        int primeiroValor = scan.nextInt();
        while (primeiroValor != -1) {
            matrizHoras[numeroFuncionarios][0] = primeiroValor;
            for (int dia = 1; dia < 7; dia++) {
                matrizHoras[numeroFuncionarios][dia] = scan.nextInt();
            }
            numeroFuncionarios++;
            primeiroValor = scan.nextInt();
        }

        for (int funcionario = 0; funcionario < numeroFuncionarios; funcionario++) {
            int totalHoras = 0;
            for (int dia = 0; dia < 7; dia++) {
                totalHoras += matrizHoras[funcionario][dia];
            }
            System.out.println(totalHoras);
        }
    }
}

