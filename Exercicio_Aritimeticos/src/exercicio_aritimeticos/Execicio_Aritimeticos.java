package exercicio_aritimeticos;

import java.util.Scanner;

public class Execicio_Aritimeticos {

	public static void main(String[] args) {
		
		int num1, num2, resultado;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um valor");
		num1 = input.nextInt();
		System.out.println("Digite o segundo valor:");
		num2 = input.nextInt();
		
		resultado = num1 + num2;
		
		System.out.println("A soma dos valores digitados é: " + resultado);
		
		resultado++;
		System.out.print("O valor com incremento: " + resultado);
		resultado--;
		System.out.print("\nO valor com incremento: " + resultado);

	}

}
