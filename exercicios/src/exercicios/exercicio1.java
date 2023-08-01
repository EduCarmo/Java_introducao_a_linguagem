package exercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valorDigitado;
		System.out.println("Digite um valor");
		valorDigitado = input.nextInt();
		System.out.println("Numeros pares anteriores ao numero digitado");
		for (int i = 0; i <= valorDigitado; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
