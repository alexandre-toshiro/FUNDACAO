package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_18 {
// data válida apenas com condicional
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma data");

		System.out.print("Dia: ");
		int dia = scan.nextInt();

		System.out.print("Mês: ");
		int mes = scan.nextInt();

		System.out.print("Ano: ");
		int ano = scan.nextInt();

		boolean validacao = false;

		if (ano > 0 && ano < 9999) {
			// Meses com 31 dias
			if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				if (dia > 0 && dia <= 31) {
					validacao = true;
				}
			} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {// Meses com 30 dias
				if (dia > 0 && dia <= 30) {
					validacao = true;
				}
			} else if (mes == 2) {// checa ano bissexto
				if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
					if (dia <= 29) {
						validacao = true;
					} else if (dia <= 28) {
						validacao = true;
					}
				}
			}

			if (validacao) {
				System.out.println("Data válida.");
			} else {
				System.out.println("Data inválida.");
			}

		} else {
			System.out.println("Data inválida");
		}

		scan.close();
	}

}
