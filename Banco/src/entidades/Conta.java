package entidades;

public class Conta {
	
	private int numeroConta;
	private String nomeTitularConta;
	private double saldoConta;
	
	public Conta() {

	}

	public Conta(int numeroConta, String nomeTitularConta) {
		this.numeroConta = numeroConta;
		this.nomeTitularConta = nomeTitularConta;
	}
	
	public Conta(int numeroConta, String nomeTitularConta, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitularConta = nomeTitularConta;
		depositar(depositoInicial);
	}
	
	public String getNomeTitularConta() {
		return nomeTitularConta;
	}

	public void setNomeTitularConta(String nomeTitularConta) {
		this.nomeTitularConta = nomeTitularConta;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public Double getSaldoConta() {
		return saldoConta;
	}

	public void depositar(double valorDeposito) {
		saldoConta += valorDeposito;
	}
	
	public void sacar(double valorSaque) {
		saldoConta -= valorSaque + 5;
	}
	
	public String toString() {
		return "Conta " + numeroConta + ", Titular da conta: " + nomeTitularConta + ", Saldo Conta: R$ " + String.format("%.2f" ,saldoConta);
	}
	
}
