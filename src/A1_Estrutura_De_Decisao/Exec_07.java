package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite tr�s n�meros e saiba qual � o maior e o menor.");

		System.out.print("1� n�mero: ");
		int n1 = scan.nextInt();

		System.out.print("2� n�mero: ");
		int n2 = scan.nextInt();

		System.out.print("3� n�mero: ");
		int n3 = scan.nextInt();

		int menor = n1;
		
		if(n2<n1 && n2<n3) {
			menor = n2;
		}else if(n3<n1 && n3<n2) {
			menor = n2;
		}
		
		int maior = n1;
		
		if(n2>n1 && n2>n3) {
			maior = n2;
		}else if(n3>n1 && n3>n2) {
			maior = n3;
		}
		
		System.out.println("O maior n�mero �: " + maior + ".");
		System.out.println("O menor n�mero �: " + menor + ".");

		scan.close();
	}

}
