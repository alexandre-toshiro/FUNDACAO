package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a 1º nota do aluno: ");
		double n1 = scan.nextDouble();

		System.out.print("Digite a 2º nota do aluno: ");
		double n2 = scan.nextDouble();

		System.out.print("Digite a 3º nota do aluno: ");
		double n3 = scan.nextDouble();

		double media = (n1 + n2 + n3) / 3;

		if (media == 10) {
			System.out.println("Aluno aprovado com distinção!");
		} else if (media >= 7 && media < 10) {
			System.out.println("Aluno aprovado!");
		} else if (media >= 0 && media < 7) {
			System.out.println("Aluno reprovado!");
		} else {
			System.out.println("Erro inesperado");
		}

		scan.close();
	}

}
