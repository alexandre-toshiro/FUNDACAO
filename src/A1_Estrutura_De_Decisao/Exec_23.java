package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro ou decimal: ");
		double n = scan.nextDouble();
		
		double fracionado = n % 1.0;
		
		if(fracionado ==0) {
			System.out.println("O n�mero � inteiro.");
		}else {
			System.out.println("O n�mero � decimal.");
		}
		
		scan.close();
	}

}
