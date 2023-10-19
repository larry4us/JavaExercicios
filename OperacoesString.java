import java.util.Scanner;

public class OperacoesString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tamanho;
		
		String nome = scan.nextLine();
		tamanho = nome.length();
		char primeira_letra = nome.charAt(0);
		char ultima_letra = nome.charAt(tamanho-1);
		String maiusculo = nome.toUpperCase();
		String minusculo = nome.toLowerCase();
		String substituido = nome.replace('a','e');
		
		
		
		System.out.println(tamanho);
		System.out.println(primeira_letra);
	    System.out.println(ultima_letra);
	    System.out.println(maiusculo);
	    System.out.println(minusculo);
	    System.out.println(substituido);
	    for (int i = 0; i < tamanho; i++) {
            if (i % 2 == 0) {
                System.out.print(nome.charAt(i));
            }
        }
	    System.out.println();
	    System.out.println(contarVogais(nome));
	    
	}
	
	 public static int contarVogais(String str) {
	        int quantidadeVogais = 0;
	        String vogais = "aeiouAEIOU";

	        for (int i = 0; i < str.length(); i++) {
	            char caractere = str.charAt(i);
	            if (vogais.indexOf(caractere) != -1) {
	                quantidadeVogais++;
	            }
	        }

	        return quantidadeVogais;
	    }

}
