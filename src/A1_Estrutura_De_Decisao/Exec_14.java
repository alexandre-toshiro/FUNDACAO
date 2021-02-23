package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe a primeira nota do aluno: ");
		double n1 = scan.nextDouble();

		System.out.print("Informe a segunda nota do aluno: ");
		double n2 = scan.nextDouble();

		double media = (n1 + n2) / 2;

		if (media > 8 && media <= 10) {
			System.out.println("Aluno aprovado!");
			System.out.println("Media: " + media);
			System.out.println("Conceito: A");
		} else if (media >= 7.5 && media < 9) {
			System.out.println("Aluno aprovado!");
			System.out.println("Media: " + media);
			System.out.println("Conceito: B");
		} else if (media >= 6 && media < 7.5) {
			System.out.println("Aluno aprovado!");
			System.out.println("Media: " + media);
			System.out.println("Conceito: C");
		} else if (media > 4 && media < 6) {
			System.out.println("Aluno reprovado!");
			System.out.println("Media: " + media);
			System.out.println("Conceito: D");
		} else if (media < 4) {
			System.out.println("Aluno reprovado!");
			System.out.println("Media: " + media);
			System.out.println("Conceito: E");
		}

		scan.close();
	}

}
