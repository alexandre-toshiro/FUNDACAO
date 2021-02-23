package A2_Estrutura_De_Repeticao;

import java.util.Scanner;

public class Exec_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o seu nome: ");
		String nome = scan.nextLine();

		while (nome.length() <= 3) {
			System.out.println("ERRO: O nome deve ter mais de 3 caracteres. Digite Novamente: ");
			nome = scan.nextLine();
		}

		System.out.println("Digite a sua idade: (Entre 0 e 120 anos)");
		int idade = scan.nextInt();

		while (idade < 0 || idade > 120) {
			System.out.println("ERRO: A idade digitada deve estar entra 0 e 120! Digite novamente: ");
			idade = scan.nextInt();
		}

		System.out.println("Digite o seu salário");
		double salario = scan.nextDouble();

		while (salario < 0) {
			System.out.println("ERRO: O Salário digitado deve ser maior que 0. Tente novamente: ");
			salario = scan.nextDouble();
		}

		System.out.println("Digite o seu sexo - (F - FEMININO / M - MASCULINO)");
		String sexo = scan.next();

		while (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")) {
			System.out.println("ERRO: O sexo digitado deve ser 'F' ou 'M'. Tente novamente: ");
			sexo = scan.next();
		}

		System.out.println("Digite o seu estado civil - (S - SOLTEITO / C - CASADO / V - VIUVO / D - DIVORCIADO");
		String estadoCivil = scan.next();

		while (!estadoCivil.equalsIgnoreCase("S") && !estadoCivil.equalsIgnoreCase("C")
				&& !estadoCivil.equalsIgnoreCase("V") && !estadoCivil.equalsIgnoreCase("D")) {
			System.out.println("ERRO - Estado civil inválido. Tente novamente: ");
			estadoCivil = scan.next();
		}
		
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civíl: " + estadoCivil);
		
		

		scan.close();

	}

}
