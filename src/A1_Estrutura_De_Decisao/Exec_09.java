package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite três números.");

		System.out.print("1º número: ");
		int n1 = scan.nextInt();

		System.out.print("2º número: ");
		int n2 = scan.nextInt();

		System.out.print("3º número: ");
		int n3 = scan.nextInt();

		int aux = 0;

		if (n3 > n2) {
			aux = n3;
			n3 = n2;
			n2 = aux;
		}
		if (n2 > n1) {
			aux = n2;
			n2 = n1;
			n1 = aux;
		}
		if (n3 > n2) {
			aux = n3;
			n3 = n2;
			n2 = aux;
		}

		System.out.println(n1 + ", " + n2 + ", " + n3);

		scan.close();
	}

}
