package entidades;

public class Conta {
	
	private Integer numeroConta;
	private String titularConta;
	private Double saldo;
	
	public Conta() {
		
	}

	public Conta(Integer numeroConta, String titularConta, Double saldo) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		this.saldo = saldo;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void sacar(Double valor) {
		saldo -= valor;
	}
	
	public void depositar(Double valor) {
		saldo += valor;
	}

	@Override
	public String toString() {
		return "Conta: " + numeroConta + ", Titular Conta: " + titularConta + ", Saldo: R$" + String.format("%.2f", saldo);
	}
	
}
