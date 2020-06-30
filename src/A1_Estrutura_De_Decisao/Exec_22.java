package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um número inteiro: ");
		int n = scan.nextInt();

		if (n % 2 == 0) {
			System.out.println("Número par.");
		} else {
			System.out.println("Número ímpar.");
		}

		scan.close();
	}

}
