package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o 1º número: ");
		double n1 = scan.nextDouble();

		System.out.println("Informe o 2º número: ");
		double n2 = scan.nextDouble();

		System.out.println("Escolha uma operação (+ - / *): ");
		String operacao = scan.next();

		double resultado = 0;
		boolean valida = true;

		switch (operacao) {
		case "+":
			resultado = n1 + n2;
			break;
		case "-":
			resultado = n1 - n2;
			break;
		case "/":
			resultado = n1 / n2;
			break;
		case "*":
			resultado = n1 * n2;
			break;
		default:
			System.out.println("Operação inválida");
			valida = false;
		}

		if (valida) {
			System.out.println("Resultado: " + resultado);

			double fracionado = resultado % 1;

			if (resultado >= 0) {
				System.out.println("Resultado positivo.");
			} else {
				System.out.println("Resultado negativo.");
			}

			if (resultado % 2 == 0) {
				System.out.println("Resultado par.");
			} else {
				System.out.println("Resultado ímpar.");
			}
			if (fracionado == 0) {
				System.out.println("Resultado inteiro");
			} else {
				System.out.println("Resultado decimal.");
			}
		}

		scan.close();
	}

}
