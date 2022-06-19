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
		 	Refer�ncia m�todo est�tico
			list.forEach(Product::staticPriceUpdate);
			
			Refer�ncia m�todo n�o est�tico
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
		
//		Refer�ncia m�todo
		list.forEach(System.out::println);

	}
}