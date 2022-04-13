package entidades;

public class Emprestimo {
	private Double emprestimo;
	private Integer parcelas;
		
	public Emprestimo() {

	}

	public Emprestimo(Double emprestimo, Integer parcelas) {
		this.emprestimo = emprestimo;
		this.parcelas = parcelas;
	}

	public Double getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(Double emprestimo) {
		this.emprestimo = emprestimo;
	}

	public Integer getParcelas() {
		return parcelas;
	}

	public void setParcelas(Integer parcelas) {
		this.parcelas = parcelas;
	}
	
	public double calculaParcelas(Double emprestimo, Integer parcelas) {
		if (parcelas > 12) {
			return emprestimo / parcelas * (1.1);
		}
		else {
			return emprestimo / parcelas;
		}
	}

	@Override
	public String toString() {
		return "Emprestimo de R$" 
				+ String.format("%.2f", emprestimo) 
				+ ", parcelas de: R$" 
				+ String.format("%.2f", calculaParcelas(emprestimo, parcelas)) 
				+ " em " +  parcelas 
				+ "x";
	}	
}
