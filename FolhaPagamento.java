import java.util.Scanner;
import java.text.DecimalFormat;

public class FolhaPagamento {
	public static void main(String[] args) {
		double valor_hora = 0;
		int horas;
		double salarioBruto, impostoRenda, totalDescontos, salarioLiquido, inss;
		Scanner scan = new Scanner(System.in);
		
		//Coletando as duas informaçoes
		valor_hora = scan.nextDouble();
		horas= scan.nextInt();
		
		//Calculando tudo agora
		salarioBruto = valor_hora*horas;
		impostoRenda = 0.11 * salarioBruto;
		inss = 0.08 * salarioBruto;
		totalDescontos = impostoRenda + inss;
		salarioLiquido = salarioBruto - totalDescontos;		
		
		//imprimindo
		 DecimalFormat df = new DecimalFormat("#0.00");
	     
		 System.out.println("Salario bruto: R$" + df.format(salarioBruto));
	     System.out.println("IR: R$" + df.format(impostoRenda));
	     System.out.println("INSS: R$" + df.format(inss));
	     System.out.println("Total de descontos: R$" + df.format(totalDescontos));
	     System.out.println("Salario liquido: R$" + df.format(salarioLiquido));
		
	}

}

