package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int cont = 0;

		System.out.println("Telefonou para a v�tima?(s/n)");
		char res = scan.next().charAt(0);
		if (res == 's') {
			cont++;
		}

		System.out.println("Esteve no local do crime?(s/n)");
		res = scan.next().charAt(0);
		if (res == 's') {
			cont++;
		}

		System.out.println("Mora perto da v�tima?(s/n)");
		res = scan.next().charAt(0);
		if (res == 's') {
			cont++;
		}

		System.out.println("Devia para a v�tima?(s/n)");
		res = scan.next().charAt(0);
		if (res == 's') {
			cont++;
		}

		System.out.println("J� trabalhou com a v�tima?(s/n)");
		res = scan.next().charAt(0);
		if (res == 's') {
			cont++;
		}

		if (cont == 2) {
			System.out.println("Pessoa suspteita!");
		} else if (cont > 2 && cont < 5) {
			System.out.println("Pessoa c�mplice!");
		} else if (cont == 5) {
			System.out.println("Assassino!!!");
		} else {
			System.out.println("Inocente!");
		}

		scan.close();
	}

}
