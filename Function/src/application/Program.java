/*
 * Fazer um programa que, a partir de uma lista de produtos, gere uma nova lista contendo os nomes dos produtos em caixa alta.
 */

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		/*
			Referência método estático
			List<String> names = list.stream().map(Product::staticaUpperCaseName).collect(Collectors.toList());
			
			Referência método não estático
			List<String> names = list.stream().map(Product::noStaticaUpperCaseName).collect(Collectors.toList());

			Lambda declarada
			Function<Product, String> func = p-> p.getName().toUpperCase(); 
			List<String> names = list.stream().map(func).collect(Collectors.toList());
			
			Lamda inline
			List<String> names = list.stream().map(p-> p.getName().toUpperCase()).collect(Collectors.toList());
			names.forEach(System.out::println);
		 */
		
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}
}