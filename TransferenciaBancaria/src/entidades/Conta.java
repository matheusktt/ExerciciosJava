package entidades;

import java.util.List;

public class Conta {
	
	private Integer id;
	private String titularConta;
	private Double saldoConta;
	
	public Conta() {
	
	}

	public Conta(Integer id, String titularConta, Double saldoConta) {
		this.id = id;
		this.titularConta = titularConta;
		this.saldoConta = saldoConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public Integer getId() {
		return id;
	}

	public Double getSaldoConta() {
		return saldoConta;
	}
	
	public boolean verificaId (Integer id, List<Conta> lista) {
		Conta conta = lista.stream().filter(verificaId -> verificaId.getId() == id).findFirst().orElse(null);
		return conta != null;
	}

	@Override
	public String toString() {
		return "Conta: " + id + ", Titular da Conta: " + titularConta + ", Saldo da Conta: R$" + String.format("%.2f", saldoConta);
	}	
	
}
