package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double salario;
		double aumentoPercentual = 0;
		double valorAumentado = 0;
		double novoSalario = 0;

		System.out.print("Informe o salário do funcionário: R$ ");
		salario = scan.nextDouble();

		if (salario <= 280) {
			aumentoPercentual = 0.2;
			valorAumentado = salario * aumentoPercentual;
			novoSalario = salario + valorAumentado;
		} else if (salario > 280 && salario <= 700) {
			aumentoPercentual = 0.15;
			valorAumentado = salario * aumentoPercentual;
			novoSalario = salario + valorAumentado;
		} else if (salario > 700 && salario <= 1500) {
			aumentoPercentual = 0.1;
			valorAumentado = salario * aumentoPercentual;
			novoSalario = salario + valorAumentado;
		} else if (salario > 1500) {
			aumentoPercentual = 0.05;
			valorAumentado = salario * aumentoPercentual;
			valorAumentado = salario * aumentoPercentual;
			novoSalario = salario + valorAumentado;
		}else {
			System.out.println("Erro inesperado");
		}
		System.out.println();
		System.out.println("Salário atual: R$ " + salario);
		System.out.println("Porcentagem do aumento: " + aumentoPercentual);
		System.out.println("Valor do aumento: R$ " + valorAumentado);
		System.out.println("Novo salário: R$ " + novoSalario);

		scan.close();
	}

}
