package A2_Estrutura_De_Repeticao;

import java.util.Scanner;

public class Exec_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double nota = 0;
		do {
			System.out.println("Digite uma nota válida entre 0 e 10.");
			nota = scan.nextDouble();
		} while (nota < 0 || nota > 10);

		scan.close();

	}

}
