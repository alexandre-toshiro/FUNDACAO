package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número inteiro entre 100 e 999");
		int n = scan.nextInt();

		if (n > 100 && n < 1000) {
			int unidade = n % 10;
			n = (n - unidade) / 10;

			int dezena = n % 10;
			n = (n - dezena) / 10;

			int centena = n;

			System.out.println(centena + " centena(s), " + dezena + " dezena(s) e " + unidade + " unidade(s).");

		} else {
			System.out.println("Número inválido");
		}

		scan.close();
	}

}
