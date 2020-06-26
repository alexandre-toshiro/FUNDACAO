package A1_Estrutura_De_Decisao;

import java.util.Scanner;

//adaptado
public class Exec_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe o salário bruto: R$");
		double salarioBruto = scan.nextDouble();

		double impostoRenda = 0;
		double sindicato = 0;
		double fgts = 0;
		double salarioLiquido = 0;

		if (salarioBruto <= 900) {
			impostoRenda = 0;
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			impostoRenda = 0.05;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			impostoRenda = 0.1;
		} else if (salarioBruto > 2500) {
			impostoRenda = 0.2;
		}
		 
		sindicato = salarioBruto * 0.03;
		fgts = salarioBruto * 0.11;
		salarioLiquido = salarioBruto - (salarioBruto*impostoRenda) - sindicato;
		
		System.out.println("Imposto de Renda: %" + impostoRenda*100);
		System.out.println("Sindicato: R$ " + sindicato);
		System.out.println("FGTS: R$ " + fgts);
		System.out.println("Salário Líquido: R$ " + salarioLiquido);
		

		scan.close();
	}

}
