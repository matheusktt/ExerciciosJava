package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enums.Cargo;

public class Funcionario {
	
	private String nome;
	private Cargo cargo;
	private Double salarioBase;
	
	private Departamento departamento;
	private List<HorasContrato> contratos = new ArrayList<>();
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, Cargo cargo, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.cargo = cargo;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HorasContrato> getContratos() {
		return contratos;
	}
	
	public void adicionaContrato(HorasContrato contrato) {
		contratos.add(contrato);
	}
	
	public void removeContrato(HorasContrato contrato) {
		contratos.remove(contrato);
	}
	
	public double renda(int ano, int mes) {
		double salario = salarioBase;
		Calendar cal = Calendar.getInstance();
		
		for(HorasContrato c : contratos) {
			cal.setTime(c.getDate());
			int anoContrato = cal.get(Calendar.YEAR);
			int mesContrato = 1 + cal.get(Calendar.MONTH);
			if(ano == anoContrato && mes == mesContrato) {
				salario += c.valorTotal();
			}
		}
		return salario;
	}
}
