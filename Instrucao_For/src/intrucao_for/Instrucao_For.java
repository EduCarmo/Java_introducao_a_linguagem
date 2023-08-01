package intrucao_for;

import java.util.Scanner;

public class Instrucao_For {

	public static void main(String[] args) {
		int idade;
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Digite sua idade");
			idade = input.nextInt();
			if (idade >= 18) {
				System.out.println("Você é maior de idade");
			}else {
				System.out.println("Você é menor de idade");
			}
			
		}

	}

}
