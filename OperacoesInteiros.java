import java.util.Scanner;

public class OperacoesInteiros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        
        while (true) {
            int quantidade = 0;
            int pares = 0;
            int impares = 0;
            int soma = 0;
            int maior = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;
            
            do {
                numero = scan.nextInt();
                
                if (numero != -1) {
                    quantidade++;
                    soma += numero;
                    if (numero % 2 == 0) {
                        pares++;
                    } else {
                        impares++;
                    }
                    
                    if (numero > maior) {
                        maior = numero;
                    }
                    
                    if (numero < menor) {
                        menor = numero;
                    }
                }
            } while (numero != -1);
            
            if (quantidade == 0) {
                break;
            }
            
            double media = (double) soma / quantidade;
            
            System.out.println(quantidade);
            System.out.println(pares);
            System.out.println(impares);
            System.out.println(soma);
            System.out.printf("%.2f%n", media);
            System.out.println(maior);
            System.out.println(menor);
        }
        
        scan.close();
    }
}
