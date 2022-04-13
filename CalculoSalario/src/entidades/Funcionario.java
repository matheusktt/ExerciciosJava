package entidades;

public class Funcionario {
	
	private String nome;
	private Double salarioBase;
	private Double imposto;
	
	public Funcionario() {

	}

	public Funcionario(String nome, double salarioBase, double imposto) {
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public String getNome() {
		return nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double salarioLiquido() {
		double salario = salarioBase; 
		return salario -= salario * imposto / 100;
	}

	public double aumentoSalarial(double porcentagem) {
		double salario = salarioLiquido();
		salario += salario * porcentagem / 100;
		return salario;
	}
}
