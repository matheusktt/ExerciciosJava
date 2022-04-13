package entidades;

public class ContaEmpresarial extends Conta {
	
	private Double limiteEmprestimo = 1000.00;

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
}
