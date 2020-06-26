package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe os valores para calcular uma equação de 2º grau.");

		System.out.println("a: ");
		int a = scan.nextInt();

		if (a < 0) {
			System.out.println("Equação não é do 2º grau!");
		} else {

			System.out.println("b: ");
			int b = scan.nextInt();

			System.out.println("c: ");
			int c = scan.nextInt();

			double delta = (b * b) - (4 * a * c);

			if (delta < 0) {
				System.out.println("A equação não possui raízes reais!");
			} else if (delta == 0) {
				double raiz = -b / (2 * a);
				System.out.println("Delta = 0, raiz = " + raiz);
			} else {
				double raiz1 = ((-b) + Math.sqrt(delta)) / (2 * a);
				double raiz2 = ((-b) - Math.sqrt(delta)) / (2 * a);
				System.out.println("Delta maior que 0, raizes: " + raiz1 + ", " + raiz2);
			}
		}

		scan.close();
	}

}
