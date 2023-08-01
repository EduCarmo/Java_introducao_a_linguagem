package exercicio1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero;
		//String nome = "Soul ON";
		double valor;
		boolean status = true;
		
		/*System.out.print("Digite um valor: ");
		numero = input.nextInt();
		System.out.println("O valor digitado foi: " + numero);*/
		String nome, sobrenome;
		System.out.println("Digite seu nome");
		nome = input.nextLine();
		System.out.println("Digite seu sobrenome");
		sobrenome = input.nextLine();
		
		System.out.println(nome + " "+ sobrenome);
	}

}
