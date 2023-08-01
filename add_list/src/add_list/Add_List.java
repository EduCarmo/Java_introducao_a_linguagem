package add_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Add_List {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n;
		List<String> lista_string = new ArrayList<String>();
		List<Integer> lista_int = new ArrayList<Integer>();
		
		lista_string.add("SoulOn");
		lista_string.add("Curso Java");
		
		System.out.println("Digite um nome");
		n = input.nextLine();
		lista_string.add(n);
		
		for (String valor : lista_string) {
			System.out.println(valor);
		}
	}

}
