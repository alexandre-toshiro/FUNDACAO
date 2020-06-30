package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um valor para saque entre R$ 10,00 e R$ 600,00.");
		int valor = scan.nextInt();
		
		if(valor >10 && valor <=600) {
		int cem = valor/100;
		valor = valor %100;
		
		int cinquenta = valor/50;
		valor = valor %50;
		
		int dez = valor/10;
		valor = valor%10;
		
		int cinco = valor/5;
		valor = valor %5;
		
		int um = valor;
		
		System.out.println("Nota de R$ 100,00 = " + cem);
		System.out.println("Nota de R$ 50,00 = " + cinquenta);
		System.out.println("Nota de R$ 10,00 = " + dez);
		System.out.println("Nota de R$ 5,00 = " + cinco);
		System.out.println("Nota de R$ 1,00 = " + um);
		}else {
			System.out.println("Valor inválido");
		}
		scan.close();
	}

}
