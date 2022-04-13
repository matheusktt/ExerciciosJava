package entidades;

public class FuncionarioTerceirizado extends Funcionario {
	private Double valorAdicional;

	public FuncionarioTerceirizado() {
		super();
	}

	public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double valorAdicional) {
		super(nome, horas, valorPorHora);
		this.valorAdicional = valorAdicional;
	}

	public Double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + valorAdicional * 1.1;
	}
}
