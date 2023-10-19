import java.util.Scanner;

public class DataExtenso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String data = scan.next();

        String dia = data.substring(0, 2);
        String mes = data.substring(2, 4);
        String ano = data.substring(4);

        String mesExtenso = obterMesExtenso(mes);

        System.out.println(dia + " de " + mesExtenso + " de " + ano);
   
        scan.close();
    }

    public static String obterMesExtenso(String mes) {
        int mesInt = Integer.parseInt(mes);
        String[] mesesExtenso = {"",
            "janeiro", "fevereiro", "março", "abril", "maio", "junho",
            "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };

        return mesesExtenso[mesInt];
    }
}
