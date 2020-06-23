package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite uma letra para saber se é vogal ou consoante: ");
		char letra = Character.toLowerCase(scan.next().charAt(0));

		if (letra == 'a') {
			System.out.println("A letra " +"'"+ letra +"'" +" é uma vogal.");
		} else if (letra == 'e') {
			System.out.println("A letra " +"'"+ letra +"'" +" é uma vogal.");
		} else if (letra == 'i') {
			System.out.println("A letra " +"'"+ letra +"'" +" é uma vogal.");
		} else if (letra == 'o') {
			System.out.println("A letra " +"'"+ letra +"'" +" é uma vogal.");
		} else if (letra == 'u') {
			System.out.println("A letra " +"'"+ letra +"'" +" é uma vogal.");
		} else {
			System.out.println("A letra " +"'"+ letra +"'" +" é uma consoante.");
		}

		scan.close();
	}

}
