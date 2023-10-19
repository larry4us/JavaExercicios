import java.util.Scanner;

public class TimeFutebol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] golsTime = new int[100]; 
        int[] golsAdversario = new int[100]; 
        int tamanho = 0;
        int numero;

        while (true) {
            numero = scan.nextInt();
            
            if (numero == -1) {
                break;
            }
            
            golsTime[tamanho] = numero;
            tamanho++;
        }
        
        for (int i = 0; i < tamanho; i ++) {
        	numero = scan.nextInt();
        	
        	if (numero == -1) {
                break;
            }
        	
        	golsAdversario[i] = numero;
        }

        int vitorias = 0;
        int empates = 0;
        int derrotas = 0;

        for (int i = 0; i < tamanho; i++) {
            if (golsTime[i] > golsAdversario[i]) {
                vitorias++;
            } else if (golsTime[i] == golsAdversario[i]) {
                empates++;
            } else {
                derrotas++;
            }
        }

        System.out.println(vitorias + " " + empates + " " + derrotas);
        
        scan.close();
    }
}
