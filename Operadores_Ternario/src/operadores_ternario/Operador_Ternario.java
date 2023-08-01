package operadores_ternario;

import java.util.Scanner;

public class Operador_Ternario {

	public static void main(String[] args) {
		String nome;
		int idade;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		nome = input.nextLine();
		
		System.out.println("Digite sua idade");
		idade = input.nextInt();

		System.out.println((idade > 18 )? "Olá " + nome + 
				", você é maior de idade" : "Ops.." + nome + 
				" você não pode acessar o sistema");
	}

}
