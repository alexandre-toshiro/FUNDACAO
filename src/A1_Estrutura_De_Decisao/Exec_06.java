package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite tr�s n�meros e saiba qual � o maior.");

		System.out.print("1� n�mero: ");
		int n1 = scan.nextInt();

		System.out.print("2� n�mero: ");
		int n2 = scan.nextInt();

		System.out.print("3� n�mero: ");
		int n3 = scan.nextInt();

		if (n1 > n2 && n1 > n3) {
			System.out.println("O primeiro n�mero digitado, " + n1 + ", � o maior n�mero.");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("O segundo n�mero digitado, " + n2 + ", � o maior n�mero.");
		} else {
			System.out.println("O terceiro n�mero digitado, " + n3 + ", � o maior n�mero.");
		}
		scan.close();
	}

}
