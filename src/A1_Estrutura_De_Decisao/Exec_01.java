package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Informe o primeiro n�mero: ");
		int n1 = scan.nextInt();

		System.out.print("Informe o segundo n�mero: ");
		int n2 = scan.nextInt();

		if (n1 > n2) {
			System.out.println("O n�mero " + n1 + " � maior.");
		} else {
			System.out.println("O n�mero " + n2 + " � o maior.");
		}

		scan.close();

	}

}
