package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um n�mero inteiro: ");
		int n = scan.nextInt();

		if (n % 2 == 0) {
			System.out.println("N�mero par.");
		} else {
			System.out.println("N�mero �mpar.");
		}

		scan.close();
	}

}
