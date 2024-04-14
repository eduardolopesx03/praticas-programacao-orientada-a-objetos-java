package list_set_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecoes {


	public static void main(String[] args) {

		//List: É uma coleção ordenada, quando inserir o elemento ele irá permanecer 
		//na ordem que se inseiriu.

		//Instanciando a coleção list (lista)
		List<Integer> lista = new ArrayList<>();

		//Para adicionar um valor a uma lista
		lista.add(1);
		lista.add(3);
		lista.add(null);
		lista.add(null);
		lista.add(1);
		
		System.out.println("List (Lista)");
		print(lista);
		
		System.out.println("\n");

		//Set: Não garante a ordem e não aceita elementos duplicados.

		//Instanciando a coleção set
		Set<Integer> set = new HashSet<>();

		//Para adicionar um valor a um set
		set.add(1);
		set.add(3);
		set.add(null);
		set.add(null);
		set.add(1);
		
		System.out.println("Set");
		print(set);
		
		System.out.println("\n");

		//Map: É uma relação de chave com valor, temos uma chave relacionada com um 
		//valor específico.

		//Instanciando a coleção map
		Map<String, Integer> map = new HashMap<>();

		//Para adicionar um valor a um set
		map.put("joao", 20);
		map.put(null, 40);
		map.put(null, 50);
		if (!map.containsKey("joao")) {
			//Exemplo de solução: para solucionar o caso de sobreescrita com duas
			//chaves de mesmo nome a última chave ser sempre a q vai entrar no map.put 
			//utilizamos esse if para se caso já existir uma chave joao o valor dele
			//continuar sendo o mesmo mas caso não exista irá entrar dentro deste if
			//e colocar o valor na chave joao como null. Nesse caso como já existe
			//ele não entrará nesse if e não vai sobreescrever o valor do joao.
			map.put("joao", null);
		}
		map.put("carlos", null);
		map.put("pedro", 50);
		
		System.out.println("Map");
		print(map);

		System.out.println("\n");
		
	}

	//Método para imprimir uma lista
	private static void print(List<Integer> item) {
		for (int i = 0; i < item.size(); i++) {
			System.out.println(item.get(i));
		}
	}

	//Método para imprimir um set
	private static void print(Set<Integer> item) {
		Iterator<Integer> iterator = item.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	//Método para imprimir um map
	private static void print(Map<String, Integer> item) {
		item.forEach((chave, valor) -> {
			System.out.println("chave: " + chave + ", valor: " + valor);		
		});

	}

}
