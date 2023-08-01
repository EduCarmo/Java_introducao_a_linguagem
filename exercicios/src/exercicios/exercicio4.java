package exercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int idade;
		int soma = 0, media = 0;
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite sua idade");
			idade = input.nextInt();
			soma += idade;
			media = soma / 3;
		}
		
		System.out.println("A soma das indades é " + soma);
		System.out.println("A media das idades é "+ media);
	}

}
