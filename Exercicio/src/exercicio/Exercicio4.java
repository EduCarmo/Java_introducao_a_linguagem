package exercicio;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char letra;
		System.out.println("Digite uma letra");
		letra = input.nextLine().charAt(0);
		
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("A letra digitada é vogal ");
		}else {
			System.out.println("A letra digitada não é vogal");
		}
		

	}

}
