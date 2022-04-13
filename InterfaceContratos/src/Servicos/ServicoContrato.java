package Servicos;

import java.util.Calendar;
import java.util.Date;

import entidades.Contratos;
import entidades.Parcelas;

public class ServicoContrato {
	
	private ServicoPagamentoOnline servicoPagamentoOnline;
	
	//construtuir irá receber no programa principal o serviço processado (paypal)
	public ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}
	
	public void processaContrato(Contratos contratos, int meses) {
		double parcelaBasica =  contratos.getValorTotal() / meses;
		for(int i = 1; i <= meses; i++) {
			// a cada parcela acrescenta o juros
			double atualizaTaxa = parcelaBasica + servicoPagamentoOnline.juros(parcelaBasica, i);
			double taxaTotal = atualizaTaxa + servicoPagamentoOnline.TaxaPagamento(atualizaTaxa);
			Date dataVencimento = adicionaMeses(contratos.getData(), i);
			contratos.getParcelas().add(new Parcelas(dataVencimento, taxaTotal));
		}
	}
	
	private Date adicionaMeses(Date data, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(Calendar.MONTH, N);
		return calendar.getTime();
	}
	
}