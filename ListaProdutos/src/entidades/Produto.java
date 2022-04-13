package entidades;

public class Produto {
	
	private int id;
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto() {

	}

	public Produto(int id, String nome, double preco, int quantidade) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getId() {
		return id;
	}
	
	public String toString() {
		return "ID: " + getId() + ", nome: " + getNome() + ", preço: R$ " + String.format("%.2f", getPreco()) + ", quant: " + getQuantidade();
	}
}
