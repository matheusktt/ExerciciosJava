package entidades;

public class ContaEmpresarial extends Conta {
	
	private Double limiteEmprestimo;

	public ContaEmpresarial() {

	}

	public ContaEmpresarial(Integer numeroConta, String titularConta, Double saldo, Double limiteEmprestimo) {
		super(numeroConta, titularConta, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public void emprestimo(Double valor) {
		if(valor <= limiteEmprestimo) {
			depositar(valor);
		}
	}

	@Override
	public String toString() {
		return "Conta: " 
				+ getNumeroConta() 
				+ ", Titular Conta: " 
				+ getTitularConta() 
				+ ", Saldo: R$" 
				+ String.format("%.2f", getSaldo())
				+ ", Limite de Emprestimo Disponível: R$"
				+ String.format("%.2f", limiteEmprestimo);
	}
	
}
