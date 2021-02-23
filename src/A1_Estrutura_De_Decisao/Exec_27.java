package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double precoMorangoAte5Kg = 2.5;
		double precoMorangoAcima5kg = 2.2;

		double precoMacaAte5Kg = 1.80;
		double precoMacaAcima5kg = 1.5;

		System.out.println("Quantos kilos de morango deseja comprar?");
		double kilosMorango = scan.nextDouble();

		System.out.println("Quantos kilos de maça deseja comprar?");
		double kilosMaca = scan.nextDouble();

		double totalPrecoMorango = 0;
		double totalPrecoMaca = 0;

		double totalKilos = kilosMaca + kilosMorango;

		if (kilosMorango > 5) {
			totalPrecoMorango = kilosMorango * precoMorangoAcima5kg;
		} else {
			totalPrecoMorango = kilosMorango * precoMorangoAte5Kg;
		}

		if (kilosMaca > 5) {
			totalPrecoMaca = kilosMaca * precoMacaAcima5kg;
		} else {
			totalPrecoMaca = kilosMaca * precoMacaAte5Kg;
		}

		double totalPreco = totalPrecoMorango + totalPrecoMaca;

		if (totalKilos > 8 || totalPreco > 25) {
			double desconto = totalPreco * 0.1;
			double precoTotalComDesconto = totalPreco - desconto;

			System.out.println("Cliente ganhou desconto no valor final de 10%!!!!");
			System.out.println("Valor a pagar: R$ " + precoTotalComDesconto);
		} else {

			System.out.println("Valor total a pagar: R$ " + totalPreco);
		}

		scan.close();
	}

}
