package entidades;

public class PessoaJuridica extends Imposto{
	
	private Integer quantidadeFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer quantidadeFuncionarios) {
		super(nome, rendaAnual);
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}

	public Integer getQuantidadeFuncionarios() {
		return quantidadeFuncionarios;
	}

	public void setQuantidadeFuncionarios(Integer quantidadeFuncionarios) {
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}
	
	@Override
	public double imposto() {
		double calculoImposto = 0.0;
		if(quantidadeFuncionarios > 10) {
			calculoImposto = rendaAnual * 0.14;
		}
		else{
			calculoImposto = rendaAnual * 0.16;
		}
		return calculoImposto;
	}
}