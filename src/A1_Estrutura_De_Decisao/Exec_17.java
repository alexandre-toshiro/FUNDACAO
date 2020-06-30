package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um ano para saber se é ou não bissexto: ");
		int ano = scan.nextInt();

		if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
			System.out.println("O ano " + ano + " é bissexto!");
		} else {
			System.out.println("O ano " + ano + " não é bissexto!");
		}

		scan.close();
	}

}
