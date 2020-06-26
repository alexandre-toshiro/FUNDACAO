package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual turno você estuda?");

		System.out.println("M - Matutino.");
		System.out.println("V - Vespertino.");
		System.out.println("N - Noturno.");

		char periodo = Character.toLowerCase(scan.next().charAt(0));

		if (periodo == 'm') {
			System.out.println("Bom dia!");
		} else if (periodo == 'v') {
			System.out.println("Boa tarde!");
		} else if (periodo == 'n') {
			System.out.println("Boa noite!");
		}else {
			System.out.println("Valor inválido!");
		}
		scan.close();
	}

}
