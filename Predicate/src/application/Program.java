package application;

import java.util.ArrayList;
import java.util.List;

import entitites.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
						
	/*
		list.removeIf(p -> p.getPrice() >= 1000.00);
		 
		Ref�rencia de m�todo est�tico na classe product
		list.removeIf(Product::staticProductPredicate);

		Ref�rencia de m�todo n�o est�tico na classe product
		list.removeIf(Product::noStaticProductPredicate);

		L�mbida declarada
		Predicate<Product> pred = p -> p.getPrice() >= 1000.00;
		list.removeIf(pred);
		
		L�mbida inline
		list.removeIf(p -> p.getPrice() >= 1000.00);
	*/
				
		list.removeIf(new ProductPredicate());
		
		for (Product p : list) {
			System.out.println(p);
		}
		
	}
}