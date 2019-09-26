package trabalho1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Atividade5 {

	public static void main(String[] args) {

		List<String> listString = new ArrayList<>();
		
		listString.add("ovos");
		listString.add("leite");
		listString.add("açucar");
		listString.add("chocolate");
		listString.add("farinha");
		
		System.out.println("Elementos iniciais: ");
		for(String string : listString) {
			System.out.println(string);
		}
		
		System.out.println("\nElemento final removido: ");
		listString.remove(listString.size() - 1);
		for(String string : listString) {
			System.out.println(string);
		}
		
		System.out.println("\nElemento 'café' adicionado início lista: ");
		listString.add(0, "café");
		for(String string : listString) {
			System.out.println(string);
		}
		
		System.out.println("\nElemento 'açucar' alterado para 'mel': ");
		listString.set(listString.indexOf("açucar"), "mel");
		for(String string : listString) {
			System.out.println(string);
		}
	
		System.out.println("\nElemento 'leite' está na posição: " + (listString.indexOf("leite") + 1));
		
		System.out.println("\nLista ordenada: ");
		Collections.sort(listString);
		for(String string : listString) {
			System.out.println(string);
		}
				
	}

}
