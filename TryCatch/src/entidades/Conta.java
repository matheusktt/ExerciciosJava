package entidades;

import excecoes.ExcecoesConta;

public class Conta {
	
	private Integer numeroConta;
	private String titularConta;
	private Double saldoConta;
	private Double limiteSaque;
	
	public Conta() {
		
	}

	public Conta(Integer numeroConta, String titularConta, Double saldoConta, Double limiteSaque) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		this.saldoConta = saldoConta;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public Double getSaldoConta() {
		return saldoConta;
	}
	
	public void depositar(double valorDeposito) {
		saldoConta += valorDeposito;
	}
	
	public void sacar(double valorSaque) {
		validaSaque(valorSaque);
		saldoConta -= valorSaque;
	}
	
	private void validaSaque(double valorSaque) {
		if(valorSaque > getLimiteSaque()) {
			throw new ExcecoesConta("Erro de saque: A quantia excede o limite de saque");
		}
		if (valorSaque > getSaldoConta()) {
			throw new ExcecoesConta("Erro de saque: Saldo insuficiente");
		}
	}
}