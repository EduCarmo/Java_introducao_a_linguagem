package set_list;

import java.util.ArrayList;
import java.util.List;

public class Set_List {

	public static void main(String[] args) {
		List<String> lista_string = new ArrayList<String>();
		
		lista_string.add("SoulOn");
		lista_string.add("Curso Java");
		lista_string.add("Eduardo");
		
		
		//GET mostra apenas o que esta na lista
		/*System.out.println("--- Metodo GET ---");
		System.out.println(lista_string.get(1));*/
		
		//SET muda um elemento da lista
		System.out.println("--- Metodo SET ---");
		lista_string.set(0, "Curso SoulOn");
		
		for (String i : lista_string) {
			System.out.println(i);
		}
	}

}
