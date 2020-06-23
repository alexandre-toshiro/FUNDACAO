package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Informe o primeiro número: ");
		int n1 = scan.nextInt();

		System.out.print("Informe o segundo número: ");
		int n2 = scan.nextInt();

		if (n1 > n2) {
			System.out.println("O número " + n1 + " é maior.");
		} else {
			System.out.println("O número " + n2 + " é o maior.");
		}

		scan.close();

	}

}
