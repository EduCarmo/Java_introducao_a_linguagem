package intrução_while;

import java.util.Scanner;

public class instrucao_while {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 0;
		System.out.println("Bem vindo ao jogo");
		while(i != 9) {
			System.out.println("Digite um numero para sair do loop");
			i = input.nextInt();
		}
		
		System.out.println("Você acertou, Fim de jogo");
	}

}
