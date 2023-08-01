package exercicio;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2;
		System.out.println("Digite o primeiro valor");
		n1 = input.nextInt();
		System.out.println("Digite o segundo valor");
		n2 = input.nextInt();
		
		System.out.println((n1 > n2)? "O maior numero é " + n1 : "O maior numero é " + n2 );

	}

}
