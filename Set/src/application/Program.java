/*
• HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado
• TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTo do objeto (ou Comparator)
• LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados
*/

package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");

		Set<String> set2 = new TreeSet<>();

		set2.add("Tv");
		set2.add("Tablet");
		set2.add("Notebook");

		Set<String> set3 = new LinkedHashSet<>();

		set3.add("Tv");
		set3.add("Tablet");
		set3.add("Notebook");

//		Verifica se existe o elemento especificado
		System.out.println(set.contains("Notebook"));

		System.out.println("============== \nHashSet");

		for (String p : set) {
			System.out.println(p);
		}

		System.out.println("============== \nTreeSet");

		for (String p2 : set2) {
			System.out.println(p2);
		}
		
		System.out.println("============== \nLinkedHashSet");

		for (String p3 : set3) {
			System.out.println(p3);
		}
	}
}