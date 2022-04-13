package entidades;

public class Conta {
	
	private Integer numeroConta;
	private String titularConta;
	private double saldoConta;
	
	public Conta() {
		
	}

	public Conta(Integer numeroConta, String titularConta, Double deposito) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		depositar(deposito);
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

	public Double getSaldoConta() {
		return saldoConta;
	}
	
	public Double depositar(double valor) {
		return saldoConta += valor;
	}

	@Override
	public String toString() {
		return "Numero da Conta: " + numeroConta + ", Titular da Conta: " + titularConta + ", Saldo da Conta: R$" + String.format("%.2f", saldoConta);
	}
}
