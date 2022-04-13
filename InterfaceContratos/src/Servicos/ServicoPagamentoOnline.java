package Servicos;

public interface ServicoPagamentoOnline {
	
	double TaxaPagamento(double valor);
	double juros(double valor, int meses);
}