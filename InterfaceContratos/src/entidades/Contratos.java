package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contratos {
	
	private Integer numeroContrato;
	private Date data;
	private Double valorTotal;
	
	List<Parcelas> parcelas = new ArrayList<Parcelas>();
	
	public Contratos() {

	}

	public Contratos(Integer numeroContrato, Date data, Double valorTotal) {
		this.numeroContrato = numeroContrato;
		this.data = data;
		this.valorTotal = valorTotal;
	}

	public Integer getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Integer numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Parcelas> getParcelas() {
		return parcelas;
	}	
}