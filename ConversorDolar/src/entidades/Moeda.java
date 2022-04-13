package entidades;

public class Moeda {
	
	private double cotacaoAtual;
	private double dolar;
	
	public Moeda() {
		
	}
	
	public Moeda(double cotacaoAtual, double dolar) {
		this.cotacaoAtual = cotacaoAtual;
		this.dolar = dolar;
	}

	public double getCotacaoAtual() {
		return cotacaoAtual;
	}

	public void setCotacaoAtual(double cotacaoAtual) {
		this.cotacaoAtual = cotacaoAtual;
	}

	public double getDolar() {
		return dolar;
	}

	public void setDolar(double dolar) {
		this.dolar = dolar;
	}
	
	public double converteDolar (double cotacaoAtual, double dolar) {
		 double conversor = cotacaoAtual * dolar;
		 return conversor;
	}
	
	@Override
	public String toString () {
		return "Conversão do dólar para o real: R$ " + String.format("%.2f", converteDolar(cotacaoAtual, dolar));
	}
}
