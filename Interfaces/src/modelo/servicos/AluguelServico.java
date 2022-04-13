package modelo.servicos;

import modelo.entidades.AluguelCarros;
import modelo.entidades.Fatura;

public class AluguelServico {
	
	private Double precoHora;
	private Double precoDia;
	
	private TaxaServico taxaServico;

	public AluguelServico(Double precoHora, Double precoDia, TaxaServico taxaServico) {
		this.precoHora = precoHora;
		this.precoDia = precoDia;
		this.taxaServico = taxaServico;
	}
	
	public void processaFatura(AluguelCarros aluguelCarros) {
//		diferenca entre as datas e converter para horas (milisegundos)
		long t1 = aluguelCarros.getInicio().getTime();
		long t2 = aluguelCarros.getFim().getTime();
//		diferenca em horas /converte para segundos / minutos / horas
		double horas = (double)(t2 - t1) / 1000 / 60 / 60;
		
		double pagamentoBasico;
		
		if (horas <= 12.0) {
			pagamentoBasico = Math.ceil(horas) * precoHora;
		}
		else {
			pagamentoBasico = Math.ceil(horas / 24) * precoDia;
		}

		double taxa = taxaServico.taxa(pagamentoBasico);

		aluguelCarros.setFatura(new Fatura(pagamentoBasico, taxa));
	}
}
