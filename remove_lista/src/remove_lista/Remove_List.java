package remove_lista;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Remove_List {

	public static void main(String[] args) {
		List<String> lista_string = new ArrayList<String>();
		
		lista_string.add("SoulOn");
		lista_string.add("Curso Java");
		lista_string.add("Eduardo");
		
		//Lista sem remover
		System.out.println("\nLista sem remover");
		for (String i : lista_string) {
			System.out.println(i);
		}
		//Lista removida
		System.out.println("\nLista removida");
		//lista_string.remove(1);
		lista_string.removeAll(lista_string); // removeAll Remove tudo da lista
		
		for(String i : lista_string) {
			System.out.println(i);
		}
		
	
		
		//Lista sem Ordenar
		/*System.out.println("\nLista sem ordenar");
		for (String i : lista_string) {
			System.out.println(i);
		}*/
		
		//Lista Ordenada
		/*System.out.println("Lista ordenada");
		
		Collections.sort(lista_string);
		for (String i : lista_string) {
			System.out.println(i);
		}*/
		
		
	}
}
