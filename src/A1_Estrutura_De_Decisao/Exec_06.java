package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite três números e saiba qual é o maior.");

		System.out.print("1º número: ");
		int n1 = scan.nextInt();

		System.out.print("2º número: ");
		int n2 = scan.nextInt();

		System.out.print("3º número: ");
		int n3 = scan.nextInt();

		if (n1 > n2 && n1 > n3) {
			System.out.println("O primeiro número digitado, " + n1 + ", é o maior número.");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("O segundo número digitado, " + n2 + ", é o maior número.");
		} else {
			System.out.println("O terceiro número digitado, " + n3 + ", é o maior número.");
		}
		scan.close();
	}

}
