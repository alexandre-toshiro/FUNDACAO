package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("1 - File Duplo");
		System.out.println("2 - Alcatra");
		System.out.println("3 - Picanha");
		System.out.println("Qual tipo de carne deseja comprar?");

		String carne = null;
		int tipo = scan.nextInt();
		double preco = 0;

		System.out.println("Quantos kilos deseja?");
		int quantidadeKilos = scan.nextInt();

		System.out.println("A compra será com o cartão Tabajara? 1 - SIM / 2 - NÃO");
		int resposta = scan.nextInt();

		if (tipo == 1) {
			carne = "File Duplo";
			if (quantidadeKilos > 5) {
				preco = quantidadeKilos * 5.80;
			} else {
				preco = quantidadeKilos * 4.90;

			}
		}

		if (tipo == 2) {
			carne = "Alcatra";
			if (quantidadeKilos > 5) {
				preco = quantidadeKilos * 6.80;
			} else {
				preco = quantidadeKilos * 5.90;
			}
		}

		if (tipo == 3) {
			carne = "Picanha";

			if (quantidadeKilos > 5) {
				preco = quantidadeKilos * 7.80;
			} else {
				preco = quantidadeKilos * 6.90;
			}
		}

		if (resposta == 1) {
			preco = preco - (preco * 0.1);
		}

		System.out.println("==========CUPOM FISCAL==========");
		System.out.println("CARNE: " + carne);
		System.out.println("QUANTIDADE: " + quantidadeKilos);
		System.out.println("PREÇO: R$ " + preco);

		scan.close();
	}

}
