package entidades;

public class ContaPoupanca extends Conta {

	private Double taxaJuros;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numeroConta, String titularConta, Double saldo, Double taxaJuros) {
		super(numeroConta, titularConta, saldo);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	//saldo declarado como protected na superclasse Conta
	public void atualizaSaldo() {
		saldo += saldo * taxaJuros;
	}
	
	@Override
	public void sacar(Double valor) {
		saldo -= valor;
	}
}