package exercicios;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valorDigitado;
		int soma = 0;
		System.out.println("Digite um valor");
		valorDigitado = input.nextInt();
		
		for (int i = 0; i < valorDigitado; i++) {
			if (i % 2 == 0) {
				soma += i;
			}
		}
		System.out.println("A soma dos valores é " + soma);
	}

}
