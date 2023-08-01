package estrutura_switch;

import java.util.Scanner;

public class Estrutura_Switch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2, resultado; 
		char opcao;
		
		System.out.println("Digite o primeiro valor");
		n1 = input.nextInt();
		System.out.println("Digite o segundo valor");
		n2 = input.nextInt();
		
		input.nextLine();
		
		//MENU
		System.out.println("Digite + para Soma");
		System.out.println("Digite - para Dividir");
		System.out.println("Digite * para Multiplicar");
		System.out.println("Digite / para Dividir\n");
		System.out.println("Digite a operação desejada");
		opcao = input.nextLine().charAt(0); // Retorna o caractere presente em uma posição específica da string
		
		switch (opcao) {
			case '+' :
				resultado = n1 + n2;
				System.out.println("O resultado da soma é: " + (resultado = n1 + n2));
				break;
			case '-':
				System.out.println("O resultado da subtração é: " + (resultado = n1 - n2));
				break;
			case '*':
				System.out.println("O resultado da multiplicação é: " + (resultado = n1 * n2));
				break;
			case '/':
				System.out.println("O resultado da divisão é: " + (resultado = n1 / n2));
				break;
			default:
				System.out.println("Operação digitada foi invalida");
				break;
		}
	}

}
