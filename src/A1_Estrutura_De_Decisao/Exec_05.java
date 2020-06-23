package A1_Estrutura_De_Decisao;

import java.util.Scanner;

public class Exec_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota do aluno: ");
		double n1 = scan.nextDouble();
		
		System.out.print("Digite a segunda nota do aluno: ");
		double n2 = scan.nextDouble();
		
		double media = (n1 + n2)/2;
		
		
		if(media==10) {
			System.out.println("Aluno APROVADO COM DISTINÇÃO!!!");
			System.out.println("Média: " + media);
		}else if(media >6 && media <10){
			System.out.println("Aluno APROVADO!");
			System.out.println("Média: " + media);
		} else {
			System.out.println("Aluno REPROVADO!");
			System.out.println("Média: " + media);
		}
		
		scan.close();
	}

}
