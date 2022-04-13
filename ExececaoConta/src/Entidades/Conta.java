package Entidades;

import excecoes.ExcecaoConta;

public class Conta {
	
	private Integer numero;
	private String nome;
	private Double saldo;
	private Double saqueLimite;
	
	public Conta() {
		
	}

	public Conta(Integer numero, String nome,Double saldo, Double saqueLimite) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.saqueLimite = saqueLimite;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaqueLimite() {
		return saqueLimite;
	}

	public void setSaqueLimite(Double saqueLimite) {
		this.saqueLimite = saqueLimite;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void depositar(Double deposito) {
		saldo += deposito;
	}
	
	public void sacar(Double saque) {
		validaSaque(saque);
		saldo -= saque;
	}
	
	public void validaSaque(Double saque) {
		if (saque > getSaqueLimite()) {
			throw new ExcecaoConta("Erro de saque: A quantia excede o limite de saque.");
		}
		if (saque > getSaldo()) {
			throw new ExcecaoConta("Erro de saque: Saldo insuficiente.");
		}
	}
}
