package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe os 3 lados de um triângulo!");

		System.out.print("1º: ");
		int l1 = scan.nextInt();

		System.out.print("2º: ");
		int l2 = scan.nextInt();

		System.out.print("3º: ");
		int l3 = scan.nextInt();

		// Teste se é um triângulo.

		if (l1 + l2 > l3) {
			if (l1 == l2 && l1 == l3) {
				System.out.println("Triângulo Equilátero.");
			} else if ((l1 == l2) || (l2 == l3) || (l1 == l3)) {
				System.out.println("Triângulo Isósceles.");
			} else if (((l1 != l2) && (l1 != l3)) || ((l2 != l1) && (l2 != l3)) || (l1 != l2)) {
				System.out.println("Triângulo Escaleno");
			}

		} else {
			System.out.println("Não é um triângulo");
		}

		scan.close();
	}

}
