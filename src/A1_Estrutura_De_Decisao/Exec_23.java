package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro ou decimal: ");
		double n = scan.nextDouble();
		
		double fracionado = n % 1.0;
		
		if(fracionado ==0) {
			System.out.println("O número é inteiro.");
		}else {
			System.out.println("O número é decimal.");
		}
		
		scan.close();
	}

}
