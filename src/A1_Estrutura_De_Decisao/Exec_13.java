package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um número para saber o dia da semana");
		int n = scan.nextInt();

		switch (n) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Terça-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;
		case 7:
			System.out.println("Sábado-Feira");
			break;
		default:
			System.out.println("Número inválido.");
		}

		scan.close();
	}

}
