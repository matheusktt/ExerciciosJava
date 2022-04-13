package entidades;

public class ProdutoImportado extends Produto {
	
	private Double taxaImportacao;

	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double taxaImportacao) {
		super(nome, preco);
		this.taxaImportacao = taxaImportacao;
	}

	public Double getTaxaImportacao() {
		return taxaImportacao;
	}

	public void setTaxaImportacao(Double taxaImportacao) {
		this.taxaImportacao = taxaImportacao;
	}
	
	public Double valorTotal() {
		return preco + taxaImportacao;
	}
	
	@Override 
	
	public String etiquetaPreco() {
		return nome + ", R$" + String.format("%.2f", valorTotal()) + " Taxa de importção: R$" + String.format("%.2f", taxaImportacao);
	}
}