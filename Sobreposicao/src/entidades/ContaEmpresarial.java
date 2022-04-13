package entidades;

public class ContaEmpresarial extends Conta {

	private Double limiteEmprestimo;

	public ContaEmpresarial() {
		super();
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
	public void sacar(Double valor) {
		super.sacar(valor);
		saldo -= 2.0;
	}
}