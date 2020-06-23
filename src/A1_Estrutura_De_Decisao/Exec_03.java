package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite 'M' para masculino e 'F' para femino: ");
		char sexo = Character.toUpperCase(scan.next().charAt(0));

		if (sexo == 'M') {
			System.out.println("Masculino.");
		} else if (sexo == 'F') {
			System.out.println("Femino.");
		} else {
			System.out.println("Sexo inválido.");
		}

		scan.close();
	}

}
