package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Informe um valor para saber se � positivo ou negativo: ");
		int n = scan.nextInt();

		if (n >= 0) {
			System.out.println("O n�mero " + n + " � positivo.");
		} else {
			System.out.println("O n�mero " + n + " � negativo.");
		}

		scan.close();

	}

}
