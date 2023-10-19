import java.util.Scanner;
import java.util.Arrays;

public class CifraCesar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String original, cifrado;
        int deslocamento;

        deslocamento = scan.nextInt();
        

        original = scan.nextLine();
        cifrado = codificarTexto(original, deslocamento);
        cifrado = deslocaUm (cifrado);
        System.out.println(cifrado);

        scan.close();
    }

    public static String codificarTexto(String texto, int deslocamento) {
        char[] alfabeto = new char[26];
        char letra;

        for (int i = 0; i < 26; i++) {
            alfabeto[i] = (char) ('a' + i);
        }

        StringBuilder textoCodificado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            letra = texto.charAt(i);

            if (Character.isLetter(letra)) {
                char caractereCifrado = cifrarCaractere(letra, alfabeto, deslocamento);
                textoCodificado.append(caractereCifrado);
            } else {
                textoCodificado.append(letra);
            }
        }

        return textoCodificado.toString().toUpperCase();
    }

    public static char cifrarCaractere(char caractere, char[] alfabeto, int deslocamento) {
        char base = Character.isUpperCase(caractere) ? 'A' : 'a';

        int posicao = (Character.toLowerCase(caractere) - 'a' + deslocamento) % 26;
        return (char) (base + posicao);
    }
    
    public static String deslocaUm(String texto) {
        char[] caracteres = texto.toCharArray();
        
        String modificado = new String (Arrays.copyOfRange(caracteres, 1, caracteres.length));
        return modificado;
    }



}
