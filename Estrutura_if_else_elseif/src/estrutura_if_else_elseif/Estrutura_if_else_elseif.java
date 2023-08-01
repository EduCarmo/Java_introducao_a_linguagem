package estrutura_if_else_elseif;

import java.util.Scanner;

public class Estrutura_if_else_elseif {

	public static void main(String[] args) {
		String nome;
		int idade;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		nome = input.nextLine();
		
		System.out.println("Digite sua idade");
		idade = input.nextInt();
		
		if (idade >= 18) {
			System.out.println("Olá " + nome + ", você é maior de idade");
		}else if (idade > 15 && idade < 18){
			System.out.println("Olá " + nome + " Falta pouco para você criar idade para acessar o sistema");
		}else {
			System.out.println("Ops.." + nome + " você não pode acessar o sistema");
		}

	}

}
