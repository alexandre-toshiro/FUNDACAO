package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// p = pre�o.
		System.out.print("Informe o pre�o do primeiro produto: R$");
		double p1 = scan.nextDouble();

		System.out.print("Informe o pre�o do segundo produto: R$");
		double p2 = scan.nextDouble();

		System.out.print("Informe o pre�o do terceiro produto: R$");
		double p3 = scan.nextDouble();

		double menorPreco = p1;

		if (p2 < p1 && p2 < p3) {
			menorPreco = p2;
		} else if (p3 < p1 && p3 < p2) {
			menorPreco = p3;
		}

		System.out.println("Voc� dever� comprar produto que custa R$" + menorPreco + ", pois � o mais barato.");

		scan.close();
	}

}
