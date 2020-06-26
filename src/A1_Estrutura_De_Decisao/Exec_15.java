package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe os 3 lados de um tri�ngulo!");

		System.out.print("1�: ");
		int l1 = scan.nextInt();

		System.out.print("2�: ");
		int l2 = scan.nextInt();

		System.out.print("3�: ");
		int l3 = scan.nextInt();

		// Teste se � um tri�ngulo.

		if (l1 + l2 > l3) {
			if (l1 == l2 && l1 == l3) {
				System.out.println("Tri�ngulo Equil�tero.");
			} else if ((l1 == l2) || (l2 == l3) || (l1 == l3)) {
				System.out.println("Tri�ngulo Is�sceles.");
			} else if (((l1 != l2) && (l1 != l3)) || ((l2 != l1) && (l2 != l3)) || (l1 != l2)) {
				System.out.println("Tri�ngulo Escaleno");
			}

		} else {
			System.out.println("N�o � um tri�ngulo");
		}

		scan.close();
	}

}
