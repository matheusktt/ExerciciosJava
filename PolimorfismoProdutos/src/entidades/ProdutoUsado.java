package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date fabricacaoProduto;

	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, Double preco, Date fabricacaoProduto) {
		super(nome, preco);
		this.fabricacaoProduto = fabricacaoProduto;
	}

	public Date getFabricacaoProduto() {
		return fabricacaoProduto;
	}

	public void setFabricacaoProduto(Date fabricacaoProduto) {
		this.fabricacaoProduto = fabricacaoProduto;
	}
	
	@Override
	
	public String etiquetaPreco() {
		return nome + " (Usado), R$" + String.format("%.2f", preco) + " Data de Fabricação: " + sdf.format(fabricacaoProduto);
	}
	
}
