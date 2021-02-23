package A2_Estrutura_De_Repeticao;

import java.util.Scanner;

public class Exec_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um nome de Usuario");
		String nome = scan.nextLine();
		
		System.out.println("Digite uma senha");
		String senha = scan.nextLine();
		
		while(nome.equalsIgnoreCase(senha)) {
			System.out.println("ERRO: DIGITE UMA SENHA DIFERENTE DO USUÁRIO");
			System.out.print("Senha: ");
			senha = scan.nextLine();
		}
		
		
		System.out.println("Usuário: " + nome);
		System.out.println("Senha: " + senha);
		
		scan.close();
	}

}
