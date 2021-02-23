package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double gasolina = 2.5;
		double descontoGasolinaAteVinteLitros = 0.03;
		double descontoGasolinaAcimaVinteLitros = 0.05;

		double alcool = 1.9;
		double descontoAlcoolAteVinteLitros = 0.04;
		double descontoAcoolAcimaVinteLitros = 0.06;
		double litros = 0;

		System.out.println("G - GASOLINA");
		System.out.println("A - ALCOOL");
		System.out.println("Qual tipo de combustivél deseja abaster?");

		String escolhaCombustivel = scan.nextLine();

		if (escolhaCombustivel.equalsIgnoreCase("G")) {
			System.out.println("Quantos litros de gasolina deseja abastecer?");
			litros = scan.nextDouble();
			double litroComDesconto = 0;
			double totalPreco = 0;

			if (litros > 20) {
				litroComDesconto = gasolina - (gasolina * descontoGasolinaAcimaVinteLitros);
				totalPreco = litroComDesconto * litros;
			} else {
				litroComDesconto = gasolina - (gasolina * descontoGasolinaAteVinteLitros);
				totalPreco = litroComDesconto * litros;
			}
			System.out.println("Total de litros: " + litros);
			System.out.println("Preço pago por litro: R$ " + litroComDesconto);
			System.out.println("Preço total: R$ " + totalPreco);
		}

		if (escolhaCombustivel.equalsIgnoreCase("A")) {
			System.out.println("Quantos litros de Álcool deseja abastecer?");
			litros = scan.nextDouble();
			double litroComDesconto = 0;
			double totalPreco = 0;

			if (litros > 20) {
				litroComDesconto = alcool - (alcool * descontoAcoolAcimaVinteLitros);
				totalPreco = litroComDesconto * litros;
			} else {
				litroComDesconto = alcool - (alcool * descontoAlcoolAteVinteLitros);
				totalPreco = litroComDesconto * litros;
			}
			System.out.println("Total de litros: " + litros);
			System.out.println("Preço pago por litro: R$ " + litroComDesconto);
			System.out.println("Preço total: R$ " + totalPreco);
		}

		scan.close();
	}

}
