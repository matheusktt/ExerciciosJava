package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelas {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date dataVencimento;
	private Double valorParcela;
	
	public Parcelas() {

	}

	public Parcelas(Date dataVencimento, Double valorParcela) {
		this.dataVencimento = dataVencimento;
		this.valorParcela = valorParcela;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}

	@Override
	public String toString() {
		return sdf.format(dataVencimento) + " - " + String.format("%.2f", valorParcela);
	}
}