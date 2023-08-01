package exercicio;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero;
		System.out.println("Digite um valor");
		numero = input.nextInt();
		if ((numero % 2) == 0) {
			System.out.println("O valor digitado é PAR");
		}else {
			System.out.println("O valor digitado é IMPAR");
		}

	}

}
