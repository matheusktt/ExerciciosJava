/*
 * Desconto de 10% em cada item da lista.
 */

package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.PriceUpdate;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		/*
		 	Referência método estático
			list.forEach(Product::staticPriceUpdate);
			
			Referência método não estático
			list.forEach(Product::noStaticPriceUpdate);
			
			Lambda declarada
			Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);
			list.forEach(cons);
			
			Lamda inline
			list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
			list.forEach(System.out::println);
		 */
		
//		Implementa interface
		list.forEach(new PriceUpdate());
		
//		Referência método
		list.forEach(System.out::println);

	}
}