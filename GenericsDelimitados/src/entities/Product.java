package entities;

public class Product implements Comparable<Product>{
	
	private String nome;
	private Double price;
	
	public Product(String nome, Double price) {
		this.nome = nome;
		this.price = price;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return nome + ", " + String.format("%.2f", price);
	}
	@Override
	public int compareTo(Product other) {
		return price.compareTo(other.getPrice());
	}
	
	
}
