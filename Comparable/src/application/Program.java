package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
	/*	
	 	Opção de compareTo no programa principal
	  
		Comparator<Product> comp = new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};
		
		list.sort(comp);
		
		=======================================================================================================
		
		Função anônima (lâmbida sem chaves/arrow function)
		
		Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		list.sort(comp);
		
		=======================================================================================================
		
		Lambda direto no argumento
		
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
	*/
		
		list.sort(new MyComparator());
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}