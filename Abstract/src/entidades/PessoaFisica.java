package entidades;

public class PessoaFisica extends Imposto{

	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double imposto() {
		double calculoImposto = 0.0;
		if(rendaAnual < 20000) {
			calculoImposto = (rendaAnual * 0.15) - (gastosSaude * 0.50);
		}
		else if(rendaAnual >= 20000 && gastosSaude > 0) {
			calculoImposto = (rendaAnual * 0.25) - (gastosSaude * 0.50);
		}
		return calculoImposto;
	}

}