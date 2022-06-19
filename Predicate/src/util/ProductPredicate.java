package util;

import java.util.function.Predicate;

import entitites.Product;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 1000;
	}
}