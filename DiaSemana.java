import java.util.Scanner;

public class DiaSemana {
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


        int[] totalHorasPorDia = new int[7];
        for (int funcionario = 0; funcionario < numeroFuncionarios; funcionario++) {
            for (int dia = 0; dia < 7; dia++) {
                totalHorasPorDia[dia] += matrizHoras[funcionario][dia];
            }
        }


        int maxHoras = 0;
        for (int dia = 0; dia < 7; dia++) {
            if (totalHorasPorDia[dia] > maxHoras) {
                maxHoras = totalHorasPorDia[dia];
            }
        }


        for (int dia = 0; dia < 7; dia++) {
            if (totalHorasPorDia[dia] == maxHoras) {
                System.out.println(dia + 1);
            }
        }
    }
}
